@file:Suppress("DEPRECATION")

package com.sathvika.optsleep
import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.fitness.Fitness
import com.google.android.gms.fitness.FitnessOptions
import com.google.android.gms.fitness.data.DataPoint
import com.google.android.gms.fitness.data.DataType
import com.google.android.gms.fitness.request.DataReadRequest
import java.util.concurrent.TimeUnit
import kotlin.math.max
import kotlin.math.min

class MainActivity : AppCompatActivity() {

    private val TAG = "SleepOptimization"
    private lateinit var tvSleepData: TextView
    private lateinit var tvSleepScore: TextView
    private lateinit var tvRecommendations: TextView
    private lateinit var btnFetchData: Button

    private val fitnessOptions = FitnessOptions.builder()
        .addDataType(DataType.TYPE_SLEEP_SEGMENT, FitnessOptions.ACCESS_READ)
        .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI elements
        tvSleepData = findViewById(R.id.tvSleepData)
        tvSleepScore = findViewById(R.id.tvSleepScore)
        tvRecommendations = findViewById(R.id.tvRecommendations)
        btnFetchData = findViewById(R.id.btnFetchData)

        btnFetchData.setOnClickListener {
            if (!GoogleSignIn.hasPermissions(GoogleSignIn.getLastSignedInAccount(this), fitnessOptions)) {
                GoogleSignIn.requestPermissions(
                    this,
                    0,
                    GoogleSignIn.getLastSignedInAccount(this),
                    fitnessOptions
                )
            } else {
                fetchAndDisplaySleepData()
            }
        }
    }

    private fun fetchAndDisplaySleepData() {
        val endTime = System.currentTimeMillis()
        val startTime = endTime - TimeUnit.DAYS.toMillis(7)

        val readRequest = DataReadRequest.Builder()
            .read(DataType.TYPE_SLEEP_SEGMENT)
            .setTimeRange(startTime, endTime, TimeUnit.MILLISECONDS)
            .build()

        Fitness.getHistoryClient(this, GoogleSignIn.getLastSignedInAccount(this)!!)
            .readData(readRequest)
            .addOnSuccessListener { response ->
                var totalSleepTime = 0L
                var interruptions = 0

                for (dataSet in response.dataSets) {
                    for (point in dataSet.dataPoints) {
                        totalSleepTime += calculateSleepDuration(point)
                        interruptions += countInterruptions(point)
                    }
                }

                val sleepScore = calculateSleepScore(totalSleepTime, interruptions)
                updateUI(totalSleepTime, sleepScore)
            }
            .addOnFailureListener { e ->
                Log.e(TAG, "Failed to fetch sleep data: ${e.message}")
            }
    }

    private fun calculateSleepDuration(point: DataPoint): Long {
        val start = point.getStartTime(TimeUnit.MILLISECONDS)
        val end = point.getEndTime(TimeUnit.MILLISECONDS)
        return end - start
    }

    private fun countInterruptions(point: DataPoint): Int {
        return point.dataType.fields.size // Example logic for counting interruptions
    }

    private fun calculateSleepScore(totalSleepTime: Long, interruptions: Int): Int {
        val hours = TimeUnit.MILLISECONDS.toHours(totalSleepTime)
        val idealSleepHours = 8
        val maxInterruptions = 3

        val durationScore = max(0, min(100, (hours / idealSleepHours.toDouble() * 100).toInt()))
        val interruptionScore = max(0, 100 - (interruptions * (100 / maxInterruptions)))
        return (0.7 * durationScore + 0.3 * interruptionScore).toInt()
    }

    @SuppressLint("SetTextI18n")
    private fun updateUI(totalSleepTime: Long, sleepScore: Int) {
        val hours = TimeUnit.MILLISECONDS.toHours(totalSleepTime)
        tvSleepData.text = "Total Sleep: $hours hours"
        tvSleepScore.text = "Sleep Score: $sleepScore"
        tvRecommendations.text = when {
            sleepScore >= 90 -> "Great job! Keep maintaining your sleep schedule."
            sleepScore in 70..89 -> "Good work, but try to minimize interruptions or increase sleep duration."
            else -> "Consider going to bed earlier and reducing screen time before sleep."
        }
    }
}

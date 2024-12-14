package com.sathvika.optsleep

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    private lateinit var tvSleepData: TextView
    private lateinit var tvSleepScore: TextView
    private lateinit var tvRecommendations: TextView
    private lateinit var googleSignInClient: GoogleSignInClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize GoogleSignInClient
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()
        googleSignInClient = GoogleSignIn.getClient(this, gso)

        tvSleepData = findViewById(R.id.tvSleepData)
        tvSleepScore = findViewById(R.id.tvSleepScore)
        tvRecommendations = findViewById(R.id.tvRecommendations)

        val totalSleepTime = intent.getLongExtra("totalSleepTime", 0L)
        val sleepScore = intent.getIntExtra("sleepScore", 0)

        updateUI(totalSleepTime, sleepScore)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_logout -> {
                logOut()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun logOut() {
        googleSignInClient.signOut().addOnCompleteListener {
            Log.d("MainActivity", "Logged out successfully")
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

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

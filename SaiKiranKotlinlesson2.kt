"C:\Program Files\Java\jdk-23\bin\java.exe" -Dkotlin.repl.ideMode=true -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 "@C:\Users\SAINUN~1\AppData\Local\Temp\idea_arg_file1179784180"

You’re running the REPL with outdated classes: Build module 'HelloKotln' and restart

Kotlin IDE REPL support is experimental. It may be slow or unstable. Please, report problems to https://youtrack.jetbrains.com/issues/KTIJ.
Welcome to Kotlin version 1.9.24-release-822 (JRE 23.0.1+11-39)
Type :help for help, :quit for quit


1. Explore the main() function

fun printHello() {
     println ("Hello World")
 }
 
 printHello()
Hello World

fun main(args: Array<String>) {
     println("Hello, world!")
 }

fun main(args: Array<String>) {
     println("Hello, ${args[0]}")
 }
Hello, Kotlin!

2. Learn why (almost) everything has a value


// Will assign kotlin.Unit
 val isUnit = println("This is an expression")
 println(isUnit)
This is an expressionkotlin.Unit
fun main() {
    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)
}
false

fun main() {
    val temperature = 10
    val message = "The water temperature is ${if (temperature > 50) "too warm" else "OK"}."
    println(message)
}
The water temperature is OK.

3. Learn more about functions

import java.util.*    // required import

fun feedTheFish() {
     val day = randomDay()
     val food = "pellets"
     println ("Today is $day and the fish eat $food")
 }
 
 fun main(args: Array<String>) {
     feedTheFish()
 }
 
 fun randomDay() : String {
     val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
         "Friday", "Saturday", "Sunday")
     return week[Random().nextInt(week.size)]
 }

fun fishFood (day : String) : String {
     var food = ""
     when (day) {
         "Monday" -> food = "flakes"
         "Tuesday" -> food = "pellets"
         "Wednesday" -> food = "redworms"
         "Thursday" -> food = "granules"
         "Friday" -> food = "mosquitoes"
         "Saturday" -> food = "lettuce"
         "Sunday" -> food = "plankton"
     }
     return food
 }
 
 fun feedTheFish() {
     val day = randomDay()
     val food = fishFood(day)
 
     println ("Today is $day and the fish eat $food")
 }
 
Today is Thursday and the fish eat granules

import java.util.*;
fun fishFood (day : String) : String {
     val food : String
     when (day) {
         "Monday" -> food = "flakes"
         "Wednesday" -> food = "redworms"
         "Thursday" -> food = "granules"
         "Friday" -> food = "mosquitoes"
         "Sunday" -> food = "plankton"
         else -> food = "nothing"
     }
     return food
 }
 

fun fishFood (day : String) : String {
     return when (day) {
         "Monday" -> "flakes"
         "Wednesday" -> "redworms"
         "Thursday" -> "granules"
         "Friday" -> "mosquitoes"
         "Sunday" -> "plankton"
         else -> "nothing"
     }
 }



import java.util.*    // required import
 
 fun randomDay() : String {
     val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
         "Friday", "Saturday", "Sunday")
     return week[Random().nextInt(week.size)]
 }
 
 fun fishFood (day : String) : String {
     return when (day) {
         "Monday" -> "flakes"
         "Wednesday" -> "redworms"
         "Thursday" -> "granules"
         "Friday" -> "mosquitoes"
         "Sunday" -> "plankton"
         else -> "nothing"
     }
 }
 
 fun feedTheFish() {
     val day = randomDay()
     val food = fishFood(day)
     println ("Today is $day and the fish eat $food")
 }
 
 fun main(args: Array<String>) {
     feedTheFish()
 }

4. Explore default values and compact functions

fun swim(speed: String = "fast") {
   println("swimming $speed")
}

swim()   // uses default speed
 swim("slow")   // positional argument
 swim(speed="turtle-like")   // named parameter
 
swimming fastswimming slowswimming turtle-like

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
     return when {
         temperature > 30 -> true
         dirty > 30 -> true
         day == "Sunday" ->  true
         else -> false
     }
 }


fun feedTheFish() {
     val day = randomDay()
     val food = fishFood(day)
     println ("Today is $day and the fish eat $food")
     println("Change water: ${shouldChangeWater(day)}")
 }
 
 
 Today is Thursday and the fish eat granules
Change water: false

fun isTooHot(temperature: Int) = temperature > 30
 
 fun isDirty(dirty: Int) = dirty > 30
 
 fun isSunday(day: String) = day == "Sunday"
 
 

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
     return when {
         isTooHot(temperature) -> true
         isDirty(dirty) -> true
         isSunday(day) -> true
         else  -> false
     }
 }

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean {
     ...

5. Get started with filters

val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

fun main() {
     println( decorations.filter {it[0] == 'p'})
 }
 
 [pagoda, plastic plant]
 
 fun main() {
     val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
 
     // eager, creates a new list
     val eager = decorations.filter { it [0] == 'p' }
     println("eager: $eager")
     // lazy, will wait until asked to evaluate
     val filtered = decorations.asSequence().filter { it[0] == 'p' }
     println("filtered: $filtered")
     // force evaluation of the lazy list
     val newList = filtered.toList()
     println("new list: $newList")
     
eager: [pagoda, plastic plant]
filtered: kotlin.sequences.FilteringSequence@386cc1c4
new list: [pagoda, plastic plant]   


val lazyMap = decorations.asSequence().map {
     println("access: $it")
     it
 }

println("lazy: $lazyMap")
 println("-----")
 println("first: ${lazyMap.first()}")
 println("-----")
 println("all: ${lazyMap.toList()}")
 
 
lazy: kotlin.sequences.TransformingSequence@654be52b-----access: rockfirst: rock-----access: rockaccess: pagodaaccess: plastic plantaccess: alligatoraccess: flowerpotall: [rock, pagoda, plastic plant, alligator, flowerpot]

val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
     println("access: $it")
     it
 }
 println("-----")
 println("filtered: ${lazyMap2.toList()}")
 
 
-----access: pagodaaccess: plastic plantfiltered: [pagoda, plastic plant]

val mysports = listOf("basketball", "fishing", "running")
 val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
 val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
 val mylist = listOf(mysports, myplayers, mycities)     // list of lists
 println("-----")
 println("Flat: ${mylist.flatten()}") 
 
 Flat: [basketball, fishing, running, LeBron James, Ernest Hemingway, Usain Bolt, Los Angeles, Chicago, Jamaica] 
 
 
 6. Get started with lambdas and higher-order functions
 
 var dirtyLevel = 20
val waterFilter = { dirty : Int -> dirty / 2}
println(waterFilter(dirtyLevel))
10   

val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
   return operation(dirty)
}

val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
println(updateDirty(30, waterFilter))
15

fun increaseDirty( start: Int ) = start + 1

println(updateDirty(15, ::increaseDirty))
16

var dirtyLevel = 19
dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
println(dirtyLevel)
42

 
 
 



import kotlin.time.Duration
import kotlin.time.ExperimentalTime

@ExperimentalTime // uso de annotation
    fun main() {
    // sampleStart
    val duration = Duration.milliseconds(120000)
    println("There are ${duration.inWholeSeconds} seconds in ${duration.inWholeMinutes} minutes") //sampleEnd
}
import kotlinx.coroutines.*
import java.util.*

fun main() = runBlocking {
    val job1 = launch {
        delay(5000)
        println("Звук первого будильника")
    }

    val job2 = launch {
        delay(7000)
        println("Звук второго будильника")
    }

    val job3 = launch {
        delay(10000)
        println("Звук третьего будильника")
    }

    job1.join()
    job2.join()
    job3.join()
}
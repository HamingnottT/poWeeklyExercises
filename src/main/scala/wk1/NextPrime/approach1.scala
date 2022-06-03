import scala.io.StdIn.readLine
import scala.collection.mutable.ArrayBuffer

object NextPrime {
    def isPrime(i :Int): Boolean = {
    
        if (i <= 1) false
        else if (i == 2) true
        else !(2 to (i-1)).exists(x => i % x == 0)
    
    }

    def getNextPrime(numInput: Int): Int = {
        
        val numListBuffer = ArrayBuffer[Int]()
        var result = 1

        for (i <- numInput to numInput + 20) {
            if (isPrime(i) == true) {
                numListBuffer += i
            }
        }
        return numListBuffer(0)
    }
    
    def main(args: Array[String]): Unit = {
        
        var numInput = readLine("Enter a number here: ").toInt
        println(getNextPrime(numInput))

        // DEBUG:
        // var numInput1 = 12
        // var numInput2 = 24
        // var numInput3 = 11

        // println(getNextPrime(numInput1))
        // println(getNextPrime(numInput2))
        // println(getNextPrime(numInput3))
    }
} 

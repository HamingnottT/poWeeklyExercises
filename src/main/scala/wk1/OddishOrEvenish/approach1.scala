import scala.io.StdIn.readLine
import scala.collection.mutable.ArrayBuffer

object OddishOrEvenish {

    def oddishOrEvenish(numInput: Int): String = {
        
        val numStringArray = numInput.toString.toArray
        val numArrBuffer = ArrayBuffer[Int]()
        var result = ""

        for (i <- numStringArray) numArrBuffer += i.asDigit

        if (numArrBuffer.sum % 2 == 1) result = "Oddish"
        else if (numArrBuffer.sum % 2 == 0) result = "Evenish"
        else result = "Interestingish"

        return result
    }

    def main(args: Array[String]): Unit = {
        val numInput = readLine("Please enter number: ").toInt
        println(oddishOrEvenish(numInput))
         
        // DEBUG: test cases
        // val numInput1 = 43
        // val numInput2 = 373
        // val numInput3 = 4433

        // println(oddishOrEvenish(numInput1))
        // println(oddishOrEvenish(numInput2))
        // println(oddishOrEvenish(numInput3))
    }
} 

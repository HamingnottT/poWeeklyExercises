import scala.io.StdIn.readLine
// import scala.util.matching.Regex
import scala.collection.mutable.ArrayBuffer

object DoubleSwap {
    def doubleSwap(strInput: String, swap1: String, swap2: String): String = {
        val strBuffer = ArrayBuffer[Char]()
        var result = ""

        for (i <- strInput) {
            if (i == swap1.charAt(0)) strBuffer += swap2.charAt(0) //i.toString.replace(i, swap2.charAt(0))
            else if (i == swap2.charAt(0)) strBuffer += swap1.charAt(0) //i.toString.replace(i, swap1.charAt(0))
            else strBuffer += i
        }
        
        result = strBuffer.mkString

        return result
    }

    def main(args: Array[String]): Unit = {
        // val strInput = readLine("Input string here: ")
        // val swap1 = readLine("Swap character: ")
        // val swap2 = readLine("With this: ")

        // println(doubleSwap(strInput, swap1, swap2))
        
        //  DEBUG: test cases
        println(doubleSwap( "aabbccc", "a", "b"))
        println(doubleSwap("random w#rds writt&n h&r&", "#", "&"))
        println(doubleSwap("128 895 556 788 999", "8", "9"))
    }
} 

import scala.io.StdIn.readLine
import scala.util.matching.Regex

object IsValidHex {
    def IsValidHexCode(hexInput: String): Boolean = {
        var result = false
        var isAllAlpha = "([a-fA-F])".r
 
        if (
            hexInput.length == 7 &
            hexInput(0) == '#' &
            hexInput.slice(1, (hexInput.length)).matches("[a-fA-F0-9]*") == true
        ) result = true
        
        return result
    }
    
    def main(args: Array[String]): Unit = {
        
        val stringInput = readLine("Input Hex code:")
        println(IsValidHexCode(stringInput))
        
        // DEBUG:
        // val hexInput1 = "#CD5C5C"
        // val hexInput2 = "#EAECEE"
        // val hexInput3 = "#eaecee"
        // val hexInput4 = "#CD5C58C"
        // val hexInput5 = "#CD5C5Z"
        // val hexInput6 = "#CD5C&C"
        // val hexInput7 = "CD5C5C"

        // println(IsValidHexCode(hexInput1))
        // println(IsValidHexCode(hexInput2))
        // println(IsValidHexCode(hexInput3))
        // println(IsValidHexCode(hexInput4))
        // println(IsValidHexCode(hexInput5))
        // println(IsValidHexCode(hexInput6))
        // println(IsValidHexCode(hexInput7))

    }
}

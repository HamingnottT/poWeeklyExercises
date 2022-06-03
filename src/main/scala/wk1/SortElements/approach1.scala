import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn._

object SortElements {
    def reorderDigits(arrayInput: Array[String], orderInput: String): String = {
        lazy val buffer = ArrayBuffer[String]()
        var resultSeq = ""
        if (orderInput == "asc") {

            for (i <- arrayInput) {
                buffer += i.sorted
            }
            resultSeq = buffer.toString().replaceAll("[^1-9,]", "").replace(",", " ")
            return resultSeq
            
        } else if (orderInput == "desc") {

            for (i <- arrayInput) {
                buffer += i.sorted.reverse
            }
            resultSeq = buffer.toString().replaceAll("[^1-9,]", "").replace(",", " ")
            return resultSeq

        } else {
            
            println("Incorrect input. Please type either 'asc' for ascending or 'desc' for descending.")
            val orderInput = readLine("Order of input (asc/desc): ").toLowerCase()
            reorderDigits(arrayInput, orderInput)
            
        }
    }

    def main(args: Array[String]): Unit = {
        // DEBUG Values
        // val numInput = "128 362 854"
        
        val numInput = readLine("Input array of numbers (separate by spaces): ").toString()
        val orderInput = readLine("Order of input (asc/desc): ").toLowerCase()
        val numArrayString = numInput.split("\\s+")
        
        println(reorderDigits(numArrayString, orderInput))
    }
}

/** Approach 1:
 * 
 * What's happening in this application?
 *  - function with input of an Array containing multiple strings of alphanumeric characters and String input defining the sorting order
 *  - if the string input meets a certain condition 'asc/desc' then the array is iterated through sorting each String item from smallest to largest or vice versa
 *      - this approach uses Scala's built in sort function
 *      - ArrayBuffer to build a new Array containing the sorted results
 *      - operation to strip all non alphanumeric characters to preserve the input format in the output string
 * 
 * 
 * Stored in container variables respecitvely:
 *  numInput = Number list inputs are taken as a string in the format "515 341 98 44 211"
 *  orderInput = Sorting order is also asked and input is in format "asc/desc"
 * 
 * because numInput is a whole string, a new container variable numArrayString was created with the operation to split whole string into an array by the delimiter of " "
 * to do this in Scala the .split() function was used with regex "\\s+", where '\s' is a space and '+' takes into account multiple instances of the space if any 
 * 
 * The reorderDigits function is set up in a way that it takes two inputs, numArrayString and orderInput
 *  this was because numArrayString is an Array with String datatype
 *  the alphanumeric string format was kept during these operations because in Scala it is much easier to iterate through and work with a set of strings versus integers
 * 
 * if the orderInput meets a certain condition "asc/desc", the function will iterate through the array and sort the alphnumeric strings respectively.
 *  an ArrayBuffer was used to append the sorting results
 * 
 * a container variable was used to store the result string with the following operations done to display the result in the inputted format:
 *  1. convert the ArrayBuffer to a string 
 *  2. strip all non-alphanumeric characters while preserving commas
 *  3. replace commas with spaces
 * 
 * The return type of the reorderDigits was set to type String
 * because a return type was declared it was important to use the println() function to display the result to the console
 * 
*/
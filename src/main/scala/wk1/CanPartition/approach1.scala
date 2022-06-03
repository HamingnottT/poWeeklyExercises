 import scala.collection.mutable.ArrayBuffer
 import scala.collection.mutable.ListBuffer
 
object CanPartition {

    def canPartition(arrayInput: Array[String]): Boolean = {

        lazy val iteratorBuffer = ArrayBuffer[String]()
        lazy val boolBuffer = ArrayBuffer[Boolean]()
        var accumulator = 1
        var result = false

        for (i <- arrayInput) {
            for (j <- arrayInput) {
                if (i != j) {
                    accumulator *= j.toInt
                }
            }
            boolBuffer += i.toInt == accumulator
            accumulator = 1
        }
        
        for (i <- boolBuffer) {
            if (i == true) result = true
        }
        return result
    }

    def main (args: Array[String]): Unit = {
        // DEBUG input
        // val numInput = "2 8 4 1"
        // val numInput = "-1 -10 1 -2 20"
        // val numInput = "-1 -20 5 -1 -2 2"
        
        val numInput = readLine("Input array of numbers (separate by spaces): ").toString()
        val numArrayString = numInput.split("\\s+")

        println(canPartition(numArrayString))
    }
}

/** Approach 1:
 * 
 * What's happening in this application?
 *  - function with input of an Array containing multiple strings of alphanumeric characters
 *  - the following steps of the function:
 *  1. to check whether a number in the array can be partitioned this approach uses nested for loops to:
 *      i. iterate through the list at each item 'i' of the first for-loop
 *      ii. if-conditional to check if the item of the second for-loop 'j' is equal to 'i'
 *          - the item of the second for loop 'j' is ignored if they are equal preventing redundancy
 *      iii. multiply each value 'j' (execept where 'j' == 'i') into an accumulator variable
 *      iv. append to a boolean ArrayBuffer an if-conditional checking if the accumulator product equals the i'th position of the array
 *      v. reset the accumulator to start another pass through the second for-loop
 *  2. iterate through the boolean ArrayBuffer checking if there are any 'true' values.
 *      - if there are 'true', return true in a result container variable, else return 'false'
*/
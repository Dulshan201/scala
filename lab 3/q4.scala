object sumOfEvenNumbers{

    def sumOfEven(numbers: List[Int]): Int = {
        if (numbers.isEmpty) {
            0
        } else {
            val head = numbers.head
            if (head % 2 == 0) {
                head + sumOfEven(numbers.tail)
            } else {
                sumOfEven(numbers.tail)
            }
        }
    }

    def main(args: Array[String]): Unit = {
        val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val sumEven = sumOfEven(inputList)
        println(s"The sum of even numbers in the list $inputList is: $sumEven")
    }

}
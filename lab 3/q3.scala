object ArithmeticMean {
  def calculateArithmeticMean(num1: Int, num2: Int): Double = {
    val mean = (num1.toDouble + num2) / 2.0
    val roundedMean = (mean*100).round/100.0
    roundedMean
  }

  def main(args: Array[String]): Unit = {
    val num1 = 10
    val num2 = 15
    val average = calculateArithmeticMean(num1, num2)
    println(s"The arithmetic mean of $num1 and $num2 is: $average")
  }
}

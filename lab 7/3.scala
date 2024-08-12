def isPrime(num : Int) : Boolean = {
  if (num <= 1) false
  else if(num == 2) true
  else {
    var isPrime = true
    for (i <- 2 until num if isPrime) {
      if (num % i == 0) isPrime = false
    }
    isPrime
  }
}

def filterPrime(numbers : List[Int]) : List[Int] = {
  numbers.filter(num => isPrime(num))
}

def main(args : Array[String]) = {
  val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val output = filterPrime(input)
  println(output)
}
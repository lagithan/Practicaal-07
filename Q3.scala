object IsPrime {

  def isPrime(num: Int): Boolean = {
    num match {
      case n if n <= 1 => false
      case 2 => true
      case n if n % 2 == 0 => false
      case _ => !(3 to math.sqrt(num).toInt by 2).exists(i => num % i == 0)
      
    }
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime)
  }

  def main(args: Array[String]): Unit = {
    val inputList: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(filterPrime(inputList))
  }
}

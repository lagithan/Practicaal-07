object EvenNumberFilter {

  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(_ % 2 == 0)
  }

  def main(args: Array[String]): Unit = {
    val inputList: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers: List[Int] = filterEvenNumbers(inputList)
    println(evenNumbers)
  }
}


object Q3 {
  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val outputList = filterPrime(inputList)
    println(outputList.mkString(","))
  }

    def filterPrime(inputList: List[Int]): List[Int] = {
    inputList.filter(number => number > 1 && (2 until number).forall(i => number % i != 0));
  }
  
}

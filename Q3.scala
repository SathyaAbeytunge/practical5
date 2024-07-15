object Q3 {
  def fibonacci(n: Int): Int = {
    if (n <= 1) n 
    else fibonacci(n - 1) + fibonacci(n - 2) 
  }

  def printFibonacci(n: Int): Unit = {
    def printSequence(count: Int, num: Int = 0): Unit = {
      if (count > 0) {
        print(fibonacci(num) + " ")
        printSequence(count - 1, num + 1)
      }
    }
    printSequence(n)
    println()
  }

  def main(args: Array[String]): Unit = {
    val n = 10 

    println(s"Printing $n Fibonacci numbers:")
    printFibonacci(n)
  }
}

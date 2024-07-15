import scala.io.StdIn.readLine

object Q1 {

  def getProductList(): List[String] = {
    var products = List[String]()
    var flag = true

    while (flag) {
      val product = readLine("Enter a product name (type 'done' to finish): ")
      if (product == "done") {
        flag = false
      } else {
        products = products :+ product
      }
    }

    products
  }

  def printProductList(products: List[String]): Unit = {
    for ((product, index) <- products.zipWithIndex) {
      println(s"${index + 1} - $product")
    }
  }

  def getTotalProducts(products: List[String]): Int = {
    products.length
  }

  def main(args: Array[String]): Unit = {
    val productList = getProductList()
    println("\nProduct List:")
    printProductList(productList)
    println(s"\nTotal number of products: ${getTotalProducts(productList)}")
  }
}

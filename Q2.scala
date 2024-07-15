case class Book(title: String, author: String, isbn: String)

object Q2{

  var books: Set[Book] = Set(
    Book("Secret Garden", "Lily Green", "2341"),
    Book("Lost in Time", "Jack Rivers", "0987"),
    Book("Starlight Dreams", "David Moon", "2334")
  )

  def addBook(newBook: Book): Unit = {
    if (books.exists(_.isbn == newBook.isbn)) {
      println(s"Book with ISBN ${newBook.isbn} already exists in the library.")
    } else {
      books += newBook
      println(s"Book '${newBook.title}' added to the library.")
    }
  }

  def removeBook(isbn: String): Unit = {
    if (books.exists(_.isbn == isbn)) {
      books = books.filterNot(_.isbn == isbn)
      println(s"Book with ISBN $isbn has been removed from the library.\n")
    } else {
      println(s"No book with ISBN $isbn found in the library.\n")
    }
  }

  def checkBook(isbn: String): Boolean = {
    books.exists(_.isbn == isbn)
  }

  def displayLibrary(): Unit = {
    println("Current Library Collection:")
    books.foreach { book =>
      println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}\n")
    }
  }

  def searchBookByTitle(title: String): Unit = {
    val bookExists = books.exists(_.title == title)
    if (bookExists) {
      books.foreach { book =>
        if (book.title == title) {
          println(s"Found Book - Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}\n")
        }
      }
    } else {
      println(s"No book with title '$title' found in the library.\n")
    }
  }

  def displayBooksByAuthor(author: String): Unit = {
    val authorExists = books.exists(_.author == author)
    if (authorExists) {
      println(s"Books by Author '$author':")
      books.foreach { book =>
        if (book.author == author) {
          println(s"Title: ${book.title}, ISBN: ${book.isbn}\n")
        }
      }
    } else {
      println(s"No books by author '$author' found in the library.\n")
    }
  }


  def main(args: Array[String]): Unit = {

    displayLibrary()

    addBook(Book("New World", "Lily Green", "7788"))

    removeBook("0987")

    checkBook("2341")

    searchBookByTitle("Starlight Dreams")

    displayBooksByAuthor("Lily Green")

    displayLibrary()
  }
}

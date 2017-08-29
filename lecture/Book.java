class Book {
  String title;
  String author;
  double price;
  int year;
  
  Book(String title, String author, double price, int year) {
    this.title = title;
    this.author = author;
    this.price = price;
    this.year = year;
  }
  
  public boolean equals(Object o) {
    if (o instanceof Book) {
      Book b = (Book) o;
        
      return
        this.title.equals(b.title) &&
        this.author.equals(b.author) &&
        this.price == b.price &&
        this.year == b.year;
      
    } else {
      return false;
    }
  }
}
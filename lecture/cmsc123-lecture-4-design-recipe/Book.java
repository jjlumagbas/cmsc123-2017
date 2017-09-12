class Book {
  Author author;
  String title;
  int year;  // published
  
  Book(Author author, String title, int year) {
    this.author = author;
    this.title = title;
    this.year = year;
  }
  
  // TEMPLATE
  /*   Fields:
   *     this.author   -- Author
   *     this.title    -- String
   * 
   *   Methods:
   * 
   *   Methods of author:
   *     this.author.equals()  -- boolean
   */
  
  // Book -> boolean
  // Returns true if this Book has the same author
  // as another book
  boolean sameAuthor(Book that) {    
    return this.author.equals(that.author);
    
    // TEMPLATE
    /*    this.author
     *    this.title
     * 
     *    that
     *    that.author
     *    that.title
     */
  }
 
  
  // TODO design a function publishedBefore that accepts a Book and
  //   returns true if this Book was published before the other 
  
  
}
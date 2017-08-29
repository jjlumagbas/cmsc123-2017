class Date {
  int month;
  int day;
  int year;
  
  Date(int m, int d, int y) {
    this.month = m;
    this.day = d;
    this.year = y;
  }
  
  public String toString() {
    return this.month + "/" + this.day + "/" + this.year;
  }
}
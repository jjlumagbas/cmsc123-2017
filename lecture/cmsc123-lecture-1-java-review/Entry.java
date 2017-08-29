class Entry {
  Date date;
  double distance;
  int duration;
  String feeling;
  
  Entry(Date date, double distance, int duration, String feeling) {
    this.date = date;
    this.distance = distance;
    this.duration = duration;
    this.feeling = feeling;
  }
  
  public String toString() {
    return 
      this.date.toString() + " " 
      + this.distance + " miles " 
      + this.duration + " minutes "
      + "feeling " + this.feeling;
  }
}
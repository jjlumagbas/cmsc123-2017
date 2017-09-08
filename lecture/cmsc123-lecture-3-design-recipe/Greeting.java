class Greeting {
  String greet;
  
  Greeting(String greet) {
    this.greet = greet;
  }
  
  //  -> String
  // converters the greeting to ALL CAPS 
  // with an exclamation point at the end!
  String yell() {
    return this.greet.toUpperCase() + "!"; 
  }
}
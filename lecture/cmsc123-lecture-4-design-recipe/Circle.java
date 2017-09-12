/* xSignature, purpose, stub
 * xExamples
 * Template
 * Body
 * Test and debug
 */

class Circle {
  Point p;
  int radius;
  
  Circle(Point p, int radius) {
    this.p = p;
    this.radius = radius;
  }
  
  // TEMPLATE
  /*   Fields:
   *     this.p       -- Point
   *     this.radius  -- int
   *   Methods:
   *     ...
   * 
   *   Methods of p: 
   *     this.p.translate()  -- Point
   */
  
  // design a method to translate a Circle,
  // given a distance x and y
  
  // int, int -> Circle
  // Produces a Circle that is a translation of this Circle,
  // given a distance x and y
  Circle translate(int x, int y) {
    return new Circle(this.p.translate(x, y), this.radius);
  }
}
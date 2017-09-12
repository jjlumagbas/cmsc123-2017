/* xSignature, purpose, stub
 * xExamples
 * xTemplate
 * xBody
 * xTest and debug
 */

class Point {
  int x;
  int y;
  
  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  // TEMPLATE
  /*  Fields:
   *    this.x   -- int
   *    this.y   -- int
   * 
   *  Methods:
   */
  
  // int, int -> Point
  // Produces a new point that is a translation of this Point
  // given a distance x and y
  Point translate(int x, int y) {
    return new Point(this.x + x, this.y + y);
  }
}

import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class GreetingTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testCreatedGreeting() {
    Greeting hi = new Greeting("hi");
   
    assertEquals("hi", hi.greet);
  }
  
  public void testYellHello() {
    Greeting hello = new Greeting("hello");
   
    assertEquals("HELLO!", hello.yell());
  }
  
}

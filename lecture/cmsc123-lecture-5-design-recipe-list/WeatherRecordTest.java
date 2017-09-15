import junit.framework.TestCase;

public class WeatherRecordTest extends TestCase {
  
  public void testIsRecordHighTrue() {
    TemperatureRange record = new TemperatureRange(42, 40);
    TemperatureRange today = new TemperatureRange(45, 40);
    
    WeatherRecord w = new WeatherRecord(today, record);
    
    assertEquals(true, w.highExceedsRecord());
  }
  
  public void testIsRecordHighFalse() {
    TemperatureRange record = new TemperatureRange(42, 40);
    TemperatureRange today = new TemperatureRange(42, 40);
    
    WeatherRecord w = new WeatherRecord(today, record);
    
    assertEquals(false, w.highExceedsRecord());
  }
  
  public void testHighExceedsHighOfFalse() {
    TemperatureRange record = new TemperatureRange(42, 40);
    TemperatureRange today = new TemperatureRange(42, 40);
    
    assertEquals(false, today.highExceedsHighOf(record));
  }
  
  
  public void testHighExceedsHighOfTrue() {
    TemperatureRange record = new TemperatureRange(42, 40);
    TemperatureRange today = new TemperatureRange(45, 40);
    
    assertEquals(true, today.highExceedsHighOf(record));
  }
}

class WeatherRecord {
  TemperatureRange today;
  TemperatureRange record;
  
  WeatherRecord(TemperatureRange today, TemperatureRange record) {
    this.today = today;
    this.record = record;
  }
  
  // TEMPLATE
  /*   
   * Fields:
   *   this.today  -- TemperatureRange
   *   this.record -- TemperatureRange
   * 
   * Methods:
   *   this.highExceedsRecord()  -- boolean
   * 
   * Methods on today:
   * 
   * 
   */
  
  // -> boolean
  // Returns true if today's high of this WeatherRecord is greater
  // than the record high
  boolean highExceedsRecord() {
    return this.today.highExceedsHighOf(this.record);
  }
}

class TemperatureRange {
  int high;
  int low;
  
  TemperatureRange(int high, int low) {
    this.high = high;
    this.low = low;
  }
  
  // TEMPLATE
  /*  Fields:
   *    this.high   -- int
   *    this.low    -- int
   * 
   *  Methods:
   *    highExceedsHighOf(TemperatureRange that)   -- boolean
   */
  
  // TemperatureRange -> boolean
  // Return true if the high of this TemperatureRange
  // exceeds the high of another TemperatureRange
  boolean highExceedsHighOf(TemperatureRange that) {
    return this.high > that.high;
  }
}
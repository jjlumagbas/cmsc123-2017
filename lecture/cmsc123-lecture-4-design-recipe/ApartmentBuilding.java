class ApartmentBuilding {
  boolean apartments[] = new boolean[5];
  
  ApartmentBuilding(boolean a, boolean b, boolean c, boolean d, boolean e) {
    this.apartments[0] = a;
    this.apartments[1] = b;
    this.apartments[2] = c;
    this.apartments[3] = d;
    this.apartments[4] = e;
  }
  
  // TEMPLATE
  /*   Fields:
   *     this.apartments
   * 
   */
  
  // -> int
  // Counts the number of empty apartments in this ApartmentBuilding
  int available() {  
    int availableApartments = 0;
    for (int i = 0; i < this.apartments.length; i++) {
      if (apartments[i]) {
        availableApartments++;
      }
    }
    return availableApartments;
  }
  
}
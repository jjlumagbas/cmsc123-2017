#include <stdio.h>

// Design a function that computes the cube of a number

// int -> int
// Accepts an integer and returns the cube of the integer
int cubed(int n) {
  return n * n * n;
}


// Design a function that determines the larger of two numbers

// int, int -> int
// Compares a and b, and returns the larger of the two numbers
int max(int a, int b) {
  if (a > b) {
    return a;
  } else {
    return b;
  }
}

// Design a function that accepts the regular price of an item,
// and produces the sale price given a 15% off sale

#define SALE 0.15

// double -> double
// Returns the price of an item, reduced by 15%
double salePrice(double itemPrice) {
  return itemPrice - (SALE * itemPrice);
}

/*

Design recipe:

1. Signature (Type contract), Purpose (Description), Stub (Header)
2. Examples
3. Template, inventory, define constants
4. Body
5. Test and debug

*/
// Design a function that returns the sale price of an item,
// given the item's price and the sale percentage.
// Only apply the sale if the item price exceeds 1000

#define SALE_LIMIT 1000

// double, double -> double
// Returns the price of an item, reduced by the given sale percentage
double computeSalePrice(double price, double sale) {
  return price - (sale * price);
}

// double, double -> double
// Given the item price and sale percentage, apply the
// sale to the item price if price exceeds 1000, otherwise
// return the original price
double salePrice1000(double price, double sale) {
  if (price > SALE_LIMIT) {
    return computeSalePrice(price, sale);
  } else {
    return price;
  }
}


#define FARE_BASE 7.0
#define FARE_DISCOUNT 6.0
#define DIST_BASE 5.0
#define EXCESS_FARE 0.5

double excessDistance(double distance) {
  if (distance <= DIST_BASE) {
    return 0;
  } else {
    return distance - DIST_BASE;
  }
}

double computeFare(int passengers, double fare, int distance) {
  return passengers * (fare + (excessDistance(distance) * EXCESS_FARE)) ;
}

double totalFare(int total, int discount, double distance) {
  return computeFare(total - discount, FARE_BASE, distance)
    + computeFare(discount, FARE_DISCOUNT, distance);
}

// double, int, int, double -> double
// Returns the change, given the paid fare, total number of passengers,
// number of passengers with discount, and the trip distance
double fareChange(double paid, int total, int discount, double distance) {
  return paid - totalFare(total, discount, distance);
}

int main() {
  printf("---\n");
  printf("%f == %f\n", fareChange(10, 1, 0, 5), 3.0);
  printf("%f == %f\n", fareChange(10, 1, 1, 5), 4.0);
  printf("%f == %f\n", fareChange(20, 2, 1, 5), 7.0);
  printf("%f == %f\n", fareChange(10, 1, 0, 6), 2.5);
  printf("%f == %f\n", fareChange(10, 1, 0, 7), 2.0);
  printf("%f == %f\n", fareChange(10, 1, 1, 6), 3.5);
  printf("%f == %f\n", fareChange(10, 1, 1, 7), 3.0);

  printf("---\n");
  printf("%f == %f\n", computeSalePrice(800, 0.10), 720.0);
  printf("%f == %f\n", computeSalePrice(1500, 0.10), 1350.0);

  printf("---\n");
  printf("%f == %f\n", salePrice1000(800, 0.10), 800.0);
  printf("%f == %f\n", salePrice1000(1500, 0.10), 1350.0);
  printf("%f == %f\n", salePrice1000(1000, 0.10), 1000.0);
  printf("%f == %f\n", salePrice1000(1001, 0.10), 900.9);
  printf("%f == %f\n", salePrice1000(999, 0.10), 999.0);

  printf("---\n");
  printf("%f == %f\n", salePrice(100), 85.0);
  printf("%f == %f\n", salePrice(105), 89.25);
  printf("%f == %f\n", salePrice(105.85), 89.97);

  printf("---\n");
  printf("%d == %d\n", max(1, 2), 2);
  printf("%d == %d\n", max(2, 1), 2);
  printf("%d == %d\n", max(2, 2), 2);
  printf("%d == %d\n", max(2, -2), 2);
  printf("%d == %d\n", max(-1, -2), -1);

  printf("---\n");
  printf("%d == %d\n", cubed(3), 27);
  printf("%d == %d\n", cubed(0), 0);
  printf("%d == %d\n", cubed(-2), -8);


  return 0;
}

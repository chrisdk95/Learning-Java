// Build a PrimeDirective.java program that creates an ArrayList of all prime numbers in an array.
// Import statement:
import java.util.ArrayList;
class PrimeDirective {
  
  // Add your methods here:
  public boolean isPrime(int number) {
    // 2 is the smallest prime number.
    if (number == 2) {
      return true;
    }
    // prime cannot be less than 2
    else if (number < 2) {
      return false;
    }
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false; //number is not prime
    } 
  }
       return true; //number isn’t divisible by any two smaller integers.
}
  // ArrayList of the prime numbers in the numbers array.
  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    // new empty ArrayList called primes to store all the prime numbers that are found.
    ArrayList<Integer> primes = new ArrayList<Integer>();
    // find all of the primes in an array
    for (int number : numbers) {
      if (isPrime(number)) {
        primes.add(number); // add prime numbers to primes
      }
    }
    return primes;
  }
  //checks odds or evens
  public String isOddOrEven(int number) {
    if (number % 2 == 0) {
      return "Even";
    }
    else {
      return "Odd";
    }
  }
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    //Test
    System.out.println(pd.isPrime(7));
    System.out.println(pd.isPrime(28));
    System.out.println(pd.isPrime(2));
    System.out.println(pd.isPrime(0));
    System.out.println(pd.onlyPrimes(numbers));
    System.out.println(pd.isOddOrEven(67));
  }  
}

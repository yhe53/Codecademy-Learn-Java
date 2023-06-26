import java.util.ArrayList;
/* Your prime directive: Build a PrimeDirective.java program that creates an ArrayList of all prime numbers in an array. */

class PrimeDirective {
  
  // Add your methods here:
  public boolean isPrime(int number) {
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    if (number < 2) {
      return false;
    }
    return true;
  }

  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    ArrayList<Integer> primes = new ArrayList<>();
    for (int number : numbers) {
      if (isPrime(number)) {
        primes.add(number);
      }
    }
    return primes;
  }
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    System.out.println(pd.isPrime(7));
    System.out.println(pd.isPrime(28));
    System.out.println(pd.isPrime(2));
    System.out.println(pd.isPrime(0));
    System.out.println(pd.onlyPrimes(numbers));
  }  

}
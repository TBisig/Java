public class FizzBuzz {
    public void fizzBuzz(int num) {
        if((num % 5) == 0 && (num % 3) == 0) {
            System.out.println("FizzBuzz");
        }
        else if(num % 5 == 0) {
            System.out.println("Buzz");
        }
        else if(num % 3 == 0) {
            System.out.println("Fizz");
        }
        else{
            System.out.println(num);
        }
    }
}

import java.util.Scanner; //here we import class Scanner from package java.util for use Scsnner to input nums from console

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //creating object sc to input nums from console
        int n=sc.nextInt(); //input n num
        sc.close();//close the scanner

        System.out.print(factorial(n)); //send n to factorial function and print the returned result
    }

    public static int factorial(int n){ //create factorial function with a sent n value
        if(n==1 || n==0){ //since factorial of 0 and 1 always equal to 1, do a specific condition for that
            return 1;
        }
        return n*factorial(n-1); //recursion since it will be recall function until it will reach 0
    }
}
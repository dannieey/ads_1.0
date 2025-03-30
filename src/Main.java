import java.util.Scanner; //here we import class Scanner from package java.util for use Scsnner to input nums from console

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //creating object sc to input nums from console
        int n=sc.nextInt(); //input n num
        sc.close();//close the scanner

        System.out.print(fib(n)); //send n to fib function and print the returned result
    }

    public static int fib(int n){
        if(n==1) return 1; //since fib list starts with 0 1 1 2 3 5 ..., for first two elements there is no pattern, so we create a specific conditions for them
        if(n==0) return 0;


        return fib(n-1)+fib(n-2); //as said in pr5, the nth num in fib list equals to fun(n-1)+fib(n-2)


    }
}
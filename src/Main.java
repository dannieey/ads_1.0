import java.util.Scanner; //here we import class Scanner from package java.util for use Scsnner to input nums from console

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //creating object sc to input nums from console
        int a=sc.nextInt(); //input a num
        int n=sc.nextInt(); //input n num
        sc.close();//close the scanner

        System.out.print(powNum(a,n)); //send n to fib function and print the returned result
    }

    public static int powNum(int a, int n){
        if (n==0) return 1; //any num to the power 0 equals to 1
        if(n==1) return a; //any num to the power 1 equals to itself

        return a*powNum(a, n-1);


    }
}
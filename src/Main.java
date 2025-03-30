import java.util.Scanner; //here we import class Scanner from package java.util for use Scsnner to input nums from console

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //creating object sc to input nums from console
        int a=sc.nextInt(); //input a num
        int b=sc.nextInt(); //input b num
        sc.close();//close the scanner

        System.out.print(gcd(a,b)); //send a and b to the function and print the result
    }

    public static int gcd(int a, int b){
        if(b==0) return a; // if b=0 so the gcd = a since 0/a=0 and a/a=1
        return gcd(b,a%b); //Euclidean Algorithm
    }
}
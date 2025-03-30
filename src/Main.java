import java.util.Scanner; //here we import class Scanner from package java.util for use Scsnner to input nums from console

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //creating object sc to input nums from console
        int n=sc.nextInt(); //input n num
        int k=sc.nextInt(); //input k num
        sc.close();//close the scanner

        System.out.print(binCoeff(n,k)); //send n and k to the function and print the result
    }

    public static int binCoeff(int n, int k){
        if(k==0 || k==n) return 1; //our exception from the task`s condition

        return binCoeff(n-1,k-1) + binCoeff(n-1, k); //splitting up


    }
}
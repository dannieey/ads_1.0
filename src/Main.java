import java.util.Scanner; //here we import class Scanner from package java.util for use Scsnner to input nums from console

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //creating object sc to input nums from console
        int n=sc.nextInt(); //input n num
        sc.close();//close the scanner

        if(isPrime(n)){ //checking the result (true/false) of function isPrime with n
            System.out.print("Prime");
        }
        else{
            System.out.print("Composite");
        }
    }

    public static Boolean isPrime(int n){
        if (n<2){
            return false;
        }
        for(int i=2; i*i<=n; i++){ //starting with i=2 (because of the condition of the prime num divisors) till i*i<=n (because another half interval is repetitive if divisors)
            if(n%i==0){ //if the num is divided by i that ruins the prime num conditions (because i=2)
                return false;
            }

        }
        return true;
    }
}
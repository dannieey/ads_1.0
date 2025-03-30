import java.util.Scanner; //here we import class Scanner from package java.util for use Scsnner to input nums from console

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //creating object sc to input nums from console
        int n=sc.nextInt(); //input n value (arr`s size)
        int[] arr = new int[n]; //creating array with size n (with integers)
        for(int i=0; i<n; i++){ //running from zero element till the end (n-1) (here they are still empty)
            arr[i]=sc.nextInt(); //input these values from console (now each has its own value)
        }
        System.out.print(findAvg(arr)); //print the result of findAvg function (and we are sending our created array to that function)
        sc.close();//close the scanner
    }

    public static double findAvg(int[] arr){
        if(arr.length==0){ //check if the array is empty
            throw new IllegalArgumentException("empty array"); //if yes we throw an exception and output "empty array" statement
        }
        int sum=0; //creating variable sum that counts all array`s elements
        for(int i=0; i<arr.length; i++){
            sum+=arr[i]; //add each element of the array into sum variable
        }
        return (double) sum/arr.length; //return double value(avg) of sum divided by n

    }
}
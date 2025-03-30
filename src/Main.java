import java.util.Scanner; //here we import class Scanner from package java.util for use Scsnner to input nums from console

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //creating object sc to input nums from console
        String s =sc.nextLine(); //input the string through console
        sc.close();//close the scanner

        if(onlyDigits(s)){ //based on the result of the function onlyDigits, print yes/no
                System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }

    public static boolean onlyDigits(String s){
        for(int i=0; i<s.length(); i++){ //running through the given string //time complexity O(n)
            if(!Character.isDigit(s.charAt(i))){ //checking if the character is not a digit
                return false; //if any char is not a digit, return a false
            }
        }
        return true; //if all characters are digits, return true
    }
}

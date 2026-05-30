import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        checkPalin(str);
    }

    static void checkPalin(String str){
        String s = ""; // Declaring and initializing a empty string to store the reverse string.
        for(int i = str.length()-1; i >= 0; i--){
            s += str.charAt(i);
        }
        if(s == str){
            System.out.println("Yes, "+str+ " is a Palindrome string");
        }
        else{
            System.out.println("No, "+str+ " is NOT a Palindrome string");
        }
}
}


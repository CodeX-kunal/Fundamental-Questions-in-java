import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        checkPalin(num);
    }

    static void checkPalin(int num){

        int palin = 0;
        int x = num;
        int remainder = 0;
        while(x > 0){

            remainder = x % 10;
            x = x/10;
            palin = palin*10 + remainder;
        }

        if(palin == num){
            System.out.println("Yes, "+num+ " is a Palindrome number");
        }
        else{
            System.out.println("No, "+num+ " is NOT a Palindrome number");
        }
    }
}
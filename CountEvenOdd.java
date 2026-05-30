import java.util.Scanner;
import java.util.Arrays;
public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println(Arrays.toString(count(num)));
    }
    static int[] count(int num){
        int even = 0;
        int odd = 0;
        int remainder = 0;
        if(num % 10 == 0){
            if(num % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        while(num%10 != 0){
            remainder = num % 10;
            num /= 10;
            if(remainder%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        return new int[]{even,odd};
    }
}

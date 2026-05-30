import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println(countDigits(num));
    }
    static int countDigits(int num){
        int count = 0;
        if(num%10 == 0){
            count++;
            return count;
        }
        while(num%10 != 0 ){
            num = num / 10;
            count++;
        }
        return count;
    }
}

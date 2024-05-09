import java.util.*;
public class OddNumbers {
    public static void main(String[]args){
        String input ="Enter you number to get all the sum of Odd numbers:";
        Scanner sc = new Scanner(System.in);
        System.out.println(input);
        int n = sc.nextInt();
        SumOfOddNumbers(n);
    }
    public static void SumOfOddNumbers(int n){
        int sumOfOddNumbers = 0;
        for(int i = 0; i<n;i++){
            if(i%2!=0){
                sumOfOddNumbers += i;
                System.out.println(i);
            }
        }
        System.out.println("Sum of odd numbers  is:" +  sumOfOddNumbers);
    }
}

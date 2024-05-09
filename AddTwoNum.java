import java.util.*;
public class AddTwoNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input ="Enter your number:";
            System.out.print(input);
            int n = sc.nextInt();

            int sum = 0;
            for(int i=0;i<=n; i++){
                sum= sum+i;
            }
            System.out.println("Sum of first "+n+" natural numbers is : " +sum);

            try (// printing Table of Numbers
            Scanner numsc = new Scanner(System.in)) {
                System.out.print(input);
                int num = numsc.nextInt();

                for(int i=1;i<=10; i++){
                    System.out.println(num*i);
                }
            }
        }
    }

}

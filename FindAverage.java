public class FindAverage {
        public static void main(String[]args){
            Average(10,20,15);
        }
        public static void Average(int num1,int num2,int num3){
            int sum = num1 + num2 + num3;
            float avg = sum / 3f;
            System.out.println("The average of " + num1 + ", " + num2 +", " + num3 +"is = " +avg);
        }
    }

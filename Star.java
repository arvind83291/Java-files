public class Star {

    //star pattern 
    public static void main(String[]args){

        System.out.println("patterns of Stars ");
        int n = 4;
        int m = 5;
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        };
        System.out.println("Hallow pattern of Star ");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||j==1|| i==n||j==m){
                    System.out.print("*"); 
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        // 3rd pattern
        System.out.println("half pyramid");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //3rd pattern
      System.out.println("oppsite of half pyramid");
      for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
    //4th pattern
    System.out.println("Inverted half pyramid");
    for(int i = 1; i<=n; i++){
        for(int j=1; j<=n-1;j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
    System.out.println(" ");
    }

    // 5th pattern
    System.out.println(" opposite Inverted half pyramid");
    for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println(" ");  
    }
    // 6th Number patterns
    System.out.println(" Number patterns");
    for(int i = 1;i<=m;i++){
        for(int j = 1;j<=i;j++){
            System.out.print(j+ " ");
        }
        System.out.println("");
    }
    //7 th pattern opp half pyramid
    System.out.println("Number patterns");
    for (int i=1;i<=m;i++){
        for(int j=1;j<=m-i+1;j++){
            System.out.print(j+"  ");
        }
        System.out.println(" ");
    }
    //8 th pattern
    System.out.println("Numbers pyramid");
    int number = 1;
    for (int i = 1;i<=m;i++){
        for (int j = 1;j<=i;j++){
            System.out.print(number +" ");
            number++;
        }
        System.out.println("");
    }
    //01 bits pattern
    System.out.println("Bits pattern");
    for(int i = 1;i<=m;i++){
        for(int j=1;j<=i;j++){
            int sum = i+j;
            if(sum%2==0){
                System.out.print(1+" ");
            }else{
                System.out.print(0+" ");
            }
        }
        System.out.println("");
    }
    };
};

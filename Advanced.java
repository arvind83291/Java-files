public class Advanced {
    public static void main(String[]args){
        //Butter fly pattern
        int n= 5;
        //upper half
        for (int i=0;i<=n;i++){
            for (int j =0;j<=i;j++){
                System.out.print("*");
            };

            int spaces = 2*(n-i);
            for (int j =0;j<spaces;j++){
                System.out.print(" ");
            }

            for (int j=0; j<=i;j++){
                System.out.print("*");
            };
            System.out.println();
        }
        //Lower half
        for (int i=n;i>=1;i--){
            for (int j =0;j<=i;j++){
                System.out.print("*");
            };

            int spaces = 2*(n-i);
            for (int j =0;j<spaces;j++){
                System.out.print(" ");
            }

            for (int j=0; j<=i;j++){
                System.out.print("*");
            };
            System.out.println();
        }
    
     System.out.println("solid Rhombos");

        for(int i=1;i<=n;i++){
            
            for(int j=1; j<=n-i;j++) {
                System.out.print(" ");
            };
            for (int j=1;j<=n; j++){
                if(i==1 || i== n || j==1||j==n){

                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    System.out.println("numbers Pyramid");

    for (int i = 0; i<=n;i++){
        for(int j = 0;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    System.out.println("Palindromic pattern");
    for(int i =1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        };
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        for(int j=2;j<=i;j++){
            System.out.print(j); 
        }
        System.out.println();
    }
    System.out.println("Diamond pattern");
    for(int i =1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        };
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //lower part
    for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        };
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
};

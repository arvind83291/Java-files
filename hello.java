public class hello{
    static void agCheck(int age){
        if (age <18){
            System.out.println("you are not Elegible");
        }else if(age>45){
            System.out.println("you are senior  citizen");
        }else{
            System.out.println("you are Elegible congrats");
        }
    }
    public static void main(String[] args){
      agCheck(11);
    }
};


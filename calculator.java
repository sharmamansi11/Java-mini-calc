import java.util.Scanner;
public class calculator{
    public static void main(String[] args){

        System.out.println("enter your choice(1-4)");
        System.out.println("1 : Addition");
        System.out.println("2: Subraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("enter the first number:");
        int a = sc.nextInt();

        System.out.println("enter the second number:");
        int b = sc.nextInt();
       
        switch(choice) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                if(b==0){
                    System.out.println("division not possible ");
                }
                else{
                    System.out.println((double)a/b);
                
                }
                break;
            default:
                System.out.println("entered choice is invalid");
        }
        
    }
}
    


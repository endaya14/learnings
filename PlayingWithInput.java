import java.util.*;


public class PlayingWithInput {

    public static int addToNumbers(int x,int y){
        int sum = x + y;
        return sum;
    
    }
    public static void main(String[] args) {
        
        System.out.println("Proceed? Y/N");
        Scanner sc = new Scanner(System.in);
        String a;
        String b = "y";
        a = sc.next();
        do{
            System.out.println("Please input two numbers to add");
            System.out.print("Integer one :");
            Scanner first = new Scanner(System.in);
            int numbOne = first.nextInt();
            System.out.print("Integer two :");
            Scanner second = new Scanner(System.in);
            int numbTwo = second.nextInt();
            System.out.println("The answer is "+addToNumbers(numbOne, numbTwo));
            System.out.println("Proceed? Y/N");
            a = sc.next();
        }while(a.equals(b));
    }
}

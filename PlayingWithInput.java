import java.util.*;


public class PlayingWithInput {

    public static int addToNumbers(int x,int y){
        int sum = x + y;
        return sum;
    
    }
    public static int subtractToNumbers(int x, int y){
        int difference = x-y;
        return difference;

    }
    public static int multiplyToNumbers(int x, int y){
        int product = x*y;
        return product;

    }
    public static int divideToNumbers(int x, int y){
        int quotient = x/y;

        return quotient;

    }
    public static void main(String[] args) {
        
        System.out.println("Proceed? Y/N");
        Scanner sc = new Scanner(System.in);
        String a;
        String b = "y";
        a = sc.next();
        do{
            System.out.println("1 : Addition || 2 : Subtraction || 3 : Multiplication || 4 : Division");
            System.out.print("Please select Mathematical Operation to be used : ");
            Scanner ops = new Scanner(System.in);
            int operator = ops.nextInt();
            System.out.println("Please input two numbers");
            System.out.print("Integer one : ");
            Scanner first = new Scanner(System.in);
            int numbOne = first.nextInt();
            System.out.print("Integer two : ");
            Scanner second = new Scanner(System.in);
            int numbTwo = second.nextInt();
            switch (operator) {
                case 1:
                    System.out.println("The answer is " + addToNumbers(numbOne, numbTwo));
                    break;
                case 2:
                    System.out.println("The answer is " + subtractToNumbers(numbOne, numbTwo));
                    break;
                case 3:
                    System.out.println("The answer is " + multiplyToNumbers(numbOne, numbTwo));
                    break;
                case 4:
                    System.out.println("The answer is " + divideToNumbers(numbOne, numbTwo));
                    break;
                default:
                    System.out.println("Invalid Operator");
                    break;
            }
            System.out.println("Proceed? Y/N");
            a = sc.next();
        }while(a.equals(b));
    }
}


import java.util.Scanner;

public class NumberOfDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tries = 0;    
        while (tries < 3){
        System.out.print("===========================================");
        String[][] months = {
            {"1 : January ", "2 : February ", "3 : March "},
            {"4 : April ", "5 : May ", "6 : June "},
            {"7 : July ", "8 : August ", "9 : September "},
            {"10 : October ", "11 : November ", "12 : December "}
        };
        for (int k = 0; k < months.length; k++) {
            System.out.println();
            for (int q = 0; q < months[k].length; q++) {
                System.out.print(months[k][q] + " ");
            }
        }
        System.out.println();
        System.out.println("===========================================");
        System.out.println("Please Enter Month Number");
        Scanner inputX = new Scanner(System.in);
        int month = inputX.nextInt();
        int year = 1724;
        int numDays = 0;

        switch (month) {
            case 1:case 3:
            case 5:case 7:
            case 8:case 10:
            case 12:
                numDays = 31;
                break;
            case 4:case 6:
            case 9:case 11:
                numDays = 30;
                break;
            case 2:
                /*if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    numDays = 29;
                } else {
                    numDays = 28;
                } */
                numDays = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)? 29 : 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = " + numDays);
        tries++;
        
    } 
    }
}

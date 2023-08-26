import java.util.*;

public class Mini_Calculator 
{

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter first number: ");
        double First_number=s.nextDouble();
        System.out.println("Enter second number: ");
        double Second_number=s.nextDouble();
        System.out.println("Enter operator among +,-,/,% :");
        char operation=s.next().charAt(0);
        if(operation=='+'){
            System.out.println("Addition is: "+(First_number+Second_number));
        }
        else if (operation=='-') {
            System.out.println("Subtraaction is: "+(First_number-Second_number));
        }
        else if (operation=='/') {
            System.out.println("Division is: "+(First_number/Second_number));
        }
        else if (operation=='%') {
            System.out.println("Remainder is: "+(First_number%Second_number));
        }
        else{
            System.out.println("Invalid operator please enter valid operator");
        }
    }
}
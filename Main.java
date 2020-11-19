import java.util.Scanner;

public class Main{

    public static void math() {
        System.out.println("Hi There. This is a program to calculate the total cost of your meal at a restuarant.");
        
        System.out.println("Thank you.\nNow Please enter the price of the meal");
        Scanner input = new Scanner(System.in);
        double userInput = input.nextDouble();
        double listed_meal_price = userInput;
        
        System.out.println("Please enter the tip rate. Please exclude the % symbol.");
        Scanner input_2 = new Scanner(System.in);
        double userInput_2 = input.nextDouble();
        double tipRate = (userInput_2 / 100);
        
        System.out.println("Please enter the tax rate. Please exclude the % symbol.");
        Scanner input_3 = new Scanner(System.in);
        double userInput_3 = input.nextDouble();
        double taxRate = (userInput_3 / 100);
        
        double tip = tipRate * listed_meal_price;
        double tax = taxRate * listed_meal_price;
        double result = tip + tax + listed_meal_price;
                
        System.out.format("The total cost of your meal is : %.2f", result);
    }
    public static void main(String []args) {
        math();
    }
}
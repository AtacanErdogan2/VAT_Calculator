import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        double price, vat;

        // Retrieving data from the user
        System.out.print("Please enter the price :");
        price = input.nextDouble();

        // Calculation Section
        vat = (price < 1000) ? 0.18 : 0.08;

        System.out.println("Price without VAT : " + price);
        System.out.println("Price with VAT : " + (price + price * vat));
        System.out.println("VAT amount : " + Math.round(price * vat * 100) / 100d);

    }
}
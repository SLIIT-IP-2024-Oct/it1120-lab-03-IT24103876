import java.util.Scanner;

public class IT24103876Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

              System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

              System.out.print("Enter the number of kilograms you want to buy: ");
        int kilograms = scanner.nextInt();

                double totalAmount = pricePerKg * kilograms;

              double discount = totalAmount * 0.10;

             double amountToPay = totalAmount - discount;

      
        System.out.println("Total amount : RS" + totalAmount);
        System.out.println("Discount (10%): RS" + discount);
        System.out.println("Amount to pay discount price: RS" + amountToPay);

              scanner.close();
    }
}

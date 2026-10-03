import java.util.Scanner;

public class WaterBilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter water consumption in litres: ");
        double consumption = scanner.nextDouble();

        double bill;
        if (consumption <= 500) {
            bill = 100.0;
        } else {
            bill = 200.0;
        }

        System.out.println("Total Water Bill: Rs. " + bill);

        scanner.close();
    }
}
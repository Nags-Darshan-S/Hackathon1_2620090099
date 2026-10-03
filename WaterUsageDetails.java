import java.util.Scanner;

public class WaterUsageDetails {
    public static void main(String[] args) {
        
        int familyMembers = 4;
        double waterConsumedLitres = 450.75;
        int houseNumber = 102;
        char usageStatus = 'N'; 

        
    
        System.out.println("--- Household Details ---");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Number of Family Members: " + familyMembers);
        System.out.println("Water Consumed (in Litres): " + waterConsumedLitres);
        System.out.println("Water Usage Status: " + usageStatus);
    }
}
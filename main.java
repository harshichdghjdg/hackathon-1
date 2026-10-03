import java.util.Scanner
 class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vehicleNumber = sc.nextInt();
        double wasteCollected = sc.nextDouble();
        int collectionPoints = sc.nextInt();
        char vehicleStatus = sc.next().charAt(0);

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected: " + wasteCollected + " kg");
        System.out.println("Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
    }
}
data types
 Vehicle number → int
Waste collected → double
Collection points → int
Vehicle status → char
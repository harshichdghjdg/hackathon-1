
import java.util.Scanner;

 class if-else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double wasteCollected = sc.nextDouble();

        if (wasteCollected >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }
    }
}

Important: >= 100 means 100 or more.

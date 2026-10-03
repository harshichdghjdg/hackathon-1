import java.util.Scanne
class TotalWaste {

    static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double point1Waste = sc.nextDouble();
        double point2Waste = sc.nextDouble();

        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);

        System.out.println("Total Waste Collected: " + totalWaste);
    }
}

Remember for the exam:

double → decimal values
int → whole numbers
char → single character
if-else → condition checking
return → sends the calculated value back from a method.

import java.util.Scanner;
public class heron {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        // Math.sqrt();
        System.out.print("Please enter a side= ");
        double a = scanner.nextDouble();

        System.out.print("Please enter b side= ");
        double b = scanner.nextDouble();

        System.out.print("Please enter c= ");
        double c = scanner.nextDouble();
        
        double area = calculateTriangleArea(a, b, c); 
        
        scanner.close(); 
    }
    
    public static double calculateTriangleArea(double a, double b, double c) {
        if (isValidTriangle(a, b, c)) { 
            double s = (a + b + c) / 2; 
            return Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
        } else {
            return 0; 
        }
    }

    public static boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a; 
    }
}





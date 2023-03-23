/*
Question : Given the dimensions of a cone, find out its surface area and volume.
_____________________________________________________________________________
Problem Solution
The surface area and volume of a cone can be calculated using the formulas:
Surface Area = (PI * radius * slant height) + (PI * radius2).
Volume = PI * radius2 * height/3.
_______________________________________________________________________________________
Case 1 (Simple Test Case):
Enter the radius and height of the right circular cone
3.42
12
Volume = 146.98129725379061
Surface area = 170.81027853689216
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI = 3.141593,Radius,height,SurfaceArea,Volume;
        System.out.println("Enter the height of cone :");
        height = sc.nextDouble();
        System.out.println("Enter the first radius of cone : ");
        Radius = sc.nextDouble();
        SurfaceArea = (PI * Radius * height) + (PI * Radius * Radius);
        System.out.println("Printing the Surface area : " + SurfaceArea);
        Volume = (PI * (Radius * Radius) * height) / 3;
        System.out.println("Printing the Volume : " + Volume);
    }
}
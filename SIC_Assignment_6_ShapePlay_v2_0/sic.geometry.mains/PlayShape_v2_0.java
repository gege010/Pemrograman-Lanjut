// package sic.geometry.mains;
// import sic.geometry.Shapes.v2.Circle;
// import sic.geometry.Shapes.v2.Point;
// import sic.geometry.Shapes.v2.Rectangle;
import java.util.Scanner;

public class PlayShape_v2_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================");
        System.out.println("Shape Play v2.0");
        System.out.println("by Anugerah G. Hutajulu");
        System.out.println("=====================");
        System.out.println("Please select a Shape by selecting its corresponding number below:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.print("Selected: ");
        int pilih = sc.nextInt();
        Shape Shape=null;

        switch (pilih) {
            case 1:
                System.out.println("Enter the circle's description below:");
                System.out.print("  ID: ");
                String circleId = sc.next();
                System.out.print("  x origin coordinate: ");
                int circleX = sc.nextInt();
                System.out.print("  y origin coordinate: ");
                int circleY = sc.nextInt();
                System.out.print("  Radius: ");
                double circleRadius = sc.nextDouble();

                Point circlePoint = new Point(circleX, circleY);
                Shape = new Circle(circleId, circlePoint, circleRadius);
                System.out.println("\nDescription of the selected Shape");
                System.out.println("---------------------------------");
                System.out.println(Shape.getDescription());
                break;

            case 2:
                System.out.println("Enter the rectangle's description below:");
                System.out.print("  ID: ");
                String rectangleId = sc.next();
                System.out.print("  x origin coordinate: ");
                int rectangleX = sc.nextInt();
                System.out.print("  y origin coordinate: ");
                int rectangleY = sc.nextInt();
                System.out.print("  Length: ");
                double rectangleLength = sc.nextDouble();
                System.out.print("  Width: ");
                double rectangleWidth = sc.nextDouble();

                Point rectanglePoint = new Point(rectangleX, rectangleY);
                Shape = new Rectangle(rectangleId, rectanglePoint, rectangleLength, rectangleWidth);
                System.out.println("\nDescription of the selected Shape");
                System.out.println("---------------------------------");
                System.out.println(Shape.getDescription());
                break;

            default:
                System.out.println("Error!");
                System.exit(0);  
        }
        System.out.print("\nCreate a cylinder based on this Shape? (y/n): ");
        String pilih0 = sc.next();
        switch (pilih0.toLowerCase()) {
        case "y":
            System.out.print("Enter cylinder ID: ");
            String id = sc.next();
            if (Shape instanceof Circle) {
                System.out.print("Enter cylinder's height: ");
                double height = sc.nextDouble();
                Cylinder cylinder = new Cylinder(id, Shape.getX0(), Shape.getY0(),((Circle) Shape).getRadius(), height);
                System.out.println("\nDescription of the Shape\r\n" +"-------------------------");
                System.out.println(cylinder.getDescription());
                System.out.println();
            } else if (Shape instanceof Rectangle) {
                System.out.print("Enter cylinder's height: ");
                double height = sc.nextDouble();
                Cylinder cylinder = new Cylinder(id, Shape.getX0(), Shape.getY0(), 0, height);
                System.out.println("\nDescription of the Shape\r\n" +"-------------------------");
                double area = ((((Rectangle) Shape).getWidth()*((Rectangle) Shape).getLength())*2)+(((Rectangle) Shape).getWidth()*height*2)+(((Rectangle) Shape).getLength()*height*2);
                double volume = (((Rectangle) Shape).getWidth()*((Rectangle) Shape).getLength())*height;
                System.out.println(cylinder.getDescription(((Rectangle) Shape).getLength(), ((Rectangle) Shape).getWidth(), area, volume));
                System.out.println();
            }
            break;
        case "n":
            break;
        default:
            System.out.println("Error!");
            System.exit(0);
        }
        System.out.println("Have a nice day.");
        sc.close();
    }
}
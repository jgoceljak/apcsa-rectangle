import java.util.Scanner;

public class apcsarectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a length:");
        double length = in.nextDouble();

        System.out.print("Enter a width:");
        double width = in.nextInt();

        double area = length * width;

        System.out.print("\nThe area of a ");
        System.out.printf("%.1f", length);
        System.out.print("-by-");
        System.out.printf("%.1f", width);
        System.out.print(" rectangle is ");
        System.out.printf("%.1f", area);
        System.out.print(".");
        in.close();
    }
}

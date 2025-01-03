import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class area {
    public static void main(String[] args) {
        double area, r;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter radius");
        r= scan.nextDouble();
        area=3.14159 *r*r;
        System.out.printf("Area is %f",area);}
}
import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please Enter the Length of a Side of a Hexagon: ");

        // Read the length of the hexagon side from the user
        double sideOfHexagon = input.nextDouble();

        Hexagon userHexagon = new Hexagon(sideOfHexagon);
        Hexagon userHexagonTwo = new Hexagon(-175.5547);

        System.out.println("Area of Hexagon 1 with side " + sideOfHexagon + ": " + userHexagon.calculateAreaOfHexagonWithOneSide());
        System.out.println("Area of Hexagon 2 with side -175.5547: " + userHexagonTwo.calculateAreaOfHexagonWithOneSide());
    }
}





    















    


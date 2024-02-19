import java.util.Scanner;

public class math{
    public static void main(String[] args) {
        double number = 10;

        double squareResult = square(number);
        System.out.println("Square: " + squareResult);

        double cubeResult = cube(number);
        System.out.println("Cube: " + cubeResult);
    }

    public static double square(double num) {
        return num * num;
    }

    public static double cube(double num) {
        return num * num * num;
    }
}


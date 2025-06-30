
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to convert: ");
        double value = sc.nextDouble();

        System.out.println("Convert from c/k/f");
        String from = sc.next().toUpperCase();
        String to = sc.next().toUpperCase();

        double result = convertedTemperature(value, from, to);
        System.out.println("The Converted Value from " + from + " to " + to + " is: " + result);


    }

    public static double convertedTemperature(double value, String from, String to) {

        if (from.equals("C")) {
            if (to.equals("K")) return value + 273.15;
            if (to.equals("F")) return value * 9 / 5 + 32;
        }
        if (from.equals("K")) {
            if (to.equals("F")) return (value - 273.15) * 9 / 5 + 32;
            if (to.equals("C")) return value - 273.15;
        }
        if (from.equals("F")) {
            if (to.equals("C")) return (value - 32) * 5 / 9;
            if (to.equals("K")) return (value - 32) * 5 / 9 + 273.15;
        }
        return value;
    }
}

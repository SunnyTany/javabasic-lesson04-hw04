package app;

import java.text.DecimalFormat;

public class Main {

    public static double decimalFormatNumber(double number) {
        DecimalFormat df = new DecimalFormat("0.00");
        return Double.parseDouble(df.format(number));
    }

    public static double calculationSalesAmount(double price, int quantity) {
        price = decimalFormatNumber(price);
        return price * quantity;
    }

    public static void printOrder(int numberOrder, String productName, int days, double price, int quantity ) {
        if (days != 0) {
            double totalSum = calculationSalesAmount(price, quantity) * days;
            System.out.println("Product No " + numberOrder + ": " + productName + ",");
            System.out.println("total sales for " + days + " days is EUR "  + totalSum + ",");
            System.out.println("sales by day is EUR " + decimalFormatNumber( totalSum / days ) + ".");
        } else {
            System.out.println("Error : days = 0  !!!");
        }
    }

    public static void main(String[] args) {
        printOrder(1, "smartphone", 5,  405.11, 6);
        printOrder(2, "laptop", 7, 374.53035, 4);
    }
}
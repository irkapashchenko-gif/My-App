package app;

public class Main {
    public static void main(String[] args) {

        int days1 = 5;
        double totalSales1 = 12153.41;
        double salesPerDay1 = totalSales1 / days1;

        int days2 = 7;
        double totalSales2 = 10486.85;
        double salesPerDay2 = totalSales2 / days2;

        System.out.printf("Product No 1: smartphone,\ntotal sales for %d days is EUR %.2f,\nsales by day is EUR %.2f.%n",
                days1, totalSales1, salesPerDay1);

        System.out.printf("Product No 2: laptop,\ntotal sales for %d days is EUR %.2f,\nsales by day is EUR %.2f.%n",
                days2, totalSales2, salesPerDay2);
    }
}
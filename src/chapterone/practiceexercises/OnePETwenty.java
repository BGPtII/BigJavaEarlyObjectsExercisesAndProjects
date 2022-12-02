package chapterone.practiceexercises;

/**
 * Prints 5 provinces with the highest tax rates in 2 columns
 * Uses data from: https://www.retailcouncil.org/resources/quick-facts/sales-tax-rates-by-province/
 */
public class OnePETwenty {
    public static void main(String[] args) {
        System.out.println("Total Sales Tax Rates");
        System.out.println("---------------------");
        System.out.printf("PEI %16d%%\n", 15);
        System.out.printf("New Brunswick %6d%%\n", 15);
        System.out.printf("N.L. %15d%%\n", 15);
        System.out.printf("Nova Scotia %8d%%\n", 15);
        System.out.printf("Quebec %13f%%", 14.975);
    }
}

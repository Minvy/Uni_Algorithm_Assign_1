import java.util.HashMap;

public class BuyLithium {
    //Object that contains lithium grade pricing guidelines
    private LithiumPricing lithiumPricing;

    /**
     * Constructor initialises prices set for each grade
     * @param lithiumPricing Object that contains lithium grade pricing
     */
    public BuyLithium(LithiumPricing lithiumPricing) {
        this.lithiumPricing = lithiumPricing;
    }

    /**
     * Iterates through available grades of lithium and prints their price
     * if it is below or equal to the priceLimit provided
     * @param priceLimit Money limit of how much the customer is willing to pay
     */
    public void findBestPrice(int priceLimit) {
        HashMap<Integer, Double> prices = lithiumPricing.getPrices();
        StringBuffer stringBuffer = new StringBuffer();
        int index = 0;
        for (int grade : prices.keySet()) {
            if (prices.get(grade) <= priceLimit) {
                stringBuffer.append("("+grade + " - ");
                stringBuffer.append("£" + prices.get(grade)+")");
                stringBuffer.append("  ");
                index++;
            }
        }
        System.out.print("Grades available("+index+"): ");
        System.out.println(stringBuffer.toString());
    }

    /**
     * Iterates through the prices and finds all "High quality" lithium samples that are
     * equal to or above the given grade limit by the customer
     * @param gradeLimit Minimum grade of lithium the customer would like to search for
     */
    public void findHighQuality(int gradeLimit){
        HashMap<Integer, Double> prices = lithiumPricing.getPrices();
        StringBuffer stringBuffer = new StringBuffer();
        int index = 0;
        for (int grade : prices.keySet()) {
            if (grade >= gradeLimit) {
                stringBuffer.append("("+grade + " - ");
                stringBuffer.append("£" + prices.get(grade)+")");
                stringBuffer.append("  ");
                index++;
            }
        }
        System.out.print("Grades available("+index+"): ");
        System.out.println(stringBuffer.toString());
    }
}

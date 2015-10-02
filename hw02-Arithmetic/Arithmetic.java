//Daniel DePaul
// homework 02
//
//This homework's goal is to teach the student basic manipulation of content within variables





// we start witht the classic signature
public class Arithmetic {
    public static void main(String[] args) {
        //begin with input data and varibable declaration
        int nSocks=3; // number of socks being bought
        //declare the cost
        // note that '$' is a part of the varibale name
        double sockCost$=2.58;
        
        //drinking glasses amount
        int nglasses=6;
        // cost per glass
        double glassCost$= 2.29;
        
        // Number of boxes of envelopes
        int nEnvelopes=1;
        // cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        double sockPurchase= 3*2.58;  // total cost of item being bought before tax same goes for below variables glass Purchase and envelope Purchase
        double glassPurchase= 6*2.29;
        double envelopePurchase= 1*3.25;
        
        double FalseTotal= sockPurchase+glassPurchase+envelopePurchase;
        
        double sockTrue= sockPurchase*1.06; // cost of item after tax  same goes for the below variables glasstrue and envelope true
        double glassTrue= glassPurchase*1.06;
        double envelopeTrue= envelopePurchase*1.06;
        
        double TrueTotal= sockTrue+glassTrue+envelopeTrue; // used for true total of items with tax included
        System.out.println("Item bought is Socks."); // begin printing what is being bought
        System.out.println("                               " );
        System.out.println("The number of socks being bought is   " +nSocks+ ".");
        System.out.println("                               " );
        System.out.println("At a cost of  " +sockCost$+ "  dollars");
        System.out.println("                               " );
        System.out.println("Socks       " +sockPurchase+ " ");
        System.out.println("                               " );
        System.out.println("With a tax rate of   " +taxPercent+ " ");
        
        System.out.println("                               " );
        
        System.out.println("Item bought is Wine Glasses."); // begin printing what is being bought
        System.out.println("                               " );
        System.out.println("The number of socks being bought is    " +nglasses+ ".");
        System.out.println("                               " );
        System.out.println("At a cost of   " +glassCost$+ "  dollars");
        System.out.println("                               " );
        System.out.println("Glasses       " +glassPurchase+ " ");
        System.out.println("                               " );
        System.out.println("With a tax rate of   " +taxPercent+ " ");
        
        System.out.println("                               " );
        
        System.out.println("Item bought is envelopes."); // begin printing what is being bought
        System.out.println("                               " );
        System.out.println("The number of socks being bought is   " +nEnvelopes+ ".");
        System.out.println("                               " );
        System.out.println("At a cost of   " +envelopeCost$+ "  dollars");
        System.out.println("                               " );
        System.out.println("Envelopes       " +envelopePurchase+ " ");
        System.out.println("                               " );
        System.out.println("With a tax rate of   " +taxPercent+ " " );
        System.out.println("                               " );
        
        System.out.println("                               " );
        System.out.println("The total cost of items before tax is" +FalseTotal+ "  dollars.");
        System.out.println("                               " );
        System.out.println("The total cost of the purchse after tax is" +TrueTotal+ "  dollars.");
        
        System.out.println("Thank You!");
        
    }// end of main method
}
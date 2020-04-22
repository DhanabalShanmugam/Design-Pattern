package CreationalPattern.Singleton;

// In this type we create the object when class is loaded
public class EarlyInstatiation {

    public static void main(String[] args) {

        String customerType = new String();
        switch (customerType) {
            case "Buyer":
                Seller seller = new Seller();
                seller.addProduct(9);
                seller.displaySelled();
                //            we check the shop detail after add the peoducts in a shop
                seller.shopObj.shopDetails();
                // Seller's other activities
                break;
            case "Seller":
                Buyer buyer = new Buyer();
                buyer.purchase(5);
                buyer.displayPurchase();
                //            we check the shop detail after make a purchase
                buyer.shopObj.shopDetails();
                // Buyer's other activities
                break;
        }
        
//       here we check the shop detail using another buyer object
        Buyer buyer2 = new Buyer();
        buyer2.shopObj.shopDetails();
//        at the end every changes in a shop reflacted to a all customer's in a shop.

    }

}

class Shop {

    private static Shop shopObj = new Shop();
    private int totalProductCount = 0;

    // Make a constructor as private to restrict another classes access the constructor
    private Shop() {
    }

    public static Shop getInstance() {
        return shopObj;
    }

    public void sell(int productCount) {

        totalProductCount += productCount;
    }

    // I am just return a product count for understnding
    public void shopDetails(){
        System.out.println("Total Number of products in a shop:"+totalProductCount);
    }

    public void buy(int productCount) {
        
        totalProductCount -= productCount;
    }
    

}

class Seller {

    private int selledProductCount;
    Shop shopObj;

    Seller() {

        shopObj = Shop.getInstance();
    }

    public void addProduct(int productCount) {

        selledProductCount += productCount;
        shopObj.sell(productCount);
        
    }

    public void displaySelled() {
        System.out.println("Your Selled Product Count:"+selledProductCount);
    }
    
    
}

class Buyer {

    private int buyedProductCount;
    Shop shopObj;

    Buyer() {

        shopObj = Shop.getInstance();
    }

    public void purchase(int productCount) {
        buyedProductCount = productCount;
        shopObj.sell(productCount);
    }

    public void displayPurchase() {
        System.out.println("your buyed product count:"+buyedProductCount);
    }
    
    
}

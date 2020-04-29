class Shop {

    private static Shop shopObj = null;
    private int totalProductCount = 0;

    // Make a constructor as private to restrict another classes access the constructor
    private Shop() {
    }
    
     // Compare to Early Instantiation program, i just make the changes over here.
    // In Lazy Instantiation, create object for class when it is called first time
    public static Shop getInstance() {
        // Check the object not created before 
        if(shopObj == null) {
            shopObj = new Shop();
        }
        return shopObj;
    }

    public void sell(int productCount) {

        totalProductCount += productCount;
    }

    // just return a product count for understnding
    public void shopDetails(){
        System.out.println("Total Number of products in a shop:"+totalProductCount);
    }

    public void buy(int productCount) {
        
        totalProductCount -= productCount;
    }
}

# This Program runs clearly, but we have problem.
# Think about multithreading , what happen if two threads call getInstance() at same time.
# Yeah, you are right two object are created. Solve this, we use Synchronization technique.

    // just add synchronized keyword with method name getInstance
    synchronized public static Shop getInstance() {
        // Check the object not created before 
        if (shopObj == null) {
            shopObj = new Shop();
        }
        return shopObj;
    }

   
# But using above method we have performance issue. So, solve that we use Double Check Locking method. 
# In below, just apply synchronized method divide into the sub part.

public static Shop getInstance() {
        // Check the object, if it not created before 
        if (shopObj == null) {
           synchronized(Shop.class){
             if(shopObj == null){
                shopObj = new Shop();
              }
            }
        }
        return shopObj;
    }

# Using this, avoid multithreading problem and performance issue.

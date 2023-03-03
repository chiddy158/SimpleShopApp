
package duke.choice;

import java.util.Arrays;

/**
 * @author chiddy
 * @email chiddy158@gmail.com
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tax = 0.2;
        double total = 0;
        System.out.println("Welcome to Duke choice Shop");
        Customer c1 = new Customer("Chidi",14);
        System.out.println("Minimum Price: "+ Clothing.MIN_PRICE );
        System.out.println("Welcome "+ c1.getName() + ", Duke Chioce Shop is the shop for all your needs" );
        
        Clothing item1 = new Clothing("Blue Jacket",20.9, "M" );
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing []items = {item1, item2, new Clothing("Green Scarf",5, "S" ), new Clothing("Blue T-Shirt",10.5, "S")};
              
       // int measurement = 3;
        c1.addItems(items);
       
        System.out.println("Customet is " + c1.getName()+ "," + c1.getSize()+ "," + c1.getTotalClothingCost());

        for(Clothing item : c1.getItems()){
            System.out.println("Items output:" + item);
                                          
            }
           Arrays.sort(c1.getItems());
           
        }        
        
    }
    


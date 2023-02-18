
package duke.choice;

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
        Customer c1 = new Customer();
        c1.setName("Chidi");
        c1.setSize("S");
        System.out.println("Welcome "+ c1.getName() + ", Duke Chioce Shop is the shop for all your needs" );
        
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing []items = {item1, item2, new Clothing(), new Clothing()};
        
        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");
        
        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");
        
        items[2].setDescription("Green Scarf");
        items[2].setPrice(5);
        items[2].setSize("S");
        
        items[3].setDescription("Blue T-Shirt");
        items[3].setPrice(10.5);
        items[3].setSize("S");
        
        //System.out.println("Item 1: "+ item1.description+ ", " + item1.price +", "+item1.size );
        //System.out.println("Item 2: "+ item2.description+ ", " + item2.price +", "+item2.size );
        
        //total = item2.price * 2 + item1.price + (item2.price * 2 + item1.price)*tax;
        
        
        int measurement = 3;
        c1.addItems(items);
        c1.setSize(measurement);
        System.out.println("Customet is " + c1.getName()+ "," + c1.getSize()+ "," + c1.getTotalClothingCost());

        for(Clothing item : c1.getItems()){
            System.out.println("Items" + item.getDescription());
                                          
            }
            
        }        
        
    }
    


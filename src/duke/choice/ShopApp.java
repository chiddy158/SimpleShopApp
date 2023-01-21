
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
        c1.name = "Chidi";
        c1.size = "S";
        System.out.println("Welcome "+ c1.name + ", Duke Chioce Shop is the shop for all your needs" );
        
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";
        
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";
        
        System.out.println("Item 1: "+ item1.description+ ", " + item1.price +", "+item1.size );
        System.out.println("Item 2: "+ item2.description+ ", " + item2.price +", "+item2.size );
        
        total = item2.price * 2 + item1.price + (item2.price * 2 + item1.price)*tax;
        System.out.println("Total = "+ total );
        
        int measurement = 3;
        switch(measurement){
            case 1,2,3:
                c1.size = "S";
                break;
            case 4,5,6:
                c1.size = "M";
                break;
            case 7,8,9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
        }
    }
    
}

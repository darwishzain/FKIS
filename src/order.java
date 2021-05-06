
import java.util.Scanner;

public class order extends register{
    
void InformOrder() {
    Scanner sc = new Scanner(System.in);
    int choice = 0;
    while(choice == 0)
    {    
        System.out.println("Enter item code:");
        //String code = sc.nextLine();
        
        System.out.println("Enter item quantity:");
        //int quantity = sc.nextInt();
        
        System.out.println("Enter 0 to continue order or 1 to exit");
        choice = sc.nextInt();    
    }
    /*
    InformOrder list = new InformOrder();
    String ID = list.UserRegister();
    
    System.out.println("UserID: "+ID);
    System.out.println("Item Code: "+code);
    System.out.println("Item Quantity: "+quantity);
    */

    sc.close();
    }

}
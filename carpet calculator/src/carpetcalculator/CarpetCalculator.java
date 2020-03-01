/*Pablo Velazquez
* This program allows the user to enter the length and width of an area they want to cover in carpet, then it asks the user the price per square foot of the carpet. 
* With this information it calculates the area, how much it would cost to cover that area in carpet, and displays all of that to the user.
*/

package carpetcalculator;

import java.util.Scanner;

/**
 *
 * @author Pablo Velazquez
 */
public class CarpetCalculator{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        double length; 
        double width;
        double price;

        Scanner userInput = new Scanner(System.in);
        
        do{ //loop until user exits

            System.out.print("Enter the length (-1 to exit): ");
            length = userInput.nextDouble();
            
            if(length == -1){
                userInput.close();
                break;
            }
            
            System.out.print("Enter the width: ");
            width = userInput.nextDouble();
            
            System.out.print("Enter the price: ");
            price = userInput.nextDouble();
            
            RoomDimension area = new RoomDimension(length, width);
            RoomCarpet total = new RoomCarpet(area, price);
            System.out.println(total.toString()); //print out all the variables
        
        } while(length != -1); //repeat until user enters -1
    }
}

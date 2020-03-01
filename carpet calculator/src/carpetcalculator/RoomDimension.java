
package carpetcalculator;

/**
 *
 * @author Pablo Velazquez
 */
public class RoomDimension{

    private double length;
    private double width;

    public RoomDimension(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    
    public double getArea(){ //calculate and return the area
        double area = length * width;
        return area; 
    }

    @Override
    public String toString(){ //print out the room dimensions
        return "RoomDimension{" + "length: " + length + ", width: " + width + '}';
    }
    

}

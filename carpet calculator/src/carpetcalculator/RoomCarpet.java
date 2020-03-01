package carpetcalculator;

/**
 *
 * @author Pablo Velazquez
 */
public class RoomCarpet{
    private RoomDimension size;
    private double carpetCost;

    public RoomCarpet(RoomDimension dim, double cost){
        this.size = dim;
        this.carpetCost = cost;
        getTotalCost(); //call the totalcost method
    }

    private double getTotalCost(){ //calculate the total cost
        carpetCost = size.getArea() * carpetCost; //call getArea from RoomDimension to calculate total
        return carpetCost;
    }

    @Override
    public String toString(){ //print out RoomDimension and total cost of carpet
        return "RoomCarpet{" + "size: " + size + ", carpetCost: $" + carpetCost + '}';
    }
 
}



/**
 * Bus class representing a bus for the Jerra program
 */
public class Bus {
    
    private int busID;
    private int seats;

    /**
     * Constructor for the bus class
     * @param busID the id for the bus
     * @param seats the number of seats on the bus
     */
    
    public Bus(int busID, int seats){
        this.busID = busID;
        this.seats = seats;
    }
    
    /**
     * @return busID the id for the bus
     */
     
    public int getBusID(){
        return this.busID;
    }
    
    /**
     * @param newBusID the new id for the bus
     */

    public void setBusID(int newBusID){
        this.busID = newBusID;
    }

    /**
     * @return seats the number of seats on the bus
     */
    
    public int getSeats(){
        return this.seats;
    }

    /**
     * @param newSeats the number of seats on the bus
     * /
    
    public void setSeats(int newSeats){
        this.seats = newSeats;
    }
}

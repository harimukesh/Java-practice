package LLD.PrakingLot;

public class ParkingSpot {
    public VehicleType vehicleType;
    public Vehicle parkedVehicle = null;
    public String spotNumber;

    public ParkingSpot(VehicleType vehicleType, String spotNumber) {
        this.vehicleType = vehicleType;
        this.spotNumber = spotNumber;
    }

    public boolean isAvailable(){
        return parkedVehicle==null;
    }

    public String parkVehicle(Vehicle vehicle){
        this.parkedVehicle = vehicle;
        return this.spotNumber;
    }

    public void unParkVehicle(Vehicle vehicle){
        this.parkedVehicle = null;
    }


}

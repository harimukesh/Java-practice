package LLD.PrakingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot instance;
    public List<Level> lvlList = new ArrayList<Level>();

    public static ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public void addLevel(Level level) {
        lvlList.add(level);
    }

    public String park(Vehicle vehicle){
        for(Level lvl:lvlList){
            String SpotNum = lvl.parkVehicle(vehicle);
            if(!(SpotNum ==null)){
                return SpotNum;
            }
        }
        return "No Space to Park";
    }

    public String unPark(Vehicle vehicle){
        for(Level lvl:lvlList){
            if(lvl.unParkVehicle(vehicle)){
               return "Unparked the Vehicle";
            }
        }
        return "unable to get the Vehicle";
    }

    public String findParkedSpot(String licensePlate ,VehicleType vehicleType){
        for(Level lvl:lvlList){
            String spotNum = lvl.findVehicle(licensePlate,vehicleType);
            if(spotNum != null){
                return "Vehicle available at "+ spotNum;
            }
        }
        return "Vehicle not found";
    }
}

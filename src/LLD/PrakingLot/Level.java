package LLD.PrakingLot;

import java.util.ArrayList;
import java.util.List;

public class Level {
    int levelNo;
    int capacity;
    private final List<ParkingSpot> parkingSpotList;

    double carReservation=0.5;
    double motorCycleReservation=0.4;

    public Level(int levelNo, int capacity) {
        this.levelNo = levelNo;
        this.capacity = capacity;

        parkingSpotList = new ArrayList<>(capacity);

        int noOfCarCapacity = (int) (capacity * carReservation);
        int noOfMotorCycleCapacity = (int) (capacity * motorCycleReservation);

        for(int i=1;i<=noOfCarCapacity;i++){

            parkingSpotList.add(new ParkingSpot(VehicleType.CAR, this.levelNo+"-" +i ));
        }

        for(int i=noOfCarCapacity+1;i<=(noOfCarCapacity+noOfMotorCycleCapacity);i++){
            parkingSpotList.add(new ParkingSpot(VehicleType.MOTORCYCLE, this.levelNo+"-" +i ));
        }

        for(int i=noOfCarCapacity+noOfMotorCycleCapacity+1;i<=capacity;i++){
            parkingSpotList.add(new ParkingSpot(VehicleType.TRUCK, this.levelNo+"-" +i ));
        }
    }

    public String parkVehicle(Vehicle vehicle){
        for(ParkingSpot spot : parkingSpotList){
            if(spot.isAvailable() && spot.vehicleType.equals(vehicle.vehicleType)) {
                String SpotNum = spot.parkVehicle(vehicle);
                return "vehicle No:"+ vehicle.licensePlate+" parked at "+SpotNum;
            }
        }
        return null;
    }

    public boolean unParkVehicle(Vehicle vehicle){
        for(ParkingSpot spot : parkingSpotList){
            if(!spot.isAvailable() && spot.parkedVehicle.equals(vehicle)) {
                spot.unParkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }


    public String findVehicle(String licensePlate, VehicleType vehicleType){
        for(ParkingSpot spot : parkingSpotList){
            if(spot.parkedVehicle!= null && spot.vehicleType.equals(vehicleType)){
                if(spot.parkedVehicle.licensePlate.equals(licensePlate)){
                    return spot.spotNumber;
                }
            }
        }
        return null;
    }




}

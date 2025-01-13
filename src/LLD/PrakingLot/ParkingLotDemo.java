package LLD.PrakingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotDemo {

    public static void run() {
        //set up the level
        ParkingLot parkingLot = ParkingLot.getInstance();


        Vehicle car1 = new Vehicle("TN1223434",VehicleType.CAR);
        Vehicle car2 = new Vehicle("TN1223435",VehicleType.CAR);
        Vehicle car3 = new Vehicle("TN1223436",VehicleType.CAR);
        Vehicle car4 = new Vehicle("TN1223437",VehicleType.CAR);
        Vehicle car5 = new Vehicle("TN1223438",VehicleType.CAR);
        Vehicle car6 = new Vehicle("TN1223439",VehicleType.CAR);

        Vehicle Truck1 = new Vehicle("TN1223440",VehicleType.TRUCK);


        parkingLot.addLevel(new Level(1,10));
        parkingLot.addLevel(new Level(2,10));

        System.out.println(parkingLot.park(car1));
        System.out.println(parkingLot.park(car2));
        System.out.println(parkingLot.park(car3));
        System.out.println(parkingLot.park(car4));
        System.out.println(parkingLot.park(car5));
        System.out.println(parkingLot.park(car6));

//        System.out.println(parkingLot.unPark(car1));
//        System.out.println(parkingLot.unPark(car2));
//        System.out.println(parkingLot.unPark(car3));
//        System.out.println(parkingLot.unPark(car4));
//        System.out.println(parkingLot.unPark(car5));
//        System.out.println(parkingLot.unPark(car6));

        System.out.println(parkingLot.park(Truck1));

        System.out.println(parkingLot.findParkedSpot("TN1223436" , VehicleType.CAR));

    }
}

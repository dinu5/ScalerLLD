package parkinglot.repositories;

import parkinglot.models.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    Map<String, Vehicle> vehicles = new HashMap<>();

    public void save(String number,Vehicle vehicle){
        vehicles.put(number,vehicle);
    }
    public Vehicle findByVehicleNumber(String number){
        if(vehicles.containsKey(number)){
            return vehicles.get(number);
        }
        return null;
    }
}

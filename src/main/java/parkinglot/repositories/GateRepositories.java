package parkinglot.repositories;

import parkinglot.models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepositories {
    Map<Long, Gate> gates = new HashMap<>();

    public void save(Long id,Gate gate){
        gates.put(id,gate);
    }
    public Gate findByGateId(Long id){
        return gates.get(id);
    }
}

package parkinglot.factory;

import parkinglot.models.SpotAssignmentType;
import parkinglot.strategies.spotassignmentstrategy.NearestSpotAssignment;
import parkinglot.strategies.spotassignmentstrategy.SpotAssignmentStrategies;

public class SpotAssignmentStrategyFactory {
    public static SpotAssignmentStrategies getSpotAssignmentStrategy(SpotAssignmentType spotAssignmentType){
        if(spotAssignmentType.equals(SpotAssignmentType.NEAREST)){
            return new NearestSpotAssignment();
        }else{
            return null;
        }
    }
}

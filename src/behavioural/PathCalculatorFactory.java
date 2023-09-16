package behavioural;

public class PathCalculatorFactory {

    public  static PathCalculator getPathCalculator(TransportationMode mode){
        return switch (mode){
            case CAR -> new CarPathCalculator();
            case WALK -> new WalkPathCalculator();
            case BIKE -> new BikePathCalculator();


        };
    }


}

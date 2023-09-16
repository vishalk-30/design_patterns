package behavioural;

public class GoogleMaps {

    public void findPath(String source, String destination , TransportationMode mode){

        PathCalculator pathCalculator = PathCalculatorFactory.getPathCalculator(mode);
        pathCalculator.calculatePath(source, destination);


    }
}

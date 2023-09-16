package behavioural;

import java.nio.file.Path;

public class BikePathCalculator implements PathCalculator {
    public void calculatePath(String source, String destination) {
        System.out.println("Path calculated on Bike from : " + source + " to " + destination );
    }
}

package behavioural;

public class CarPathCalculator implements PathCalculator{
    @Override
    public void calculatePath(String source, String destination) {
        System.out.println("Path calculated on Car from : " + source + " to " + destination );
    }
}

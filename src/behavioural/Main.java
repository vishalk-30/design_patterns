package behavioural;

public class Main {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Airport", "Home", TransportationMode.CAR);
        googleMaps.findPath("Home", "Station", TransportationMode.CAR);


    }
}

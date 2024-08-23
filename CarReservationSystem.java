import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class CarReservationSystem {
    private List<Car> cars;
    private List<User> users;
    private List<Location> locations;
    private HashMap<Location, List<Car>> carLocationMap;

    public CarReservationSystem() {
        cars = new ArrayList<>();
        users = new ArrayList<>();
        locations = new ArrayList<>();
        carLocationMap = new HashMap<>();
    }

    // Getters and setters
    public List<Car> getCars() {
        return cars;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public HashMap<Location, List<Car>> getCarLocationMap() {
        return carLocationMap;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public void setCarLocationMap(HashMap<Location, List<Car>> carLocationMap) {
        this.carLocationMap = carLocationMap;
    }

    public List<Car> getCarLocation(Location loc) {
        return carLocationMap.getOrDefault(loc, new ArrayList<>());
    }

    public List<Car> getCarByType(Type type) {
        return cars.stream()
                .filter(car -> car.getType() == type)
                .collect(Collectors.toList());
    }

    public void bookingCar(Reserve reservation) {
        Car car = reservation.getCar();
        if (car.getStatus() == Status.VACANT) {
            car.reserveVehicle();
            System.out.println("Car booked successfully for user " + reservation.getUser().getName());
        } else {
            System.out.println("Car is not available for booking.");
        }
    }

    public void confirmation(Reserve reservation) {
        System.out.println("Booking confirmed for user " + reservation.getUser().getName() + " with car "
                + reservation.getCar().getName());
    }
}

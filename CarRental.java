import java.util.*;

public class CarRental {
    public static void main(String[] args) {
        // Initialize the system with some data
        Location loc1 = new Location("City Center", 123456, 12345, 67890);
        Location loc2 = new Location("Airport", 654321, 12345, 67890);

        Car car1 = new Car("Model S", "Tesla", 1000, 15000, 2021, 1234567890L, Type.SEDAN, loc1);
        Car car2 = new Car("Model X", "Tesla", 1200, 10000, 2022, 1234567891L, Type.SUV, loc2);

        User user1 = new User("John Doe", "john@example.com", "PAN12345", loc1, "LICENSE123");

        CarReservationSystem carReservationSystem = new CarReservationSystem();

        carReservationSystem.getCars().add(car1);
        carReservationSystem.getCars().add(car2);

        carReservationSystem.getUsers().add(user1);

        carReservationSystem.getLocations().add(loc1);
        carReservationSystem.getLocations().add(loc2);

        carReservationSystem.getCarLocationMap().put(loc1, Arrays.asList(car1));
        carReservationSystem.getCarLocationMap().put(loc2, Arrays.asList(car2));

        // Simulate user creating an account
        User newUser = new User("Jane Doe", "jane@example.com", "PAN67890", loc2, "LICENSE678");
        carReservationSystem.getUsers().add(newUser);
        System.out.println("User account created for: " + newUser.getName());

        // Simulate user entering location to book a car
        Location userLocation = loc1;
        List<Car> availableCars = carReservationSystem.getCarLocation(userLocation);

        // List down all the available cars based on location
        System.out.println("Available cars at " + userLocation.getName() + ":");
        for (Car car : availableCars) {
            System.out.println(car.getName() + " - " + car.getBrand() + " - $" + car.getBookingPrice());
        }

        // Simulate user selecting a car from the list
        Car selectedCar = availableCars.get(0); // assuming the first car is selected

        // Simulate user filling the booking details
        Location pickupLocation = loc1;
        Location dropLocation = loc2;
        int rentalPrice = selectedCar.getBookingPrice();
        Reserve reservation = new Reserve(newUser, selectedCar, pickupLocation, dropLocation, rentalPrice);

        // Simulate booking the car
        carReservationSystem.bookingCar(reservation);

        // Simulate confirming the booking
        carReservationSystem.confirmation(reservation);
    }
}

public class Reserve {
    private User user;
    private Car car;
    private Location pickup;
    private Location drop;
    private int rentalPrice;

    public Reserve(User user, Car car, Location pickup, Location drop, int rentalPrice) {
        this.user = user;
        this.car = car;
        this.pickup = pickup;
        this.drop = drop;
        this.rentalPrice = rentalPrice;
    }

    // Getters
    public User getUser() {
        return user;
    }

    public Car getCar() {
        return car;
    }

    public Location getPickup() {
        return pickup;
    }

    public Location getDrop() {
        return drop;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    // Setters
    public void setUser(User user) {
        this.user = user;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setPickup(Location pickup) {
        this.pickup = pickup;
    }

    public void setDrop(Location drop) {
        this.drop = drop;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }
}
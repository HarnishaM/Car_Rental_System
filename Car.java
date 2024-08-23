public class Car {
    private String name;
    private String brand;
    private int bookingPrice;
    private float kmDriven;
    private int manufactureDate;
    private long chassisNo;
    private Type type;
    private Location location;
    private Status status;

    public Car(String name, String brand, int bookingPrice, float kmDriven, int manufactureDate, long chassisNo,
            Type type, Location location) {
        this.name = name;
        this.brand = brand;
        this.bookingPrice = bookingPrice;
        this.kmDriven = kmDriven;
        this.manufactureDate = manufactureDate;
        this.chassisNo = chassisNo;
        this.type = type;
        this.location = location;
        this.status = Status.VACANT;
    }

    public void reserveVehicle() {
        this.status = Status.BOOKED;
    }

    public void updateCarDetail(String name, String brand, int bookingPrice, float kmDriven, int manufactureDate,long chassisNo, Type type, Location location, Status status) {
        this.name = name;
        this.brand = brand;
        this.bookingPrice = bookingPrice;
        this.kmDriven = kmDriven;
        this.manufactureDate = manufactureDate;
        this.chassisNo = chassisNo;
        this.type = type;
        this.location = location;
        this.status = status;
    } 
    

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBookingPrice() {
        return bookingPrice;
    }

    public void setBookingPrice(int bookingPrice) {
        this.bookingPrice = bookingPrice;
    }

    public float getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(float kmDriven) {
        this.kmDriven = kmDriven;
    }

    public int getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(int manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public long getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(long chassisNo) {
        this.chassisNo = chassisNo;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
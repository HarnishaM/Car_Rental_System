public class User {
    private String name;
    private String email;
    private String pan;
    private Location loc;
    private String licenseNo;

    // Constructors
    public User(String name, String email, String pan, Location location, String licenseNo) {
        this.name = name;
        this.email = email;
        this.pan = pan;
        this.loc = location;
        this.licenseNo = licenseNo;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPan() {
        return pan;
    }

    public Location getLocation() {
        return loc;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public void setLocation(Location location) {
        this.loc = location;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }
}

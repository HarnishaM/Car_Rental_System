public class Location {
    private String name;
    private long zipcode;
    private long latitude;
    private long longitude;

    public Location(String name, long zipcode, long latitude, long longitude) {
        this.name = name;
        this.zipcode = zipcode;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters
  public String getName() {
    return name;
  }

  public long getZipcode() {
    return zipcode;
  }

  public long getLatitude() {
    return latitude;
  }

  public long getLongitude() {
    return longitude;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setZipcode(long zipcode) {
    this.zipcode = zipcode;
  }

  public void setLatitude(long latitude) {
    this.latitude = latitude;
  }

  public void setLongitude(long longitude) {
    this.longitude = longitude;
  }
}
    
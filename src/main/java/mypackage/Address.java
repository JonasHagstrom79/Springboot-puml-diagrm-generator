package mypackage;

/**
 * Represents a physical address
 */
public class Address {
    private String street;
    private String city;

    /**
     * Creates a new Address
     * @param street the street name
     * @param city the city name
     */
    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    // Getters and setters
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}


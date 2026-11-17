package uk.ac.westminster.products_api;

public class Address {

    private String street;
    private String city;
    private String postalCode;

    public Address() {}

    public Address(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }
    public String getStreet() {
        return street;
    }
    public String getCIty() {
        return city;
    }
    public String getPostalCode() {
        return postalCode;
    }
}


package ir.maktab.model;

import javax.persistence.*;
import java.io.Serializable;
/**
 * @author Mohammad hashemi
 *
 * Teacher entity/Table
 */
@Entity
@Table(name = "addresses")
public class Address implements Serializable {

    /**
     * Fields or columns
     *
     * data types should be wrapper to enforcing nullability in the database
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city")
    String city;

    @Column(name = "state")
    String state;

    @Column(name = "number", nullable = false)
    Long number;

    @Column(name = "postal_address")
    String postalAddress;

    @Column(name = "postal_code")
    String postalCode;

    public Address() {
    }

    public Address(String city, String state, Long number, String postalAddress, String postalCode) {
        this.city = city;
        this.state = state;
        this.number = number;
        this.postalAddress = postalAddress;
        this.postalCode = postalCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", number=" + number +
                ", postalAddress='" + postalAddress + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}

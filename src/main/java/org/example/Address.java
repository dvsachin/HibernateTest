package org.example;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Student_Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressId;
    @Column(name ="Locality", length = 150)
    private String street;
    @Column(length = 100, name ="CITY")
    private String city;

    @Transient
    private double temp;

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", temp=" + temp +
                ", addedDate=" + addedDate +
//                ", image=" + Arrays.toString(image) +
                '}';
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE")
    private Date addedDate;
    @Lob
    private byte[] image;

    public Address() {
        super();
    }

    public Address(String street, String city, double temp, Date addedDate, byte[] image) {
        this.street = street;
        this.city = city;
        this.temp = temp;
        this.addedDate = addedDate;
        this.image = image;
    }

    public int getAddressId() {
        return addressId;
    }

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

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}

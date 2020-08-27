package com.demo;
import java.util.Date;

public class Vehicle {

    private final Brand brandName;
    private final String dateOfRegistration;
    private final BodyStyle bodyStyle;
    private final Color color;
    private final FuelType fuelType;

    public Vehicle(Brand brandName,
                   String dateOfRegistration,
                   BodyStyle bodyStyle,
                   Color color,
                   FuelType fuelType

    ) {
        this.brandName = brandName;
        this.dateOfRegistration = dateOfRegistration;
        this.bodyStyle = bodyStyle;
        this.color = color;
        this.fuelType = fuelType;

    }

    public Brand getBrandName() {
        return brandName;
    }

    public String getDateOfRegistration() {
        return dateOfRegistration;
    }

    public BodyStyle getBodyStyle() {
        return bodyStyle;
    }

    public Color getColor() {
        return color;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public String toString() {
        return "Vehicle : {" + "brand=" + brandName
                + ", style=" + bodyStyle
                + ",color=" + color
                + ", fuelType=" + fuelType
                + ", registrationDate=" + dateOfRegistration
                + '}';
    }

}

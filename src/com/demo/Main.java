package com.demo;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Vehicle> vehicles = getVehicle();

        //filter
        System.out.println("Vehicles are filtered");
        List<Vehicle> audis = vehicles.stream()
                .filter(vehicle -> vehicle.getBrandName().equals(Brand.AUDI))
                .collect(Collectors.toList());

        audis.forEach(System.out::println);

        //sort

        System.out.println("Vehicles are sorted");
        List<Vehicle> sortedVehicles = vehicles.stream()
                .sorted(Comparator.comparing(Vehicle::getDateOfRegistration).reversed().thenComparing(Vehicle::getColor))
                .collect(Collectors.toList());

        sortedVehicles.forEach(System.out::println);


        //All match
        boolean isMatched = vehicles.stream()
                .allMatch(vehicle -> vehicle.getDateOfRegistration().equals("2018"));

        System.out.println(isMatched);


        //None match
        boolean noneMatched = vehicles.stream()
                .anyMatch(vehicle -> vehicle.getDateOfRegistration().equals("2018"));

        System.out.println(noneMatched);

        //Max

        vehicles.stream()
                .max(Comparator.comparing(Vehicle::getDateOfRegistration))
                .ifPresent(System.out::println);

        //min
        vehicles.stream()
                .min(Comparator.comparing(Vehicle::getDateOfRegistration))
                .ifPresent(System.out::println);


        //group
        System.out.println("Vehicles are grouped");
        Map<Brand, List<Vehicle>> groupByBrand = vehicles.stream()
                .collect(Collectors.groupingBy(Vehicle::getBrandName));


    }

    public static List<Vehicle> getVehicle() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle(Brand.AUDI, "2015", BodyStyle.ESTATE, Color.Black, FuelType.DIESEL));
        vehicles.add(new Vehicle(Brand.ALFA_ROMEO, "2017", BodyStyle.CONVERTIBLE, Color.Red, FuelType.DIESEL));
        vehicles.add(new Vehicle(Brand.BENTLEY, "2019", BodyStyle.SALOON, Color.White, FuelType.ELECTRIC));
        vehicles.add(new Vehicle(Brand.TESLA, "2020", BodyStyle.COUPE, Color.Black, FuelType.ELECTRIC));
        vehicles.add(new Vehicle(Brand.DACIA, "2020", BodyStyle.CITYCAR, Color.Purple, FuelType.DIESEL));

        return vehicles;
    }
}

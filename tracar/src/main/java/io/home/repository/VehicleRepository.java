package io.home.repository;

import io.home.entity.Vehicle;

import java.util.List;

public interface VehicleRepository {

    List<Vehicle> findAll();

    Vehicle findOne(String vin);

    Vehicle findByVin(String vin);

    Vehicle create(Vehicle vc);

    Vehicle update(Vehicle vc);

    void delete(Vehicle vc);
}

package pl.dorotamiler.kidstherapy.controller.dao;

import pl.dorotamiler.kidstherapy.model.Facility;
import pl.dorotamiler.kidstherapy.storage.FacilityDb;
import pl.dorotamiler.kidstherapy.storage.FacilityJson;

import java.util.List;
import java.util.Optional;

public class FacilityRepository implements FacilityDao{

    private FacilityDb facilityDb;

    @Override
    public List<Facility> findAllFacilities() {
        return FacilityDb.getAllFacilities();
    }

//    @Override
//    public void add(Facility facility) {
//    }

    @Override
    public Optional<Facility> findByCity(String city) {
        return findAllFacilities()
                .stream()
                .filter(facility->facility.getAddress().getCity().equals(city))
                .findAny();
    }

    @Override
    public void persist() {
        FacilityJson.write(this.facilityDb.getAllFacilities());
    }

    @Override
    public Optional<Facility> findByName(String name) {
        return findAllFacilities()
                .stream()
                .filter(facility->facility.getName().equals(name))
                .findAny();
    }

    @Override
    public Optional<Facility> findByPostalCode(Integer postalCode) {
        return Optional.empty();
    }

    @Override
    public Optional<Facility> findBystalCode(Integer postalCode) {
        return findAllFacilities()
                .stream()
                .filter(facility->facility.getAddress().getPostalCode().equals(postalCode))
                .findAny();
    }

    @Override
    public Optional<Facility> findByPatientsPesel(String pesel) {
        return findAllFacilities()
                .stream()
                .filter(facility->facility.getPatients()..getPostalCode().equals(postalCode))
                .findAny();
    }
}

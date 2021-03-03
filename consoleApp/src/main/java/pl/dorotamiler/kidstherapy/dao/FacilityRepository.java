package pl.dorotamiler.kidstherapy.dao;

import pl.dorotamiler.kidstherapy.domain.Address;
import pl.dorotamiler.kidstherapy.domain.Facility;
import pl.dorotamiler.kidstherapy.domain.Patient;
import pl.dorotamiler.kidstherapy.storage.FacilityDb;

import java.util.List;
import java.util.Optional;

public class FacilityRepository implements FacilityDao{

    @Override
    public List<Facility> findAllFacilities() {
        return FacilityDb.getAllFacilities();
    }

    @Override
    public void add(Facility facility) {

    }

    @Override
    public Optional<Facility> findByCity(String city) {
        return findAllFacilities()
                .stream()
                .filter(facility->facility.getAddress().getCity().equals(city))
                .findAny();
    }

    @Override
    public Optional<Facility> findByName(String name) {
        return findAllFacilities()
                .stream()
                .filter(facility->facility.getName().equals(name))
                .findAny();
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

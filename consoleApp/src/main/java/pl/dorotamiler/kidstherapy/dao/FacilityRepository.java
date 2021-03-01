package pl.dorotamiler.kidstherapy.dao;

import pl.dorotamiler.kidstherapy.domain.Address;
import pl.dorotamiler.kidstherapy.domain.Facility;
import pl.dorotamiler.kidstherapy.domain.Patient;

import java.util.List;
import java.util.Optional;

public class FacilityRepository implements FacilityDao{

    @Override
    public List<Facility> findAllFacilities() {
        return null;
    }

    @Override
    public void add(Facility facility) {

    }

    @Override
    public Optional<Facility> findByCity(String city) {
        return Optional.empty();
    }

    @Override
    public Optional<Facility> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<Facility> findByAddress(Address address) {
        return Optional.empty();
    }

    @Override
    public Optional<Facility> findByPatient(Patient patient) {
        return Optional.empty();
    }

    @Override
    public Optional<Facility> getByCity(String city) {
        return Optional.empty();
    }

}

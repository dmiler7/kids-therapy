package pl.dorotamiler.kidstherapy.dao;

import pl.dorotamiler.kidstherapy.domain.Address;
import pl.dorotamiler.kidstherapy.domain.Facility;
import pl.dorotamiler.kidstherapy.domain.Patient;

import java.util.List;
import java.util.Optional;

public interface FacilityDao {
    List<Facility> findAllFacilities();

    void add(Facility facility);

    Optional<Facility> findByCity(String city);

    Optional<Facility> findByName(String name);

    Optional<Facility> findByAddress(Address address);

    Optional<Facility> findByPatient(Patient patient);

    Optional<Facility> getByCity(String city);

}

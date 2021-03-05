package pl.dorotamiler.kidstherapy.dao;

import pl.dorotamiler.kidstherapy.model.domain.Facility;

import java.util.List;
import java.util.Optional;

public interface FacilityDao {
    List<Facility> findAllFacilities();

    void add(Facility facility);

    Optional<Facility> findByName(String name);

    Optional<Facility> findByPostalCode(Integer postalCode);

    Optional<Facility> findByPatientsPesel(String pesel);

    Optional<Facility> findByCity(String city);

}

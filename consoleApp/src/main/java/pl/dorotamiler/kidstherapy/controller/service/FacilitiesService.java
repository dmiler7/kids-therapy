package pl.dorotamiler.kidstherapy.controller.service;

import pl.dorotamiler.kidstherapy.model.Facility;
import pl.dorotamiler.kidstherapy.storage.FacilityDb;

import java.util.List;
import java.util.stream.Collectors;

public class FacilitiesService {

    private final List<Facility> facilities = new FacilityDb().getAllFacilities();

    public List<Facility> findFacilityByCity(String city) {
        return facilities
                .stream()
                .filter(c -> city.equals(c.getAddress().getCity()))
                .collect(Collectors.toList());
    }

    public static void getFacilitiesByCity(List<Facility> facilities) {
        for (Facility facility : facilities) {
            System.out.println(facility.toString());
        }
    }
}
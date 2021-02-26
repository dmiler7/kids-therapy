package pl.dorotamiler.kidstherapy.dao;

import java.util.List;
import java.util.stream.Collectors;

public class FacilitiesService {

    private final List<Facility> facilities = new Facilities().getAllFacilities();

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
package pl.dorotamiler.kidstherapy.storage;

import pl.dorotamiler.kidstherapy.model.Address;
import pl.dorotamiler.kidstherapy.model.Facility;

import java.util.ArrayList;
import java.util.List;

public class FacilityDb {

    private static List<Facility> facilities;

    public static List<Facility> getAllFacilities() {
        if (facilities.size() == 0) {
            this.facilities = importDefaultFacilities();
        }
        return facilities;
    }

    private static void importDefaultFacilities() {
        List<Facility> facilities = new ArrayList<>();
        facilities.add(new Facility.Builder(1, "NCM Biwakowa",
                new Address("Biwakowa 8", "Gdansk", 80 - 299, "587312000"))
                .isFacilityNfz(true)
                .build());
        facilities.add(new Facility.Builder(2, "ODiTiS",
                new Address("Matemblewska 52", "Gdansk", 80 - 345, "583413020"))
                .isFacilityNfz(false)
                .build());
        facilities.add(new Facility.Builder(3, "Rubikon",
                new Address("Portowa 4", "Gdansk", 80 - 180, "512789990"))
                .isFacilityNfz(false)
                .build());
        facilities.add(new Facility.Builder(4, "Poradnia Psychologiczno-Pedagogiczna nr 1",
                new Address("Obywatelska 2", "Gdansk", 80 - 234, "583209871"))
                .isFacilityNfz(true)
                .build());
        facilities.add(new Facility.Builder(5, "Poradnia Psychologiczno-Pedagogiczna nr 4",
                new Address("Obywatelska 2", "Gdynia", 80 - 003, "584559090"))
                .isFacilityNfz(true)
                .build());
        facilities.add(new Facility.Builder(6, "Poradnia Psychologiczno-Pedagogiczna nr 3",
                new Address("Obywatelska 2", "Gdynia", 80 - 890, "583456789"))
                .isFacilityNfz(true)
                .build());
    }
}
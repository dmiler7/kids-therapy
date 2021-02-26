package pl.dorotamiler.kidstherapy.dao;

import java.util.ArrayList;
import java.util.List;

public class Facilities {

    private List<Facility> facilities;

    public Facilities() {
        this.facilities = importFacilities();
    }

    public List<Facility> getAllFacilities() {
        return facilities;
    }

    private static List<Facility> importFacilities() {
        List<Facility> facilities = new ArrayList<>();
        facilities.add(new Facility("NCM Biwakowa", new Address("Biwakowa 8", "Gdansk", 80 - 299, "587312000")));
        facilities.add(new Facility("ODiTiS", new Address("Matemblewska 52", "Gdansk", 80 - 345, "583413020")));
        facilities.add(new Facility("Rubikon", new Address("Portowa 4", "Gdansk", 80 - 180, "512789990")));
        facilities.add(new Facility("Poradnia Psychologiczno-Pedagogiczna nr 1", new Address("Obywatelska 2", "Gdansk", 80 - 234, "583209871")));
        facilities.add(new Facility("Poradnia Psychologiczno-Pedagogiczna nr 4", new Address("Obywatelska 2", "Gdynia", 80 - 003, "584559090")));
        facilities.add(new Facility("Poradnia Psychologiczno-Pedagogiczna nr 3", new Address("Obywatelska 2", "Gdynia", 80 - 890, "583456789")));
        return facilities;
    }
}
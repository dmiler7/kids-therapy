package pl.dorotamiler.kidstherapy.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.dorotamiler.kidstherapy.model.Facility;
import pl.dorotamiler.kidstherapy.storage.FacilityDb;

public class FacilityDbRepository implements FacilityDbView {

    private FacilityDb facilityDb;
    //    private List<Facility> facilities = new ArrayList<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(FacilityDbView.class);

    public FacilityDbRepository() {
    }

    public void displayFacility(Facility facility) {
        LOGGER.info(facility.toString());
    }

    public void setFacilityDb(FacilityDb facilityDb) {
        this.facilityDb = facilityDb;
    }

    public FacilityDb getFacilityDb() {
        return facilityDb;
    }

    public void add(Facility facility) {
        this.facilityDb.add(facility);
    }

    @Override
    public void displayFacilities() {
        for (Facility facility : this.facilityDb.) {
            System.out.println(facility.toString());
        }
    }
}

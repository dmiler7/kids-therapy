package pl.dorotamiler.kidstherapy;

import pl.dorotamiler.kidstherapy.dao.FacilitiesService;
import pl.dorotamiler.kidstherapy.dao.Facility;

import java.util.List;

import static pl.dorotamiler.kidstherapy.dao.FacilitiesService.getFacilitiesByCity;

/**
 * @author dmiler7
 * @date 08.02.2021
 * <p>
 * This application is providing solution in health
 * protection and education, which main goal is to
 * facilitate search of qualified specialists for
 * children with development disorders such as:
 * - delay in speech development
 * - sensory processing disorders
 * - multi-specialized comprehensive rehabilitation
 * <p>
 * It is crucial to have means to find quick and
 * adequate help in order to get the best shot at
 * preparing children for an independent life in
 * the community, apart from psychological assistance.
 * <p>
 * This app opens door for better insight into taboo
 * which are children's disabilities and developmental issues
 * which very often if taken care of early, can go away forever.
 * <p>
 * Fast action matters and this app is to provide
 * a quick and easy tool to search for specialists depending
 * on individual child's issue.
 * <p>
 * <p>
 * To start run the program:
 * 1. Install maven
 * - ubuntu: sudo apt install mvn
 * 2. Build project:
 * - enter its location (follow parallel pom.xml location)
 * - in terminal (bash) enter:
 * mvn clean install (package placed in local repository .m2/repository)
 */


public class App {
    public static void main(String[] args) {

//        System.out.println("Hello world");

        String filter = "Gdansk";
        FacilitiesService facilitiesService = new FacilitiesService();
        List<Facility> facilitiesByGdansk = facilitiesService.findFacilityByCity("Gdansk");
        getFacilitiesByCity(facilitiesByGdansk);
    }
}
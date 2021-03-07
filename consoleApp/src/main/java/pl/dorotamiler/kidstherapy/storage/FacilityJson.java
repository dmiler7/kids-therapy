package pl.dorotamiler.kidstherapy.storage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import pl.dorotamiler.kidstherapy.controller.dao.FacilityRepository;
import pl.dorotamiler.kidstherapy.model.Facility;

import java.io.*;
import java.util.List;

public class FacilityJson {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final String FACILITY_DB_JSON_FILE = "src/main/resources/facilityDb.json";

    public static void write(List<Facility> facilityDb) {

        try (Writer writer = new FileWriter(FACILITY_DB_JSON_FILE)) {

            GSON.toJson(facilityDb, writer);

        } catch (IOException e) {
            System.out.println("Error -> while file was beeing saved : file " + FACILITY_DB_JSON_FILE);
            System.out.println(e.toString());
        }
    }

    public static List<Facility> load(){
        try{
            Reader reader =new FileReader(FACILITY_DB_JSON_FILE)
            return (List<Facility>) GSON.fromJson(reader, FacilityDb.class);
        } catch(FileNotFoundException e){
            System.out.println("Error -> attempt to display file failed : file " + FACILITY_DB_JSON_FILE);
            System.out.println(e.toString());
        }
        return new FacilityRepository().;
    }
}

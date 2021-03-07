package pl.dorotamiler.kidstherapy.storage;

import pl.dorotamiler.kidstherapy.model.Therapy;
import pl.dorotamiler.kidstherapy.model.TherapyType;

import java.util.ArrayList;
import java.util.List;

public class TherapyDb {

    private static List<TherapyType> therapies;

    public static List<TherapyType> getAllTherapies() {
        if (therapies.size() == 0) {
            this.therapies = importDefaultTherapies();
        }
        return therapies;
    }

    private static void importDefaultTherapies() {
        List<Therapy> therapies = new ArrayList<>();
        therapies.add(new Therapy(TherapyType.COUNSELLING.name(), TherapyType.COUNSELLING.getDescription());
//        therapies.add(new Therapy(Therapy.TherapyType.LOGOPEDICS);
//        therapies.add(new Therapy.NEUROLOGOPEDICS.getTherapyType());
//        therapies.add(new Therapy.OPTODYSLEXIA.getTherapyType());
//        therapies.add(new Therapy.AUDITORY_ATTENTION.getTherapyType());
//        therapies.add(new Therapy.CPSYCHOLOGIST.getTherapyType());
//        therapies.add(new Therapy.DOG.getTherapyType());
//        therapies.add(new Therapy.DYSLEXIA.getTherapyType());
//        therapies.add(new Therapy.HAND.getTherapyType());
//        therapies.add(new Therapy.HIPPOTHERAPY.getTherapyType());
//        therapies.add(new Therapy.REHABILITATION.getTherapyType());
//        therapies.add(new Therapy.WARNKE.getTherapyType());
//        therapies.add(new Therapy.VISION.getTherapyType());
//        therapies.add(new Therapy.SPSYCHOLOGIST.getTherapyType());
//        therapies.add(new Therapy.SOCIAL_SKILLS.getTherapyType());
//        therapies.add(new Therapy.VISION.getTherapyType());
//        therapies.add(new Therapy.SHERBORNE.getTherapyType());
//        therapies.add(new Therapy.PHYSIOTHERAPY.getTherapyType());
//        therapies.add(new Therapy.PEDAGOGUE.getTherapyType());
//        therapies.add(new Therapy.OCCUPATIONAL.valueOf();
//        therapies.add(new Therapy.HYDROTHERAPY.getTherapyType());
//        therapies.add(new Therapy.PSYCHIATRIST.getTherapyType());

    }
}

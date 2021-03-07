package pl.dorotamiler.kidstherapy.model;

/**
 * Therapy enumeration.
 */

public enum TherapyType {
    NEUROLOGOPEDICS("neurologopedics"),
    AUDITORY_ATTENTION("auditory attention training"),
    OPTODYSLEXIA("optodyslexia therapy"),
    HAND("hand therapy"),
    VISION("vision therapy"),
    WARNKE("Warnke training"),
    SOCIAL_SKILLS("social skills training"),
    SI("sensory integration"),
    LOGOPEDICS("speech therapy"),
    CPSYCHOLOGIST("clinical psychologist"),
    PEDAGOGUE("special educator"),
    PSYCHOTHERAPY("psychotherapy"),
    REHABILITATION("physical therapy"),
    SHERBORNE("developmental movement therapy by V. Sherborne"),
    DYSLEXIA("developmental dyslexia therapy"),
    PSYCHIATRIST("psychiatrist"),
    PHYSIOTHERAPY("physiotherapy"),
    OCCUPATIONAL("occupational therapy"),
    COUNSELLING("counselling"),
    SPSYCHOLOGIST("special psychologist"),
    HIPPOTHERAPY("hippotherapy"),
    HYDROTHERAPY("hydrotherapy"),
    DOG("dog therapy");

    private final String description;

    TherapyType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Therapy type : " + this.description
                + super.toString();
    }
}

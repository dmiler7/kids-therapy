package pl.dorotamiler.kidstherapy.model.domain;

public enum Therapy {
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
    PSYSIOTHERAPY("physiotherapy"),
    OCCUPATIONAL("occupational therapy"),
    COUNSELLING("counselling"),
    SPSYCHOLOGIST("special psychologist"),
    HIPPOTHERAPY("hippotherapy"),
    HYDROTHERAPY("hydrotherapy"),
    DOG("dog therapy");

    private String therapyType;

    Therapy(String therapyType) {
        this.therapyType = therapyType;
    }

    public String getTherapyType() {
        return therapyType;
    }
}

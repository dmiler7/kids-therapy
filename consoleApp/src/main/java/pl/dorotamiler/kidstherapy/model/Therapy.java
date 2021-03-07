package pl.dorotamiler.kidstherapy.model;


public class Therapy {

    private TherapyType type;
    private String description;

    public Therapy(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public TherapyType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Therapy{" +
                "therapyType=" + this.type +
                ", description='" + description + '\'' +
                '}';
    }
}
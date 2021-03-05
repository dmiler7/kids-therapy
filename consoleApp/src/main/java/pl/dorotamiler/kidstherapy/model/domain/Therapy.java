package pl.dorotamiler.kidstherapy.domain;

import java.util.Objects;

public class Therapy {
    private String name;

    public Therapy() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Type of therapy :" + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Therapy therapy = (Therapy) o;
        return Objects.equals(name, therapy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
package pl.dorotamiler.kidstherapy.domain;

public enum Role {
    USER,
    ADMIN;

    private String role;
    Role(String description){
        this.description=description;
    }

    public String getRole() {
        return role;
    }
}

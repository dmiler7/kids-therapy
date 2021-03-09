package pl.dorotamiler.kidstherapy.domain;

public enum Role {
    USER,
    ADMIN;

    private String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
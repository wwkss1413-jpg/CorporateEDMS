package com.edms.model;

public class User {
    private String login;
    private String role;

    public User(String login, String role) {
        this.login = login;
        this.role = role;
    }

    public String getLogin() { return login; }
    public String getRole() { return role; }

    public boolean canApprove() {
        return "ADMIN".equals(role) || "REVIEWER".equals(role);
    }

    public boolean canSubmit() {
        return "AUTHOR".equals(role) || "ADMIN".equals(role);
    }
}
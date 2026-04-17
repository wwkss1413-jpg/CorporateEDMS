package com.edms.model;

public class Document {
    private String id;
    private String title;
    private String status;

    public Document(String id, String title) {
        this.id = id;
        this.title = title;
        this.status = "DRAFT";
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getStatus() { return status; }

    public void approve() {
        this.status = "APPROVED";
    }

    public void reject() {
        this.status = "REJECTED";
    }

    public void submitForReview() {
        this.status = "UNDER_REVIEW";
    }
}
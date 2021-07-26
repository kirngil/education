package com.kiran.education.model;

public class Inquiry {
    private String searchString;

    public Inquiry() {
    }

    public Inquiry(String searchString) {
        this.searchString = searchString;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
}
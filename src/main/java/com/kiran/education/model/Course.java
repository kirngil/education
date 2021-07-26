package com.kiran.education.model;

public class Course {
    private int id;
    private String courseName;
    private String picUrl;
    private String courseInstructor;
    private  int courseRatings;

    public Course(int id, String courseName, String picUrl, String courseInstructor, int courseRatings) {
        this.id = id;
        this.courseName = courseName;
        this.picUrl = picUrl;
        this.courseInstructor = courseInstructor;
        this.courseRatings = courseRatings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public int getCourseRatings() {
        return courseRatings;
    }

    public void setCourseRatings(int courseRatings) {
        this.courseRatings = courseRatings;
    }
}

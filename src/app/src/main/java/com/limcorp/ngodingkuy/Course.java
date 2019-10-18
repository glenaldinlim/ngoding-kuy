package com.limcorp.ngodingkuy;

public class Course {
    private String name;
    private String platform;
    private String available_course;
    private String learning_method;
    private String site_url;
    private int photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getAvailable_course() {
        return available_course;
    }

    public void setAvailable_course(String available_course) {
        this.available_course = available_course;
    }

    public String getLearning_method() {
        return learning_method;
    }

    public void setLearning_method(String learning_method) {
        this.learning_method = learning_method;
    }

    public String getSite_url() {
        return site_url;
    }

    public void setSite_url(String site_url) {
        this.site_url = site_url;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}

package com.company.Model;

import java.util.Date;

public class NewsModel {
    private int id;
    private String headline;
    private String text;
    private Date timeOfPublication;

    public NewsModel() {
    }

    public NewsModel(int id, String headline, String text, Date timeOfPublication) {
        this.id = id;
        this.headline = headline;
        this.text = text;
        this.timeOfPublication = timeOfPublication;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getTimeOfPublication() {
        return timeOfPublication;
    }

    public void setTimeOfPublication(Date timeOfPublication) {
        this.timeOfPublication = timeOfPublication;
    }
}

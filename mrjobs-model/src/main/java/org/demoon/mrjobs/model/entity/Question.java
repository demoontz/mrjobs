package org.demoon.mrjobs.model.entity;

import java.util.List;

public class Question {

    private int          id;
    private String       text;
    private List<Answer> availableAnswers;
    private int          currentAnswerId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Answer> getAvailableAnswers() {
        return availableAnswers;
    }

    public void setAvailableAnswers(List<Answer> availableAnswers) {
        this.availableAnswers = availableAnswers;
    }

    public Answer getCurrentAnswer() {
        return availableAnswers.get(currentAnswerId);
    }

    public int getCurrentAnswerId() {
        return currentAnswerId;
    }

    public void setCurrentAnswerId(int currentAnswerId) {
        this.currentAnswerId = currentAnswerId;
    }
}

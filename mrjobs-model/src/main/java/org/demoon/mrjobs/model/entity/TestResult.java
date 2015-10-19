package org.demoon.mrjobs.model.entity;

import java.io.Serializable;

/**
 * Created by demoon on 10/19/2015.
 */
public class TestResult
    implements Serializable{
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

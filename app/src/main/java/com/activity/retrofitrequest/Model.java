package com.activity.retrofitrequest;

import androidx.annotation.NonNull;

public class Model {
    private int count;
    private String name;
    private String gender;
    private double probability;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @NonNull
    @Override
    public String toString() {
        return "Count: " + count + "; Name: " + name + "; Gender: " + gender + "; Probability: " + probability;
    }
}

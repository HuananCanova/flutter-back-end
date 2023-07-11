package br.ufsm.csi.poow2.spring_rest_security.model;

import java.util.List;

public class Workout {
    private String title;
    private List<Exercise> exercises;
    //private WorkoutStrategy strategy;


    public Workout(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public Workout(String title, List<Exercise> exercises) {
        this.title = title;
        this.exercises = exercises;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }
}

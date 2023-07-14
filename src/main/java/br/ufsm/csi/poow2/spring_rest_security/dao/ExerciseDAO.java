package br.ufsm.csi.poow2.spring_rest_security.dao;

import br.ufsm.csi.poow2.spring_rest_security.model.Exercise;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


public class ExerciseDAO {

    public List<Exercise> getAllExercises() {
        List<Exercise> exercises = new ArrayList<>();

        Exercise exercise1 = new Exercise(1, "Supino", "Peito");
        exercises.add(exercise1);

        Exercise exercise2 = new Exercise(2, "Supino inclinado", "Peito");
        exercises.add(exercise2);

        Exercise exercise3 = new Exercise(3, "Elevacao lateral", "Ombros");
        exercises.add(exercise3);

        Exercise exercise4 = new Exercise(4, "Elevacao frontal", "Ombros");
        exercises.add(exercise4);

        Exercise exercise5 = new Exercise(5, "Rosca alternada", "Bíceps");
        exercises.add(exercise5);

        Exercise exercise6 = new Exercise(6, "Agachamento", "Perna");
        exercises.add(exercise6);

        Exercise exercise7 = new Exercise(7, "Crucifixo", "Peito");
        exercises.add(exercise7);

        Exercise exercise8 = new Exercise(8, "Prancha", "Abs");
        exercises.add(exercise8);

        return exercises;
    }
}


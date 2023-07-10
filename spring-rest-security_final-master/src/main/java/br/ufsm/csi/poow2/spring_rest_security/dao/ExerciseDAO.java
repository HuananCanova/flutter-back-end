package br.ufsm.csi.poow2.spring_rest_security.dao;
import br.ufsm.csi.poow2.spring_rest_security.model.Exercise;

import java.util.ArrayList;
import java.util.List;


public class ExerciseDAO {
    private static List<Exercise> exercises = new ArrayList<>();

    static {
        exercises.add(new Exercise(1, "Supino", "Peito"));
        exercises.add(new Exercise(2, "Supino inclinado", "Peito"));
        exercises.add(new Exercise(3, "Elevação lateral", "Ombros"));
        exercises.add(new Exercise(4, "Elevação frontal", "Ombros"));
        exercises.add(new Exercise(5, "Rosca alternada", "Bíceps"));
        exercises.add(new Exercise(6, "Agachamento", "Perna"));
        exercises.add(new Exercise(7, "Crucifixo", "Peito"));
        exercises.add(new Exercise(8, "Prancha", "Abs"));
    }

    public List<Exercise> getExerciseList() {
        return exercises;
    }
}


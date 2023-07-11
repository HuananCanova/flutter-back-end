package br.ufsm.csi.poow2.spring_rest_security.dao;

import br.ufsm.csi.poow2.spring_rest_security.model.Exercise;
import br.ufsm.csi.poow2.spring_rest_security.model.Workout;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WorkoutDAO {
    private static List<Workout> workouts = new ArrayList<>();
    private static ExerciseDAO exerciseDAO = new ExerciseDAO();


    static {
        // Criação dos workouts com título e exercícios selecionados
        Workout workout1 = new Workout("Workout 1", exerciseDAO.getExerciseList());
        Workout workout2 = new Workout("Workout 2", exerciseDAO.getExerciseList());
        Workout workout3 = new Workout("Workout 3", exerciseDAO.getExerciseList());
        Workout workout4 = new Workout("Workout 4", exerciseDAO.getExerciseList());
        Workout workout5 = new Workout("Workout 5", exerciseDAO.getExerciseList());

        // Adição dos workouts na lista
        workouts.add(workout1);
        workouts.add(workout2);
        workouts.add(workout3);
        workouts.add(workout4);
        workouts.add(workout5);
    }

    public List<Workout> getWorkouts() {
        System.out.println("lista acessada");
        return workouts;
    }
}

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

    public void addWorkout(Workout workout) {
         workouts.add(workout);
     }


    public List<Workout> getWorkouts() {
        System.out.println("lista acessada");
        return workouts;
    }


}

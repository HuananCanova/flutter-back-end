package br.ufsm.csi.poow2.spring_rest_security.controller;

import br.ufsm.csi.poow2.spring_rest_security.model.Workout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public abstract class WorkoutControllerDecorator implements WorkoutController {
    protected WorkoutController workoutController;
    private static final Logger logger = LoggerFactory.getLogger(WorkoutControllerDecorator.class);

    public WorkoutControllerDecorator(WorkoutController workoutController) {
        this.workoutController = workoutController;
    }

    @Override
    public List<Workout> listWorkouts() {
        logger.info("Accessed /workout/workouts endpoint");
        return workoutController.listWorkouts();
    }
}

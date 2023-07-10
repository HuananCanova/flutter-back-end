package br.ufsm.csi.poow2.spring_rest_security.controller;
import br.ufsm.csi.poow2.spring_rest_security.dao.WorkoutDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.ufsm.csi.poow2.spring_rest_security.model.Workout;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

public class WorkoutControllerImpl implements WorkoutController {
    private static final Logger logger = LoggerFactory.getLogger(WorkoutControllerImpl.class);
    private final WorkoutDAO workoutDAO;

    public WorkoutControllerImpl(WorkoutDAO workoutDAO) {
        this.workoutDAO = workoutDAO;
    }

    @Override
    @GetMapping("/list")
    public String testWorkout() {
        return "feito list workout";
    }

    @Override
    @GetMapping("/workouts")
    public ArrayList<Workout> listWorkouts() {
        return null;
    }

    public abstract class WorkoutControllerDecorator implements WorkoutController {
        protected WorkoutController workoutController;

        public WorkoutControllerDecorator(WorkoutController workoutController) {
            this.workoutController = workoutController;
        }

        @Override
        public String testWorkout() {
            logger.info("Accessed /workout/list endpoint");
            return workoutController.testWorkout();
        }

        @Override
        public ArrayList<Workout> listWorkouts() {
            logger.info("Accessed /workout/workouts endpoint");
            return workoutController.listWorkouts();
        }
    }

    public class LoggingWorkoutControllerDecorator extends WorkoutControllerDecorator {
        private static final Logger logger = LoggerFactory.getLogger(LoggingWorkoutControllerDecorator.class);

        public LoggingWorkoutControllerDecorator(WorkoutController workoutController) {
            super(workoutController);
        }

        @Override
        public String testWorkout() {
            logger.info("Logging request to /workout/list endpoint");
            return super.testWorkout();
        }

        @Override
        public ArrayList<Workout> listWorkouts() {
            logger.info("Logging request to /workout/workouts endpoint");
            return super.listWorkouts();
        }
    }
}

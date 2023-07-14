package br.ufsm.csi.poow2.spring_rest_security.controller;

import br.ufsm.csi.poow2.spring_rest_security.dao.WorkoutDAO;
import br.ufsm.csi.poow2.spring_rest_security.model.Exercise;
import br.ufsm.csi.poow2.spring_rest_security.model.Workout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WorkoutControllerImpl implements WorkoutController {
    private static final Logger logger = LoggerFactory.getLogger(WorkoutControllerImpl.class);
    private final WorkoutDAO workoutDAO;
    private List<LogObserver> logObservers;

    public WorkoutControllerImpl(WorkoutDAO workoutDAO) {
        this.workoutDAO = workoutDAO;
        this.logObservers = new ArrayList<>(); // Inicializar a lista logObservers
    }

    @Override
    @GetMapping("/workouts/list")
    public List<Workout> listWorkouts() {
        logger.info("Accessed /workout/workouts endpoint");
        return workoutDAO.getWorkouts();
    }

    @Override
    @PostMapping("/workout/save")
    public void addWorkout(String title, List<Exercise> exercises) {
        Workout workout = new Workout(title, exercises);
    }

    public void registerLogObserver(LogObserver observer) {
        logObservers.add(observer);
    }

    public void removeLogObserver(LogObserver observer) {
        logObservers.remove(observer);
    }

    private void notifyLogObservers(String logMessage) {
        for (LogObserver observer : logObservers) {
            observer.updateLog(logMessage);
        }
    }
}

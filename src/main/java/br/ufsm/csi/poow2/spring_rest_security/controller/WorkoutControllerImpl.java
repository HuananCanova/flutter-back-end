package br.ufsm.csi.poow2.spring_rest_security.controller;

import br.ufsm.csi.poow2.spring_rest_security.dao.WorkoutDAO;
import br.ufsm.csi.poow2.spring_rest_security.model.Exercise;
import br.ufsm.csi.poow2.spring_rest_security.model.Workout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/workout")
@CrossOrigin("*")
public class WorkoutControllerImpl implements WorkoutController {
    private static final Logger logger = LoggerFactory.getLogger(WorkoutControllerImpl.class);
    private final WorkoutDAO workoutDAO;
    private List<LogObserver> logObservers;

    public WorkoutControllerImpl(WorkoutDAO workoutDAO) {
        this.workoutDAO = workoutDAO;
        this.logObservers = new ArrayList<>(); // Inicializar a lista logObservers
    }

    @Override
    @GetMapping("/list")
    public List<Workout> listWorkouts() {
        logger.info("Accessed /workout/workouts endpoint");
        return workoutDAO.getWorkouts();
    }


    @Override
    @PostMapping("/save")
    public void addWorkout(@RequestBody Workout workout) {
        workoutDAO.addWorkout(workout);
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

package br.ufsm.csi.poow2.spring_rest_security.controller;

import br.ufsm.csi.poow2.spring_rest_security.model.Workout;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/workout")
@CrossOrigin(origins = "*")
public interface WorkoutController {
    String testWorkout();

    ArrayList<Workout> listWorkouts();
}
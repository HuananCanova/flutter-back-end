package br.ufsm.csi.poow2.spring_rest_security.controller;

import br.ufsm.csi.poow2.spring_rest_security.model.Exercise;
import br.ufsm.csi.poow2.spring_rest_security.model.Workout;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public interface WorkoutController {
    List<Workout> listWorkouts();
    void addWorkout(@RequestBody Workout workout);
}

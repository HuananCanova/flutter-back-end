package br.ufsm.csi.poow2.spring_rest_security.controller;

import br.ufsm.csi.poow2.spring_rest_security.model.Workout;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public interface WorkoutController {
    List<Workout> listWorkouts();
}

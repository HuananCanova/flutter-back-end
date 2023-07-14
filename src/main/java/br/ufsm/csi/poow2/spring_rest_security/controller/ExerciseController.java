package br.ufsm.csi.poow2.spring_rest_security.controller;

import br.ufsm.csi.poow2.spring_rest_security.dao.ExerciseDAO;
import br.ufsm.csi.poow2.spring_rest_security.model.Exercise;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exercise")
@CrossOrigin(origins = "*")
public class ExerciseController {
    ExerciseDAO exerciseDAO = new ExerciseDAO();

    @GetMapping("/list")
    public List<Exercise> listExercise() {
        return exerciseDAO.getAllExercises();
    }

}

package edu.mum.cs.cs425.eregistrar.controller;

import edu.mum.cs.cs425.eregistrar.model.Student;
import edu.mum.cs.cs425.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/register")
    public String registerForm(@ModelAttribute("newStudent")Student student){

        return "register";

    }
    @PostMapping("/add")
    public String addStudent(@Valid @ModelAttribute("newStudent") Student student, Model model, BindingResult result){
        if(result.hasErrors()){
            return "register";
        }

        studentService.save(student);
        return "students";
    }
}

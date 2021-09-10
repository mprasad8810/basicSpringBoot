package com.springboot.application.basicSpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.springboot.application.basicSpringBoot.bean.Course;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Coursecontroller {
    List<Course> list=null;
    @GetMapping("/coursedetail")
    public List<Course> getAllCours(){
       list = Arrays.asList(new Course(1, "Computer", "Ranga"),
                new Course(2, "Java", "Ranga"));
        return list;
    }
    @GetMapping("/coursedetail/1")
    public Course getsingleCours1(){
        getAllCours();
       return list.get(0);
    }
    @GetMapping("/coursedetail/2")
    public Course getsingleCours2(){
        getAllCours();
        return list.get(1);
    }
}

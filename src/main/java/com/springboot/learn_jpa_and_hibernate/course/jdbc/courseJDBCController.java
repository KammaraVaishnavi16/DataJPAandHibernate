package com.springboot.learn_jpa_and_hibernate.course.jdbc;

import com.springboot.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/jdbc/courses")

@RestController
public class courseJDBCController {

    @Autowired
    private courseJDBCRepository courseJDBCRepository;

    public void insertCourse(Course course){


    }

}

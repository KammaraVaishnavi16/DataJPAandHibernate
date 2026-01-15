package com.springboot.learn_jpa_and_hibernate.course.jdbc;

import com.springboot.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class courseJDBCCommandLineRunner implements CommandLineRunner {

    @Autowired
    private courseJDBCRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn JDBC", "in28minutes"));
        repository.insert(new Course(2, "Learn Spring JDBC", "in28minutes"));
        repository.insert(new Course(3, "Learn Advanced JDBC", "in28minutes"));
//        repository.delete();
        repository.deleteById(1);

        System.out.println(repository.selectById(2));
    }
}

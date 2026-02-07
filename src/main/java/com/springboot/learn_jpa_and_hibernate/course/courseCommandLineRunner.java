package com.springboot.learn_jpa_and_hibernate.course;

import com.springboot.learn_jpa_and_hibernate.course.jdbc.courseJDBCRepository;
import com.springboot.learn_jpa_and_hibernate.course.jpa.courseJPARepository;
import com.springboot.learn_jpa_and_hibernate.course.springdatajpa.courseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class courseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private courseJDBCRepository repository;

//    @Autowired
//    private courseJPARepository repository;

    @Autowired
    private courseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        //jdbc queries calls

//        repository.insert(new Course(1, "Learn JDBC", "in28minutes"));
//        repository.insert(new Course(2, "Learn Spring JDBC", "in28minutes"));
//        repository.insert(new Course(3, "Learn Advanced JDBC", "in28minutes"));
//        repository.delete();
//        repository.deleteById(1);
//
//        System.out.println(repository.selectById(2));

        //jpa query calls
//        repository.insert(new Course(4, "Learn JPA", "in28minutes"));
//        repository.insert(new Course(5, "Learn Spring JPA", "in28minutes"));
//        repository.insert(new Course(6, "Learn Advanced JPA", "in28minutes"));
//        repository.deleteById(4);
//        System.out.println(repository.findById(5));

        //spring data jpa calls
        repository.save(new Course(7, "Learn Spring Data JPA", "in28minutes"));
        repository.save(new Course(8, "Learn Advanced Spring Data JPA", "in28minutes"));
        repository.save(new Course(9, "Learn Spring Data JPA with Hibernate", "in28minutes"));
        repository.save(new Course(10, "Learn Spring Data JPA and Hibernate", "in28minutes"));
        repository.deleteById(7L);
        System.out.println(repository.findById(8L));
        System.out.println(repository.findAll());
        System.out.println(repository.count());
        repository.findByAuthor("in28minutes").forEach(System.out::println);
        System.out.println( repository.findByName("Learn Spring Data JPA and Hibernate"));

    }
}

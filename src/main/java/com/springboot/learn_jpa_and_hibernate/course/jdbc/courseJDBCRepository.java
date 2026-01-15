package com.springboot.learn_jpa_and_hibernate.course.jdbc;

import com.springboot.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class courseJDBCRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public static String INSERT_QUERY =
            """
            insert into course (id, name, author) values(?,?,?)
            """;

    public static String DELETE_QUERY =
            """
            delete from course where id=?
            """;

    public static String SELECT_QUERY =
            """
            select * from course where id=?
            """;
//    public void insert(){
//        jdbcTemplate.update(INSERT_QUERY);
//    }
//
//    public void delete(){
//        jdbcTemplate.update(DELETE_QUERY);
//    }

    public void insert(Course course){
        jdbcTemplate.update(INSERT_QUERY,
                course.getId(),
                course.getName(),
                course.getAuthor()
        );
    }

    public void deleteById(long id){
        jdbcTemplate.update(DELETE_QUERY,id);
    }

    public Course selectById(long id){
//        return jdbcTemplate.queryForObject(SELECT_QUERY,
//                new Object[]{id},
//                (rs, rowNum) ->
//                        new Course(
//                                rs.getLong("id"),
//                                rs.getString("name"),
//                                rs.getString("author")
//                        )
//        );
        //Another way to do the same thing
        //ResultSet -> Bean => RowMapper

        return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class),id);
    }

}

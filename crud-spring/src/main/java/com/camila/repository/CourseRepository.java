package com.camila.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.camila.model.Course;


@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
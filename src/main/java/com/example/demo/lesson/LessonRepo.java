package com.example.demo.lesson;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface LessonRepo extends CrudRepository<Lesson, String>{

	List<Lesson> findLessonByCourseId(String courseId);

}

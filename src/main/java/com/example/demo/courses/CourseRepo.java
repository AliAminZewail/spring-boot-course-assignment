package com.example.demo.courses;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CourseRepo extends CrudRepository<Course, String>{
	List<Course> findCourseByTopicId(String topicId);
	

}

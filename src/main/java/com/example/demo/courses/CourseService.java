package com.example.demo.courses;
import com.example.demo.topics.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepo courseRepo;
	

	public List<Course> getAll(String id){
		List<Course> result = new ArrayList<>();
		courseRepo.findCourseByTopicId(id).forEach((course)-> result.add(course));
		return result;
	}
	
	
	public Course getCourse(String id) {
		return courseRepo.findById(id).get();
	}
	
	
	public void add(Course course) {
		courseRepo.save(course);
		
	}

	
	public void put(String id, Course course) {
		courseRepo.save(course);
	
	}


	public void delete(String id) {
		courseRepo.deleteById(id);

	}
	
	
}

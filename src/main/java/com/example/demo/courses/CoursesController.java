package com.example.demo.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.topics.Topic;

@RestController
public class CoursesController {
	@Autowired
	private CourseService courseService;
	
	
	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable String topicId){
		
		return courseService.getAll(topicId);
	}
	
	
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id){
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
	public void postCourse(@RequestBody Course course, @PathVariable String topicId){
		course.setTopic(new Topic (topicId, "", ""));
		courseService.add(course);
		
	}
	

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
	public void putCourse(@RequestBody Course course, @PathVariable String id, @PathVariable String topicId){
		
		course.setTopic(new Topic (topicId, "", ""));
		 courseService.put(id, course);
		 
	}

	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable String id){
		
		 courseService.delete(id);
		
	}

	
	
}

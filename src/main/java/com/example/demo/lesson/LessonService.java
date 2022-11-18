package com.example.demo.lesson;
import com.example.demo.topics.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {
	
	@Autowired
	private LessonRepo lessonRepo;
	

	public List<Lesson> getAll(String id){
		List<Lesson> result = new ArrayList<>();
		lessonRepo.findLessonByCourseId(id).forEach((lesson)-> result.add(lesson));
		return result;
	}
	
	
	public Lesson getLesson(String id) {
		return lessonRepo.findById(id).get();
	}
	
	
	public void add(Lesson lesson) {
		lessonRepo.save(lesson);
		
	}

	
	public void put(Lesson course) {
		lessonRepo.save(course);
	
	}


	public void delete(String id) {
		lessonRepo.deleteById(id);

	}
	
	
}

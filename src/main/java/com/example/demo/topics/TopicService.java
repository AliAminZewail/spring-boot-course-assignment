package com.example.demo.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepo topicrepo;
	

	public List<Topic> getAll(){
		List<Topic> result = new ArrayList<>();
		topicrepo.findAll().forEach((topic)-> result.add(topic));
		return result;
	}
	
	
	public Topic getTopic(String id) {
		return topicrepo.findById(id).get();
	}
	
	
	public void add(Topic topic) {
		topicrepo.save(topic);
		
	}

	
	public void put(String id, Topic topic) {
		topicrepo.save(topic);
	
	}


	public void delete(String id) {
		topicrepo.deleteById(id);

	}
	
	
}

package com.example.demo.topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	@Autowired
	private TopicService topicservice;
	
	
	@RequestMapping("/topics")
	public List<Topic> getTopics(){
		
		return topicservice.getAll();
	}
	
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id){
		return topicservice.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void postTopic(@RequestBody Topic topic){
		
		topicservice.add(topic);
		//return ;
	}
	

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public String putTopic(@RequestBody Topic topic, @PathVariable String id){
		
		 topicservice.put(id, topic);
		 return "status : ok";
	}

	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public String deleteTopic(@PathVariable String id){
		
		 topicservice.delete(id);
		 return "status : ok";
	}

	
	
}

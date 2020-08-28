package io.javabrains.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController 
{
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic)
	{
		topicService.addTopic(topic);
	}
}

/*
 * The generated JSON (http://localhost:8080/topics) has key names corresponding to property names of
 * the Topic class. The JSON values are the values of those properties.
 * 
 * How did the JSON conversion happen? It's something Spring MVC does for us.
 * 
 * Easy to create a Restful API with Spring MVC
 * 
 * Create a controller > map a particular request to a method > business logic happens in that method
 * 
 * Further request, we can actually make a call to get the data from the database
 * 
 * The REST API we'll build
 * 
 * GET		/topics			Gets all topics
 * GET		/topics/id		Gets the topic
 * POST		/topics			Create new topic
 * PUT		/topics/id		Updates the topic
 * DELETE	/topics.id		Deletes the topic
 * 
 * 
 * 
 * 
 * 
 */
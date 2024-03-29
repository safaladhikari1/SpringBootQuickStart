package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService 
{
	// We created ArrayList to make it mutable, so we can use POST Request. Arrays.asList is not mutable
	// Then, ArrayList gets a copy of Arrays.asList, so it is mutable.
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("javascript", "JavaScript", "JavaScript Description")		
			));
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	public Topic getTopic(String id)
	{
		return topics.stream()
					 .filter(t -> t.getId().equals(id))
					 .findFirst()
					 .get();
	}
	
	public void addTopic(Topic topic)
	{
		topics.add(topic);
	}
}















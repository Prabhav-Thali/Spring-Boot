package com.psl.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepo topicrepo;
	
	List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("java"),
			new Topic("c++")));

	public List<Topic> getAllTopics() {
//		return topics;
		List<Topic> topics=new ArrayList<>();
		topicrepo.findAll().forEach(topics::add);//method reference
	return topics;
	}

	public Topic getTopic(String name) {
//		return topics.stream().filter(t -> t.getName().equals(name))
//				.findFirst().get();
		return topicrepo.findOne(name);
	}

	public void addTopic(Topic topic) {
//		topics.add(topic);
		topicrepo.save(topic);
		
	}
}

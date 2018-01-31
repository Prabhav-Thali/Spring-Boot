package io.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("java"),
			new Topic("c++")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String name) {
		return topics.stream().filter(t -> t.getName().equals(name))
				.findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}

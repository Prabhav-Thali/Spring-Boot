package com.psl.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.psl.topic.Topic;

@Entity
public class Course {

	@Id
	String name;

	@ManyToOne
	private Topic topic	;
	
	
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course() {
	}

	public Course(String name,String topicname) {
		super();
		this.name = name;
		this.topic=new Topic(topicname);
	}

}

package com.psl.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

	@Id
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Topic() {
	}

	public Topic(String name) {
		super();
		this.name = name;
	}

}

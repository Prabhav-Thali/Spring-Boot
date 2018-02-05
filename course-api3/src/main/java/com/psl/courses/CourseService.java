package com.psl.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepo courserepo;
	
//	List<Course> topics = new ArrayList<>(Arrays.asList(new Course("java"),
//			new Course("c++")));

	public List<Course> getAllCourses(String topicname) {
//		return topics;
		List<Course> courses=new ArrayList<>();
		courserepo.findByTopicName(topicname).forEach(courses::add);//method reference
	return courses;
	}

	public Course getCourse(String name) {
//		return topics.stream().filter(t -> t.getName().equals(name))
//				.findFirst().get();
		return courserepo.findOne(name);
	}

	public void addCourse(Course course) {
//		topics.add(topic);
		courserepo.save(course);
		
	}
}

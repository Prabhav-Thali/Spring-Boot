package com.psl.courses;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.psl.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	
	
	@RequestMapping("/topics/{name}/courses")
	public List<Course> getAllCourses(@PathVariable String name) {
		return courseService.getAllCourses(name);
		
	}
	
	@RequestMapping("/topics/{topicname}/courses/{name}")
	public Course getCourse(@PathVariable String name){
		return courseService.getCourse(name);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics/{topicname}/courses")
	public void addCourse(@RequestBody Course course,@PathVariable String topicname){
		course.setTopic(new Topic(topicname));
		courseService.addCourse(course);
		
	}

	

}

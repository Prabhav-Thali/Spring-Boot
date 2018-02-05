package com.psl.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepo extends CrudRepository<Course,String> {

		public List<Course> findByTopicName(String topicname);
}

package io.grishmaspringboot.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRespository topicRespository;
	
	
	public List<Course> getAllTopics(){
		List<Course> topics= new ArrayList<>();
		topicRespository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Course getTopic(String id){
		return topicRespository.findOne(id);
	}

	public void addTopic(Course topic) {
		topicRespository.save(topic);
	}

	public void updateTopic(Course topic, String id) {
		topicRespository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRespository.delete(id);
	}
}

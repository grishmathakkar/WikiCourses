package io.grishmaspringboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRespository topicRespository;
	
	
	public List<Topic> getAllTopics(){
		List<Topic> topics= new ArrayList<>();
		topicRespository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id){
		return topicRespository.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicRespository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		topicRespository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRespository.delete(id);
	}
}

package com.eben.startup.startup.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class topicsConstroler {


    //Creating instance of TopicService using spring
    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
    public List<Topics> getAll(){

        return topicService.getTopics();
    }
    @RequestMapping("/topics/{id}")
    public Topics getT(@PathVariable String id){

        return topicService.getTopicById(id);
    }
    //Post request
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public List<Topics> getATopic(@RequestBody Topics topic){

        topicService.addTopic(topic);
        return topicService.getTopics();
    }

    //Put request
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topics topic, @PathVariable String id){
        topicService.getUpdateTopic(id, topic);
    }

    //Delete request
    @RequestMapping(method = RequestMethod.DELETE, value = "/topic/{id}")
    public void deleteTopic(@PathVariable String id){

        topicService.getDeletTopic(id);
    }
}

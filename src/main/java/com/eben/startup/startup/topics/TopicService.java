package com.eben.startup.startup.topics;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topics> topics = new ArrayList<>(Arrays.asList(
                new Topics("spring1","When the Last Sword is Drawn (Mibu gishi den)","Other bilateral ligation and crushing of fallopian tubes"),
               new Topics("spring2","Going Ape!","Other operations on septa of heart"),
               new Topics("spring3","Peyton Place","Injection or infusion of cancer chemotherapeutic substance"),
               new Topics("spring4","Shock and Awe: The Story of Electricity","Open and other replacement of aortic valve with tissue graft"),
               new Topics("spring5","Smokers Only (Vagón Fumador)","Orbitotomy with insertion of orbital implant"),
               new Topics("spring6","Days Of Darkness","Suture of laceration of small intestine, except duodenum"),
               new Topics("spring7","Straight Story, The","Fixation of small intestine to abdominal wall"),
               new Topics("spring8","Frank McKlusky, C.I.","Anastomosis to anus"),
               new Topics("spring9","Dove, The","Laparoscopic robotic assisted procedure"),
               new Topics("spring10","Kung Fu Panda","Local excision of rectal lesion or tissue")
            ));

    public List<Topics> getTopics(){
        return topics;
    }
    public Topics getTopicById(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
    //Add topic
    public List<Topics> addTopic(Topics topic){
      topics.add(topic);
      return topics;
    }

    //Update topics
    public void getUpdateTopic( String id,Topics top){
        //Using for loop
        for(int i = 0; i < topics.size(); i++){
            Topics t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i, top);
                return;
            }
        }
    }

    //Deleting method
    public void getDeletTopic( String id){
        //Using for loop
        topics.removeIf(topics1 -> topics1.getId().equals(id));
    }
}

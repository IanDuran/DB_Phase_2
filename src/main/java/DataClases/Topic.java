package DataClases;

import java.util.List;

/**
 * Created by Ian on 13/5/2017.
 */
public class Topic {
    private int artificialId;
    private String name;
    private Topic parentTopic;
    private List<Topic> topicChildren;
    private List<Exercise> associatedExercises;

    public Topic(int artificialId, String name, Topic parentTopic){
        this.artificialId = artificialId;
        this.name = name;
        this.parentTopic = parentTopic;
    }

    public int getArtificialId() {
        return artificialId;
    }

    public String getName() {
        return name;
    }

    public Topic getParentTopic() {
        return parentTopic;
    }

    public List<Topic> getTopicChildren() {
        return topicChildren;
    }

    public void setTopicChildren(List<Topic> topicChildren) {
        this.topicChildren = topicChildren;
    }

    public List<Exercise> getAssociatedExercises() {
        return associatedExercises;
    }

    public void setAssociatedExercises(List<Exercise> associatedExercises) {
        this.associatedExercises = associatedExercises;
    }
}

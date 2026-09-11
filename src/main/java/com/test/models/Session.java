package com.test.models;

public class Session {
    private int duration;
    private String topic;
    private int count;

    Session(int duration, int count, String topic){
        this.duration = duration;
        this.count = count;
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }
    public int getCount() {
        return count;
    }
    public int getDuration() {
        return duration;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int calcTotal(){
        return duration * count;
    }
}

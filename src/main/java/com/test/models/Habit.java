package com.test.models;

public class Habit {
    private String name;
    private int id;
    private boolean done;
    private int streak;
    private static int count = 0;

    Habit(String name, int streak){
        this.name = name;
        this.streak = streak;
        done = false;
        setTaskId(++count);
    }

    public int getId(){
        return id;
    }
    public int getStreak(){
        return streak;
    }
    public boolean getDone(){
        return done;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setTaskId(int id){
        this.id = id;
    }

    public void checkDonete(){
        done = !done;
    }

    public void setStreak(int streak){
        this.streak = streak;
    }
}

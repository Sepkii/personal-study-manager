package com.test.service;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.models.Session;

public class JsonReader {

    ObjectMapper objectMapper = new ObjectMapper();
    
    Session s1 = new Session(45, 2, "C");

    public void example1() throws StreamWriteException, DatabindException, IOException{
        List<Session> sessions = List.of(
    new Session(45, 2, "C"),
    new Session(90, 5, "Java"),
    new Session(30, 1, "Python"));

    objectMapper.writeValue(new File("src/main/resources/sessions.json"), sessions);

    }


    public void jsonToObject() throws JsonMappingException, JsonProcessingException, IOException{
        List<Session> sessions = objectMapper.readValue(new File("src/main/resources/sessions.json"), new TypeReference<List<Session>>(){});

        for (Session s : sessions) {
            System.out.println("duration "+s.getDuration()+ " - count: " +s.getCount()+" - topic: "+s.getTopic());
        }
    }
    

}

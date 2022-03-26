package com.company;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Zadanie7<userJson> {
        ObjectMapper objectMapper = new ObjectMapper();

        User userObject = new User("John", 21);
        userJson userJson = (userJson) objectMapper.writeValueAsString(userObject);
    public Zadanie7() throws JsonProcessingException {
    }

}
package com.company;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Zadanie8 {
    ObjectMapper objectMapper = new ObjectMapper();

    String userJson = "{\"name\":\"John\",\"age\":21}";
    User userObject = objectMapper.readValue(userJson, User.class);

    public Zadanie8() throws JsonProcessingException {
    }
}

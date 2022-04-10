package com.es2.bridge;

import com.es2.composite.Shoe;

import java.util.LinkedHashMap;
import java.util.UUID;

public class SchemeOutsourcing implements RegistrationOutsourcing{

    protected LinkedHashMap<String, RegistrationOutsourcing> service;


    public SchemeOutsourcing() {
    }

    public Shoe SchemeOutsourcing(Shoe shoe){
        return null;
    }

    @Override
    public Object getContent(String contentId) {
        String content="";
        if(contentId.equals("0")) {
            for(String key: service.keySet()) {
                content+= service.get(key);
            }
            return content;
        }
        else {
            return service.get(contentId);
        }
    }

    @Override
    public String setContent(String content) {
        String id= UUID.randomUUID().toString();
        final RegistrationOutsourcing put = service.put(id, (RegistrationOutsourcing) service);

        return id;
    }

    @Override
    public void put(String toString, RegistrationOutsourcing service) {

    }
}

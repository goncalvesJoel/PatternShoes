package com.es2.bridge;

import java.util.LinkedHashMap;
import java.util.UUID;

public class APIRequest {
    protected LinkedHashMap<String, RegistrationOutsourcing> service;

    public APIRequest() {
        service = new LinkedHashMap<String, RegistrationOutsourcing>();
    }

    public String getContent(String serviceId, String contentId) throws ServiceNotFoundException {
        if(service.containsKey(serviceId)) {
            return (String) service.get(serviceId).getContent(contentId);
        }
        else throw new ServiceNotFoundException();
    }

    public String setContent(String serviceId, String content) throws ServiceNotFoundException{
        if(service.containsKey(serviceId)) {
            return service.get(serviceId).setContent(content);
        }
        else throw new ServiceNotFoundException();
    }

    public String addService(RegistrationOutsourcing services) {
        UUID idser= UUID.randomUUID();
        service.put(idser.toString(),services);
        return idser.toString();
    }
}

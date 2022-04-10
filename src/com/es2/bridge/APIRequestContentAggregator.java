package com.es2.bridge;

public class APIRequestContentAggregator extends APIRequest{

    public String getContent(String serviceId, String contentId) throws ServiceNotFoundException {
        if(service.containsKey(serviceId)) {

            return (String) service.get(serviceId).getContent("0");
        }
        else throw new ServiceNotFoundException();
    }
}

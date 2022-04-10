package com.es2.bridge;

public interface RegistrationOutsourcing {
    Object getContent(String contentId);
    String setContent(String content);
    void put(String toString, RegistrationOutsourcing service);
}

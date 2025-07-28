package com.github.keler147.ws_course_java.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id:" + id);
    }
}

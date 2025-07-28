package com.github.keler147.ws_course_java.resources.exceptions;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.time.Instant;


public class StandardError implements Serializable {
    //Attributes
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
        private Instant timestamp;
        private Integer status;
        private String error;
        private String message;
        private String path;

    //Constructors
        public StandardError() {
        }
        public StandardError(Instant timestamp, Integer status, String error, String message, String path) {
            this.error = error;
            this.message = message;
            this.path = path;
            this.status = status;
            this.timestamp = timestamp;
        }

    //Methods
        //Getters and Setters
        public String getError() {
            return error;
        }
        public void setError(String error) {
            this.error = error;
        }

        public String getMessage() {
            return message;
        }
        public void setMessage(String message) {
            this.message = message;
        }

        public String getPath() {
            return path;
        }
        public void setPath(String path) {
            this.path = path;
        }

        public Integer getStatus() {
            return status;
        }
        public void setStatus(Integer status) {
            this.status = status;
        }

        public Instant getTimestamp() {
            return timestamp;
        }
        public void setTimestamp(Instant timestamp) {
            this.timestamp = timestamp;
        }
}

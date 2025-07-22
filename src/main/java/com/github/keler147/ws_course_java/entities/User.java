package com.github.keler147.ws_course_java.entities;
import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    //Attributes
        private Long id;
        private String name;
        private String email;
        private String phone;
        private String password;

    //Associates

    //Constructors
        public User() {
        }
        public User(Long id, String name, String email, String phone, String password) {
            this.email = email;
            this.id = id;
            this.name = name;
            this.password = password;
            this.phone = phone;
        }

    //Methods
        //HashCod And Equals
        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;

            User user = (User) o;
            return Objects.equals(id, user.id);
        }
        @Override
        public int hashCode() {
            return Objects.hashCode(id);
        }

        //Getters and Setters
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }

        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }

        public String getPhone() {
            return phone;
        }
        public void setPhone(String phone) {
            this.phone = phone;
        }
}

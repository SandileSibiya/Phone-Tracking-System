package com.phonetracker.domain;

import jakarta.persistence.*;

@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    private String phoneNumber;

    private String role = "USER";

    // Default constructor
    protected User(){
    }

    //Constructor with parameters
    private User(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.password = builder.password;
        this.phoneNumber = builder.phoneNumber;
        this.role = builder.role;
    }

    // Getter
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getRole() {
        return role;
    }

    // ToString

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    // Builder class
    public static class Builder {
        private Long id;
        private String name;
        private String email;
        private String password;
        private String phoneNumber;
        private String role;

        // Setters
        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        //Builder copy constructor
        public Builder copy (User user){
            this.id = user.id;
            this.name = user.name;
            this.email = user.email;
            this.password = user.password;
            this.phoneNumber = user.phoneNumber;
            this.role = user.role;
            return this;
        }

        public User build () {
            return new User(this);
        }
    }
}

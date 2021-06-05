package com.gordonmzizi.webapi.student;

public class Student {

    private Long Id;
    private String firstName;
    private String secondName;
    private String email;
    private Integer Age;

    public Student(Long id, String firstName, String secondName, String email, Integer age) {
        Id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        Age = age;
    }

    public Long getId() {
        return Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return Age;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", email='" + email + '\'' +
                ", Age=" + Age +
                '}';
    }
}

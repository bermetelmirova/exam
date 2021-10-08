package com.company.taskA;

public class Student {
    private Long id;
    private String name;
    private Double gpa;
    private Integer age;
    private Boolean gender;

    public Student(Long id, String name, Double gpa, Integer age, Boolean gender) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.age = age;
        this.gender = gender;
    }

    public Student() {
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

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        String genderType = (gender==true) ? "female":"male";
        return "Student:\n" + "id:" + id + "\nname:" + name  + "\ngpa:" + gpa + "\nage:" + age + "\ngender:" + genderType;
    }
}

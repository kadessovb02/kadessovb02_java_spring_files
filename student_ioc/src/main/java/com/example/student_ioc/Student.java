package com.example.student_ioc;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public
@Data
@AllArgsConstructor
@NoArgsConstructor
class Student implements displayInfo {
    String name;
    int id;
    int age;
    String address;
    double gpa;
    @Override
    public String toString() {
        return "name: " + name + "; id: " + id;
    }
    void init(){
        System.out.println("init...");
    }
    void destroy(){
        System.out.println("destroy...");
    }

}

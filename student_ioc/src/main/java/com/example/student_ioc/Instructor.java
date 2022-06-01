package com.example.student_ioc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public
@Data
@AllArgsConstructor
@NoArgsConstructor
class Instructor implements displayInfo {
    String name;
    int id;
    int age;
    String address;

    @Override
    public String toString() {
        return "name: " + name + "; id: " + id;
    }
}

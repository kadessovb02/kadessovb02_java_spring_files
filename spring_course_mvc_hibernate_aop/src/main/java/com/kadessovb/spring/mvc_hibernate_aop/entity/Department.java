//package com.kadessovb.spring.mvc_hibernate_aop.entity;
//
//
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "departments")
//@Data
//@NoArgsConstructor
//public class Department {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private int id;
//
//    @Column(name = "name")
//    private String departmentName;
//
//    @Column(name = "max_salary")
//    int maxSalary;
//
//    @Column(name = "min_salary")
//    int minSalary;
//
//    @OneToMany(cascade = CascadeType.ALL
//            , mappedBy = "department"
//            , fetch = FetchType.LAZY)
//    private List<Employee> employeeList;
//
//
//    public void addEmployee(Employee employee){
//        if (employeeList==null) employeeList = new ArrayList<>();
//        employeeList.add(employee);
//        employee.setDepartment(this);
//    }
//
//
//    @Override
//    public String toString() {
//        return "Department{" +
//                "id=" + id +
//                ", departmentName='" + departmentName + '\'' +
//                ", maxSalary=" + maxSalary +
//                ", minSalary=" + minSalary +
//                '}';
//    }
//}

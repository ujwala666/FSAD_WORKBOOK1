package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int studentId;
    private String studentName;

    @Autowired
    private Certification certification;

    @Autowired
    public Student() {
        this.studentId = 172;
        this.studentName = "JANGA UJWALA";
    }

    public void display() {

        System.out.println("The following are the student details");
        System.out.println("StudentId: " + studentId);
        System.out.println("StudentName: " + studentName);

        System.out.println("CertificationId: " + certification.getCertId());
        System.out.println("CertificationName: " + certification.getCertName());
        System.out.println("DateOfCompletion: " + certification.getDateOfCompletion());
    }
}

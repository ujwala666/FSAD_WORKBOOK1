package com.klu.model;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int certId;
    private String certName;
    private String dateOfCompletion;

    public Certification() {
        this.certId = 801;
        this.certName = "Spring Framework Certification";
        this.dateOfCompletion = "16-03-2026";
    }

    public int getCertId() {
        return certId;
    }

    public String getCertName() {
        return certName;
    }

    public String getDateOfCompletion() {
        return dateOfCompletion;
    }
}

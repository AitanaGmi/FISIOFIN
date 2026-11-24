package com.fisiofino.model;

public class MalaltiaPacient {

    String treatment;
    String code;
    String dni;
    String name;
    String status;
    
    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment){
        this.treatment = treatment;
    }
    public String getDniPacient() {
        return dni;
    }
    public void setDniPacient(String dni){
        this.dni=dni;
    }

    public String getStatus() {
        return status;
    }

     public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.usindh.usindh.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int facId;
    private String facName;
    private String remarks;

    @OneToMany(mappedBy = "faculty",cascade = CascadeType.ALL)
    private List<Department> department;

    public Faculty() {
    }

    
    public Faculty(int facId, String facName, String remarks, List<Department> department) {
        this.facId = facId;
        this.facName = facName;
        this.remarks = remarks;
        this.department = department;
    }


    public int getFacId() {
        return facId;
    }

    public void setFacId(int facId) {
        this.facId = facId;
    }
    public String getFacName() {
        return facName;
    }
    public void setFacName(String facName) {
        this.facName = facName;
    }
    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public List<Department> getDepartment() {
        return department;
    }
    public void setDepartment(List<Department> department) {
        this.department = department;
    }
  
}

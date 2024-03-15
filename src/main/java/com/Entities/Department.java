package com.usindh.usindh.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int depId;
    private String deptName;
    private String remarks;

    @ManyToOne
    @JoinColumn(name = "fac_id")
    private Faculty faculty;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Program> program;

    public Department() {
    }

    public Department(int depId, String deptName, String remarks, Faculty faculty, List<Program> program) {
        this.depId = depId;
        this.deptName = deptName;
        this.remarks = remarks;
        this.faculty = faculty;
        this.program = program;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public List<Program> getProgram() {
        return program;
    }

    public void setProgram(List<Program> program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Department [depId=" + depId + ", deptName=" + deptName + ", remarks=" + remarks + ", faculty=" + faculty
                + "]";
    }
}

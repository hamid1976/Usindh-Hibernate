package com.usindh.usindh.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Batch {
    @Id
    private int id;
    private String batchYear;
    private String Session;

    @ManyToOne
     @JoinColumn(name = "prog_id")
    private Program program;

    @OneToMany(mappedBy = "batch",cascade = CascadeType.ALL)
    private List<Student> student;

    public Batch() {
    }

   

    public Batch(int id, String batchYear, String session, Program program, List<Student> student) {
        this.id = id;
        this.batchYear = batchYear;
        Session = session;
        this.program = program;
        this.student = student;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getBatchYear() {
        return batchYear;
    }



    public void setBatchYear(String batchYear) {
        this.batchYear = batchYear;
    }



    public String getSession() {
        return Session;
    }



    public void setSession(String session) {
        Session = session;
    }



    public Program getProgram() {
        return program;
    }



    public void setProgram(Program program) {
        this.program = program;
    }



    public List<Student> getStudent() {
        return student;
    }



    public void setStudent(List<Student> student) {
        this.student = student;
    }



    @Override
    public String toString() {
        return "Batch [id=" + id + ", batchYear=" + batchYear + ", Session=" + Session + ", program=" + program
                + ", student=" + student + "]";
    }



}

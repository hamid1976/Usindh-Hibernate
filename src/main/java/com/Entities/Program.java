package com.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Program{
    @Id
    @Column(name="prog_id")
    private int progId;
    private String progName;

    @ManyToOne(cascade = CascadeType.ALL)
    private Department department;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "progName")
    private List<Batch> batch;

    public int getProgId() {
        return progId;
    }

    public void setProgId(int progId) {
        this.progId = progId;
    }

    public String getProgName() {
        return progName;
    }

    public void setProgName(String progName) {
        this.progName = progName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Batch> getBatch() {
        return batch;
    }

    public void setBatch(List<Batch> batch) {
        this.batch = batch;
    }

    public Program(){
        super();
    }

    public Program(int progId, String progName, Department department, List<Batch> batch) {
        super();
        this.progId = progId;
        this.progName = progName;
        this.department = department;
        this.batch = batch;
    }
}
//package com.Entities;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//public class Program {
//    @Id
//    @Column(name="prog_id")
//    private int progId;
//    private String progName;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    private Department department;
//
//    @OneToMany(mappedBy = "program", cascade = CascadeType.ALL)
//    private List<Batch> batch;
//
//    public int getProgId() {
//        return progId;
//    }
//
//    public void setProgId(int progId) {
//        this.progId = progId;
//    }
//
//    public String getProgName() {
//        return progName;
//    }
//
//    public void setProgName(String progName) {
//        this.progName = progName;
//    }
//
//    public Department getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }
//
//    public List<Batch> getBatch() {
//        return batch;
//    }
//
//    public void setBatch(List<Batch> batch) {
//        this.batch = batch;
//    }
//
//    public Program() {
//        super();
//    }
//
//    public Program(int progId, String progName, Department department, List<Batch> batch) {
//        super();
//        this.progId = progId;
//        this.progName = progName;
//        this.department = department;
//        this.batch = batch;
//    }
//}

package com.usindh.usindh.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private String address;

    @ManyToOne
     @JoinColumn(name = "batch_id")
    private Batch batch;

    public Student() {
    }

    public Student(int id, String name, String address, Batch batch) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.batch = batch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", address=" + address + ", batch=" + batch + "]";
    }
}

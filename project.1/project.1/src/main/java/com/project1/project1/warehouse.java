package com.project1.project1;


import jakarta.persistence.*;

@Entity
@Table(name = "warehouse")
public class warehouse {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String wname;

    public warehouse() {
        // Default constructor
    }

    public warehouse(Long id, String wname) {
        this.id = id;
        this.wname = wname;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSname() {
        return wname;
    }

    public void setSname(String wname) {
        this.wname = wname;
    }

}

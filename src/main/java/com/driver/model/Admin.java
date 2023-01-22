package com.driver.model;

import javax.persistence.*;

@Entity
@Table
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int adminId;
    @Column(nullable = false,unique = true)
    private String name;

    private String password;

    public int getAdminId() {
        return adminId;
    }

    public Admin(int adminId, String name, String password) {
        this.adminId = adminId;
        this.name = name;
        this.password = password;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin() {
    }

    public Admin(int adminId) {
        this.adminId = adminId;
    }
}
package com.projeto.proj1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;
    private String name;
    private String email;
    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;
    public User(){
    }
    public Long getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public String getemail(){
        return email;
    }
    public void setEmail(){
        this.email=email;
    }
    public Department gDepartment(){
        return department;
    }
    public void Department(Department department){
        this.department=department;
    }
}

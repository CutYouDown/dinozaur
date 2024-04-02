package com.projects.dinozaur;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {
    @Id
    int id;
    @Column
    String name;
    @Column
    String surname;
    @Column
    int sex;
    @Column
    boolean active;
    @ManyToOne
    @JoinColumn
    Group group;


}

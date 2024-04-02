package com.projects.dinozaur;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="groups")
public class Group {
    @Id
    @GeneratedValue
    Integer id;
    @Column(name = "student-id")
    int studentId;
    @Column(name = "group-name")
    String groupName;
    @OneToMany(mappedBy = "student-id")
    List<Student> students;
}
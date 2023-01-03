package com.fjmgservices.proyect.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "project")
public class Project
{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private  int id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "url_port")
    private String url_port;
    @Column(name = "progress")
    private int progress;

}

package com.dev.vue.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table
@Data
public class User {

    @Id
    private String id;

    private String name;
    private String userPic;
    private String email;
    private String gender;
    private String locale;
    private LocalDateTime lastVisit;

}

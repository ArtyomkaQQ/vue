package com.dev.vue.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
public class User implements Serializable {

    @Id
    private String id;

    private String name;
    private String userPic;
    private String email;
    private String gender;
    private String locale;
    private LocalDateTime lastVisit;

}

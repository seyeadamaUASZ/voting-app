package com.sid.gl.models;

import com.sid.gl.enums.UserType;
import com.sid.gl.models.common.Auditable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "td_user")
@Getter
@EqualsAndHashCode(callSuper = true)
@Setter
public class User extends Auditable<String> {
    private String firstName;
    private String lastName;
    @Email
    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    //dans le cas d'un candidat s'inscrit dans une election
    @OneToOne
    private Election election;
}

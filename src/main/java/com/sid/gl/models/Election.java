package com.sid.gl.models;

import com.sid.gl.models.common.Auditable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "td_election")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Election extends Auditable<String> {
    private String title_election;
    private Date dateStartElection = new Date();
    private Date dateEndElection;
}

package com.sid.gl.models;

import com.sid.gl.models.common.Auditable;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "td_election")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Election extends Auditable<String> {
    private String title_election;
    private Date dateStartElection = new Date();
    private Date dateEndElection;
}

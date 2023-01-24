package com.sid.gl.models;

import com.sid.gl.models.common.Auditable;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tr_bulletin_vote_elector")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BulletinElectorVote extends Auditable<String> {
    @ManyToOne
    private Bulletin bulletin;
    @ManyToOne
    private User elector;
}

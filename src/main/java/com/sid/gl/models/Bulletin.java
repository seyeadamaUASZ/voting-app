package com.sid.gl.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tr_bulletin")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Bulletin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private User candidate;
    private String photoUrl;
}

package com.sid.gl.models.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable<T> {

    @CreatedBy
    @Column(name = "created_by", updatable = false)
    @JsonIgnore
    protected T createdBy;
    @CreationTimestamp
    @Column(name = "created_date", updatable = false)
    @JsonIgnore
    protected LocalDateTime createdDate;
    @LastModifiedBy
    @Column(name = "modified_by")
    @JsonIgnore
    protected T lastModifiedBy;
    @UpdateTimestamp
    @Column(name = "modified_date")
    @JsonIgnore
    protected LocalDateTime lastModifiedDate;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_gen")
    @Column(nullable = false, updatable = false, unique = true)
    protected Long id;
}

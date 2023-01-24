package com.sid.gl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository<T,K> extends JpaRepository<T,K> {
}

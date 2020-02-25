package com.bavulapati.conferencedemo.repositories;

import com.bavulapati.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}

package com.bavulapati.conferencedemo.repositories;

import com.bavulapati.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}

package com.sekureme.legal.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sekureme.legal.model.ConsentLog;

public interface ConsentLogRepository extends JpaRepository<ConsentLog, UUID> {
}

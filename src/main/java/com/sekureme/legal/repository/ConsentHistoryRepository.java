package com.sekureme.legal.repository;


import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sekureme.legal.model.ConsentHistory;

public interface ConsentHistoryRepository extends JpaRepository<ConsentHistory, UUID> {
}
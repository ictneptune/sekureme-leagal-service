package com.sekureme.legal.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sekureme.legal.model.Consent;

public interface ConsentRepository extends JpaRepository<Consent, UUID> {
}
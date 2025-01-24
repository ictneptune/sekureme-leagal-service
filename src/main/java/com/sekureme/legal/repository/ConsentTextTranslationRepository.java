package com.sekureme.legal.repository;


import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sekureme.legal.model.ConsentTextTranslation;

public interface ConsentTextTranslationRepository extends JpaRepository<ConsentTextTranslation, UUID> {
}
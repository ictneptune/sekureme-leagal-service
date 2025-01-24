package com.sekureme.legal.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sekureme.legal.model.ConsentPolicy;

public interface ConsentPolicyRepository extends JpaRepository<ConsentPolicy, UUID> {
    ConsentPolicy findByPolicy_PolicyURL(String policyURL);
}
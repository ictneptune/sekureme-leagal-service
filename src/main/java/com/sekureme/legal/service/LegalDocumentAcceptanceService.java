package com.sekureme.legal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sekureme.legal.model.LegalDocumentAcceptance;
import com.sekureme.legal.repository.LegalDocumentAcceptanceRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class LegalDocumentAcceptanceService {

    @Autowired
    private LegalDocumentAcceptanceRepository acceptanceRepository;

    // Find all acceptance records for a specific legal document
    public List<LegalDocumentAcceptance> getAcceptancesByDocumentId(Long documentId) {
        return acceptanceRepository.findByLegalDocumentId(documentId);
    }

    // Find all acceptance records by a specific user
    public List<LegalDocumentAcceptance> getAcceptancesByUser(String username) {
        return acceptanceRepository.findByAcceptedBy(username);
    }

    // Find acceptance records within a date range
    public List<LegalDocumentAcceptance> getAcceptancesWithinDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return acceptanceRepository.findByAcceptedAtBetween(startDate, endDate);
    }

    // Find a specific acceptance record for a user and a document
    public Optional<LegalDocumentAcceptance> getAcceptanceByDocumentIdAndUser(Long documentId, String username) {
        return Optional.ofNullable(acceptanceRepository.findByLegalDocumentIdAndAcceptedBy(documentId, username));
    }

    // Save an acceptance record
    public LegalDocumentAcceptance saveAcceptance(LegalDocumentAcceptance acceptance) {
        return acceptanceRepository.save(acceptance);
    }

    // Delete an acceptance record by ID
    public void deleteAcceptance(Long id) {
        acceptanceRepository.deleteById(id);
    }
}


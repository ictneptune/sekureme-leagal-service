package com.sekureme.legal.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sekureme.legal.model.LegalDocumentAcceptance;

@Repository
public interface LegalDocumentAcceptanceRepository extends JpaRepository<LegalDocumentAcceptance, Long> {

    // Find all acceptances for a specific legal document
    List<LegalDocumentAcceptance> findByLegalDocumentId(Long legalDocumentId);

    // Find all acceptances by a specific user (acceptedBy)
    List<LegalDocumentAcceptance> findByAcceptedBy(String acceptedBy);

    // Find acceptances within a date range
    List<LegalDocumentAcceptance> findByAcceptedAtBetween(LocalDateTime startDate, LocalDateTime endDate);

    // Find the acceptance record for a specific legal document and user
    LegalDocumentAcceptance findByLegalDocumentIdAndAcceptedBy(Long legalDocumentId, String acceptedBy);
    
    // You can add more queries if needed, for example:
    // List<LegalDocumentAcceptance> findByLegalDocumentIdAndIp(Long legalDocumentId, String ip);

    //  List<LegalDocument> findByCreatedAtAfter(LocalDateTime dateTime);
    
}

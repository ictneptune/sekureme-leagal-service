package com.sekureme.legal.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sekureme.legal.model.LegalDocument;

@Repository
public interface LegalDocumentRepository extends JpaRepository<LegalDocument, Long> {

    // Find legal documents by language
    List<LegalDocument> findByLanguage(String language);

    // Find a legal document by name
    Optional<LegalDocument> findByName(String name);

    // Find legal documents created after a specific date
    List<LegalDocument> findByCreatedAtAfter(LocalDateTime createdAt);

    // You can add more queries if needed, for example:
    // List<LegalDocument> findByLanguageAndCreatedAtAfter(String language, LocalDateTime createdAt);
 // Find all documents with a specific language
 List<LegalDocument> findByTranslationsLanguage(String language);

 
}
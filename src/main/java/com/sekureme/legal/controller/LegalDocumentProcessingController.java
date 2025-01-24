package com.sekureme.legal.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sekureme.legal.model.LegalDocument;
import com.sekureme.legal.model.LegalDocumentAcceptance;
import com.sekureme.legal.model.LegalDocumentAcceptanceRequest;
import com.sekureme.legal.repository.LegalDocumentAcceptanceRepository;
import com.sekureme.legal.repository.LegalDocumentRepository;

@RestController
@RequestMapping("/api/legal-documents")
public class LegalDocumentProcessingController {

    @Autowired
    private LegalDocumentRepository legalDocumentRepository;

    @Autowired
    private LegalDocumentAcceptanceRepository acceptanceRepository;

    @PostMapping("/accept")
    public ResponseEntity<Void> acceptLegalDocument(
        @RequestBody LegalDocumentAcceptanceRequest acceptanceRequest
        // @RequestHeader("Authorization") String token
    ) {
        // Extract user and other details from the token and the request

        LegalDocument doc = legalDocumentRepository.findById(acceptanceRequest.getLegalDocId()).orElseThrow(() -> new RuntimeException("Document not found"));

        LegalDocumentAcceptance acceptance = new LegalDocumentAcceptance();
        acceptance.setLegalDocument(doc);
        acceptance.setAcceptedBy(acceptanceRequest.getAcceptedBy());
        acceptance.setAcceptedAt(LocalDateTime.now());
        acceptance.setDeviceInformation(acceptanceRequest.getDeviceInformation());
        acceptance.setIp(acceptanceRequest.getIp());
        acceptance.setBrowserName(acceptanceRequest.getBrowserName());
        acceptance.setTimeToAccept(acceptanceRequest.getTimeToAccept());

        acceptanceRepository.save(acceptance);

        return ResponseEntity.ok().build();
    }
}

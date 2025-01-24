package com.sekureme.legal.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sekureme.legal.model.ConsentDTO;
import com.sekureme.legal.service.ConsentService;

@RestController
@RequestMapping("/api/consents")
public class ConsentController {

    @Autowired
    private ConsentService consentService;

    @PostMapping
    public ConsentDTO createConsent(@RequestBody ConsentDTO consentDTO) {
        return consentService.createConsent(consentDTO);
    }

    @GetMapping("/{consentId}")
    public ConsentDTO getConsentById(@PathVariable UUID consentId) {
        return consentService.getConsentById(consentId);
    }

    @GetMapping
    public List<ConsentDTO> getAllConsents() {
        return consentService.getAllConsents();
    }

    @PutMapping("/{consentId}")
    public ConsentDTO updateConsent(@PathVariable UUID consentId, @RequestBody ConsentDTO consentDTO) {
        return consentService.updateConsent(consentId, consentDTO);
    }

    @DeleteMapping("/{consentId}")
    public void deleteConsent(@PathVariable UUID consentId) {
        consentService.deleteConsent(consentId);
    }

    
    @PostMapping("/archive/{consentId}")
    public void archiveConsent(@PathVariable UUID consentId) {
        consentService.archiveConsent(consentId);
    }

    //  @PostMapping("/policy")
    // public ConsentPolicy createConsentPolicy(@RequestBody ConsentPolicy consentPolicy) {
    //     return consentService.createConsentPolicy(consentPolicy);
    // }
}
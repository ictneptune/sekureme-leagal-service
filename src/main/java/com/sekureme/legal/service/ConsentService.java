package com.sekureme.legal.service;


import java.util.List;
import java.util.UUID;

import com.sekureme.legal.model.ConsentDTO;

public interface ConsentService {
    ConsentDTO createConsent(ConsentDTO consentDTO);
    ConsentDTO getConsentById(UUID consentId);
    List<ConsentDTO> getAllConsents();
    ConsentDTO updateConsent(UUID consentId, ConsentDTO consentDTO);
    void deleteConsent(UUID consentId);
    void archiveConsent(UUID consentId);
    
}

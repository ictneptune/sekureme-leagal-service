package com.sekureme.legal.service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sekureme.legal.model.Consent;
import com.sekureme.legal.model.ConsentDTO;
import com.sekureme.legal.model.ConsentHistory;
import com.sekureme.legal.repository.ConsentHistoryRepository;
import com.sekureme.legal.repository.ConsentRepository;
import com.sekureme.legal.repository.ConsentTextTranslationRepository;

@Service
public class ConsentServiceImpl implements ConsentService {

    @Autowired
    private ConsentRepository consentRepository;

     @Autowired
    private ConsentHistoryRepository consentHistoryRepository;

      @Autowired
    private ConsentTextTranslationRepository consentTextTranslationRepository;


    @Override
    public ConsentDTO createConsent(ConsentDTO consentDTO) {
        Consent consent = new Consent();
        // Set consent properties from consentDTO
        consent = consentRepository.save(consent);
        return convertToDTO(consent);
    }

    @Override
    public ConsentDTO getConsentById(UUID consentId) {
        Consent consent = consentRepository.findById(consentId).orElse(null);
        return convertToDTO(consent);
    }

    @Override
    public List<ConsentDTO> getAllConsents() {
        return consentRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public ConsentDTO updateConsent(UUID consentId, ConsentDTO consentDTO) {
        Consent consent = consentRepository.findById(consentId).orElse(null);
        // Update consent properties from consentDTO
        consent = consentRepository.save(consent);
        return convertToDTO(consent);
    }

    @Override
    public void deleteConsent(UUID consentId) {
        consentRepository.deleteById(consentId);
    }

    
     @Override
    public void archiveConsent(UUID consentId) {
        Consent consent = consentRepository.findById(consentId).orElse(null);
        if (consent != null) {
            ConsentHistory consentHistory = new ConsentHistory();
            consentHistory.setUser(consent.getUser());
            consentHistory.setPurpose(consent.getPurpose());
            consentHistory.setConsentGiven(consent.getConsentGiven());
            consentHistory.setConsentDate(consent.getConsentDate());
            consentHistory.setRevokedDate(consent.getRevokedDate());
            consentHistory.setIpAddress(consent.getIpAddress());
            consentHistory.setUserAgent(consent.getUserAgent());
            consentHistory.setDeviceId(consent.getDeviceId());
            consentHistory.setCreatedAt(consent.getCreatedAt());
            consentHistory.setUpdatedAt(consent.getUpdatedAt());
            consentHistoryRepository.save(consentHistory);
        }
    }


    private ConsentDTO convertToDTO(Consent consent) {
        ConsentDTO consentDTO = new ConsentDTO();
        // Set consentDTO properties from consent
        return consentDTO;
    }
}

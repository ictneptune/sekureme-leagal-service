package com.sekureme.legal.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sekureme.legal.model.ConsentPolicy;
import com.sekureme.legal.repository.ConsentPolicyRepository;

@Service
public class ConsentPolicyServiceImpl implements ConsentPolicyService {
    @Autowired
    private ConsentPolicyRepository consentPolicyRepository;

    @Override
    public ConsentPolicy getConsentPolicyById(UUID policyId) {
        return consentPolicyRepository.findById(policyId).orElse(null);
    }

    @Override
    public ConsentPolicy createConsentPolicy(ConsentPolicy consentPolicy) {
        return consentPolicyRepository.save(consentPolicy);
    }

    @Override
    public ConsentPolicy updateConsentPolicy(UUID policyId, ConsentPolicy consentPolicy) {
        ConsentPolicy existingPolicy = consentPolicyRepository.findById(policyId).orElse(null);
        if (existingPolicy != null) {
            existingPolicy.setPolicy(consentPolicy.getPolicy());
            existingPolicy.setStatus(consentPolicy.getStatus());
            existingPolicy.setLocations(consentPolicy.getLocations());
            existingPolicy.setLanguages(consentPolicy.getLanguages());
            existingPolicy.setEffectiveDate(consentPolicy.getEffectiveDate());
            existingPolicy.setVersion(consentPolicy.getVersion());
            existingPolicy.setRevisionHistory(consentPolicy.getRevisionHistory());
            return consentPolicyRepository.save(existingPolicy);
        }
        return null;
    }

    @Override
    public void deleteConsentPolicy(UUID policyId) {
        consentPolicyRepository.deleteById(policyId);
    }

    @Override
    public ConsentPolicy getConsentPolicyByUrl(String policyUrl) {
        return consentPolicyRepository.findByPolicy_PolicyURL(policyUrl);
    }
}
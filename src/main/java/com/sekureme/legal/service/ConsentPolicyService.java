package com.sekureme.legal.service;


import java.util.UUID;

import com.sekureme.legal.model.ConsentPolicy;

public interface ConsentPolicyService {
    ConsentPolicy getConsentPolicyById(UUID policyId);
    ConsentPolicy createConsentPolicy(ConsentPolicy consentPolicy);
    ConsentPolicy updateConsentPolicy(UUID policyId, ConsentPolicy consentPolicy);
    void deleteConsentPolicy(UUID policyId);
    ConsentPolicy getConsentPolicyByUrl(String policyUrl);
}

package com.sekureme.legal.controller;


import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sekureme.legal.model.ConsentPolicy;
import com.sekureme.legal.service.ConsentPolicyService;

@RestController
@RequestMapping("/api/consent-policies")
public class ConsentPolicyController {

    @Autowired
    private ConsentPolicyService consentPolicyService;

    @GetMapping("/{policyId}")
    public ConsentPolicy getConsentPolicyById(@PathVariable UUID policyId) {
        return consentPolicyService.getConsentPolicyById(policyId);
    }

    @GetMapping("/by-url")
    public ConsentPolicy getConsentPolicyByUrl(@RequestParam String policyUrl) {
        return consentPolicyService.getConsentPolicyByUrl(policyUrl);
    }

    @PostMapping
    public ConsentPolicy createConsentPolicy(@RequestBody ConsentPolicy consentPolicy) {
        return consentPolicyService.createConsentPolicy(consentPolicy);
    }

    @PutMapping("/{policyId}")
    public ConsentPolicy updateConsentPolicy(@PathVariable UUID policyId, @RequestBody ConsentPolicy consentPolicy) {
        return consentPolicyService.updateConsentPolicy(policyId, consentPolicy);
    }

    @DeleteMapping("/{policyId}")
    public void deleteConsentPolicy(@PathVariable UUID policyId) {
        consentPolicyService.deleteConsentPolicy(policyId);
    }
}
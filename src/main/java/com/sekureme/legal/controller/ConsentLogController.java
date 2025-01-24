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

import com.sekureme.legal.model.ConsentLog;
import com.sekureme.legal.service.ConsentLogService;

@RestController
@RequestMapping("/api/consent-logs")
public class ConsentLogController {

    @Autowired
    private ConsentLogService consentLogService;

    @PostMapping
    public ConsentLog createConsentLog(@RequestBody ConsentLog consentLog) {
        return consentLogService.createConsentLog(consentLog);
    }

    @GetMapping("/{logId}")
    public ConsentLog getConsentLogById(@PathVariable UUID logId) {
        return consentLogService.getConsentLogById(logId);
    }

    @GetMapping
    public List<ConsentLog> getAllConsentLogs() {
        return consentLogService.getAllConsentLogs();
    }

    @PutMapping("/{logId}")
    public ConsentLog updateConsentLog(@PathVariable UUID logId, @RequestBody ConsentLog consentLog) {
        return consentLogService.updateConsentLog(logId, consentLog);
    }

    @DeleteMapping("/{logId}")
    public void deleteConsentLog(@PathVariable UUID logId) {
        consentLogService.deleteConsentLog(logId);
    }
}
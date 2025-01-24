package com.sekureme.legal.service;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sekureme.legal.model.ConsentLog;
import com.sekureme.legal.repository.ConsentLogRepository;

@Service
public class ConsentLogServiceImpl implements ConsentLogService {

    @Autowired
    private ConsentLogRepository consentLogRepository;

    @Override
    public ConsentLog createConsentLog(ConsentLog consentLog) {
        return consentLogRepository.save(consentLog);
    }

    @Override
    public ConsentLog getConsentLogById(UUID logId) {
        return consentLogRepository.findById(logId).orElse(null);
    }

    @Override
    public List<ConsentLog> getAllConsentLogs() {
        return consentLogRepository.findAll();
    }

    @Override
    public ConsentLog updateConsentLog(UUID logId, ConsentLog consentLog) {
        ConsentLog existingLog = consentLogRepository.findById(logId).orElse(null);
        if (existingLog != null) {
            // Update properties
            existingLog.setUser(consentLog.getUser());
            existingLog.setPurpose(consentLog.getPurpose());
            existingLog.setDevice(consentLog.getDevice());
            existingLog.setConsentGiven(consentLog.getConsentGiven());
            existingLog.setConsentDate(consentLog.getConsentDate());
            existingLog.setIpAddress(consentLog.getIpAddress());
            existingLog.setUserAgent(consentLog.getUserAgent());
            existingLog.setAction(consentLog.getAction());
            existingLog.setCreatedAt(consentLog.getCreatedAt());
            existingLog.setUpdatedAt(consentLog.getUpdatedAt());
            return consentLogRepository.save(existingLog);
        }
        return null;
    }

    @Override
    public void deleteConsentLog(UUID logId) {
        consentLogRepository.deleteById(logId);
    }
}

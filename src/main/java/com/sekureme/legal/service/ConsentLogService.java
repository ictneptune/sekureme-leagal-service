package com.sekureme.legal.service;


import java.util.List;
import java.util.UUID;

import com.sekureme.legal.model.ConsentLog;

public interface ConsentLogService {
    ConsentLog createConsentLog(ConsentLog consentLog);
    ConsentLog getConsentLogById(UUID logId);
    List<ConsentLog> getAllConsentLogs();
    ConsentLog updateConsentLog(UUID logId, ConsentLog consentLog);
    void deleteConsentLog(UUID logId);
}
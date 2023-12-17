package com.example.service;

import com.example.model.IPRecord;
import com.example.repository.IPRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IPLoggerService {

    private final IPRecordRepository ipRecordRepository;

    @Autowired
    public IPLoggerService(IPRecordRepository ipRecordRepository) {
        this.ipRecordRepository = ipRecordRepository;
    }

    public void logIP(IPRecord ipRecord) {
        ipRecordRepository.save(ipRecord);
    }
}
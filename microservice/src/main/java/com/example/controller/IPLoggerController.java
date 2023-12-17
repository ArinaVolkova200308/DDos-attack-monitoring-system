package com.example.controller;

import com.example.model.IPRecord;
import com.example.service.IPLoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class IPLoggerController {

    private final IPLoggerService ipLoggerService;

    @Autowired
    public IPLoggerController(IPLoggerService ipLoggerService) {
        this.ipLoggerService = ipLoggerService;
    }

    @PostMapping("/log")
    public void logIP(@RequestBody IPRecord ipRecord) {
        ipRecord.setRequestDate(LocalDateTime.now());
        ipLoggerService.logIP(ipRecord);
    }
}
package com.linkloom.core.service.api.core;

import com.linkloom.core.service.api.web.output.HealthOutputService;
import com.linkloom.core.service.api.web.output.HealthResult;
import org.springframework.stereotype.Service;

@Service
public class HealthCoreService {

    private final HealthOutputService outputService;

    public HealthCoreService(HealthOutputService outputService) {
        this.outputService = outputService;
    }

    public void checkHealth() {
        String status = "OK";
        String message = "All systems operational";

        outputService.setResult(new HealthResult(status, message));
    }
}

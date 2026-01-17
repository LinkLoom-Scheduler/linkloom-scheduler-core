package com.linkloom.core.service.api.web.input;

import com.linkloom.core.service.api.core.HealthCoreService;
import com.linkloom.core.service.api.web.interfaces.InputWebInterface;
import com.linkloom.core.service.api.web.output.HealthOutputService;
import lombok.Getter;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.RequestContext;

@Service
public class HealthInputService implements InputWebInterface {

    @Getter
    private final HealthOutputService outputService;
    private final HealthCoreService coreService;

    public HealthInputService(HealthOutputService outputService, HealthCoreService coreService) {
        this.outputService = outputService;
        this.coreService = coreService;
    }

    @Override
    public void execute(RequestContext context) {
        coreService.checkHealth();
    }

}

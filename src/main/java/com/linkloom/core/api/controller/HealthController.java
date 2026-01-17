package com.linkloom.core.api.controller;

import com.linkloom.core.api.response.CoreResponse;
import com.linkloom.core.api.routes.ApiRoutes;
import com.linkloom.core.service.api.web.input.HealthInputService;
import com.linkloom.core.service.api.web.output.HealthResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiRoutes.HEALTH)
public class HealthController {

    private final HealthInputService inputService;

    public HealthController(HealthInputService inputService) {
        this.inputService = inputService;
    }

    @GetMapping
    public CoreResponse health() {
        inputService.execute(null);

        HealthResult result = inputService.getOutputService().getResult();

        return new CoreResponse(result.getStatus(), result.getMessage());
    }
}
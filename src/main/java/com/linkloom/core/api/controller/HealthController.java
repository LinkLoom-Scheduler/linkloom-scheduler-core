package com.linkloom.core.api.controller;

import com.linkloom.core.api.routes.ApiRoutes;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiRoutes.HEALTH)
public class HealthController {

    @GetMapping
    public HealthResponse health() {
        return new HealthResponse("UP");
    }

    @Getter
    public static class HealthResponse {
        public String status;

        public HealthResponse(String status) {
            this.status = status;
        }
    }
}
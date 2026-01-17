package com.linkloom.core.api.controller;

import com.linkloom.core.api.response.CoreResponse;
import com.linkloom.core.api.routes.ApiRoutes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiRoutes.SCHEDULER)
public class SchedulerController {

    @GetMapping
    public CoreResponse getSchedulerStatus() {
        return new CoreResponse(
                "SUCCESS",
                "Scheduler is running"
        );
    }
}
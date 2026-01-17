package com.linkloom.core.service.api.web.output;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class HealthResult {
    private String status;
    private String message;
}

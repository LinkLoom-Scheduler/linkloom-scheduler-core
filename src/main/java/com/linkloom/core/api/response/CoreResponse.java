package com.linkloom.core.api.response;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public class CoreResponse {
    private String status;
    private String message;
}
package com.linkloom.core.service.api.web.output;

import com.linkloom.core.service.api.web.interfaces.OutputWebInterface;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Setter
@Service
public class HealthOutputService implements OutputWebInterface<HealthResult> {

    private HealthResult result;

    @Override
    public HealthResult getResult() {
        return result;
    }
}


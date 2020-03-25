package com.ambrin.underwater.service;

import com.ambrin.underwater.model.UnderwaterRequest;
import com.ambrin.underwater.model.UnderwaterResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService {
    private static final Logger log = LoggerFactory.getLogger(SecurityServiceImpl.class);

    @Value("${app.underwater.salinity}")
    private float sal;

    @Override
    public UnderwaterResponse findSalinity(UnderwaterRequest request) {
        log.info("Depth: {}", request.getDepth());
        log.info("Temperature: {}", request.getTemperature());

        UnderwaterResponse response = new UnderwaterResponse();
        response.setSalinity(sal);
        return response;

    }
}

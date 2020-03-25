package com.ambrin.underwater.service;

import com.ambrin.underwater.model.UnderwaterRequest;
import com.ambrin.underwater.model.UnderwaterResponse;

public interface SecurityService {

    UnderwaterResponse findSalinity(UnderwaterRequest request);
}

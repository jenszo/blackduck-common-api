/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.enumeration;

import com.synopsys.integration.util.EnumUtils;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public enum CryptoAlgorithmKeyLengthsType {
    CLOSED_RANGE,
    FIXED,
    MULTI,
    NONE,
    OPEN_RANGE;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}

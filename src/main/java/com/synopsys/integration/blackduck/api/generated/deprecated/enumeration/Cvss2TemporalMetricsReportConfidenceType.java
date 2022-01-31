/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

// Cvss2TemporalMetricsReportConfidenceType is now called VulnerabilityCvss2TemporalMetricsReportConfidenceType
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public enum Cvss2TemporalMetricsReportConfidenceType {
    CONFIRMED,
	NOT_DEFINED,
	UNCONFIRMED,
	UNCORROBORATED;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}

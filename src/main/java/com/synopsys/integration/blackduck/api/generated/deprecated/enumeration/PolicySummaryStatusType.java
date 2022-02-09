package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

// PolicySummaryStatusType is now called ProjectVersionComponentPolicyStatusType
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public enum PolicySummaryStatusType {
    IN_VIOLATION,
	IN_VIOLATION_OVERRIDDEN,
	NOT_IN_VIOLATION;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}

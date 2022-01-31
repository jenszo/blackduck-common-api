/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionBomStatusType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionBomStatusView extends BlackDuckComponent {
    private ProjectVersionBomStatusType status;

    public ProjectVersionBomStatusType getStatus() {
        return status;
    }

    public void setStatus(ProjectVersionBomStatusType status) {
        this.status = status;
    }

}

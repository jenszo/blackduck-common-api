/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.DeveloperScansScanItemsShortTermUpgradeGuidanceVulnerabilityRiskView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class DeveloperScansScanItemsShortTermUpgradeGuidanceView extends BlackDuckComponent {
    private String externalId;
    private String origin;
    private String version;
    private String versionName;
    private DeveloperScansScanItemsShortTermUpgradeGuidanceVulnerabilityRiskView vulnerabilityRisk;

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public DeveloperScansScanItemsShortTermUpgradeGuidanceVulnerabilityRiskView getVulnerabilityRisk() {
        return vulnerabilityRisk;
    }

    public void setVulnerabilityRisk(DeveloperScansScanItemsShortTermUpgradeGuidanceVulnerabilityRiskView vulnerabilityRisk) {
        this.vulnerabilityRisk = vulnerabilityRisk;
    }

}

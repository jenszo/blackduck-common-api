/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.DeveloperScansScanItemsPolicyViolationVulnerabilitiesViolatingPoliciesView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class DeveloperScansScanItemsPolicyViolationVulnerabilitiesView extends BlackDuckComponent {
    private java.util.List<String> cweIds;
    private String description;
    private String name;
    private BigDecimal overallScore;
    private java.util.Date publishedDate;
    private String solution;
    private java.util.Date vendorFixDate;
    private java.util.List<DeveloperScansScanItemsPolicyViolationVulnerabilitiesViolatingPoliciesView> violatingPolicies;
    private String vulnSeverity;
    private String workaround;

    public java.util.List<String> getCweIds() {
        return cweIds;
    }

    public void setCweIds(java.util.List<String> cweIds) {
        this.cweIds = cweIds;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getOverallScore() {
        return overallScore;
    }

    public void setOverallScore(BigDecimal overallScore) {
        this.overallScore = overallScore;
    }

    public java.util.Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(java.util.Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public java.util.Date getVendorFixDate() {
        return vendorFixDate;
    }

    public void setVendorFixDate(java.util.Date vendorFixDate) {
        this.vendorFixDate = vendorFixDate;
    }

    public java.util.List<DeveloperScansScanItemsPolicyViolationVulnerabilitiesViolatingPoliciesView> getViolatingPolicies() {
        return violatingPolicies;
    }

    public void setViolatingPolicies(java.util.List<DeveloperScansScanItemsPolicyViolationVulnerabilitiesViolatingPoliciesView> violatingPolicies) {
        this.violatingPolicies = violatingPolicies;
    }

    public String getVulnSeverity() {
        return vulnSeverity;
    }

    public void setVulnSeverity(String vulnSeverity) {
        this.vulnSeverity = vulnSeverity;
    }

    public String getWorkaround() {
        return workaround;
    }

    public void setWorkaround(String workaround) {
        this.workaround = workaround;
    }

}

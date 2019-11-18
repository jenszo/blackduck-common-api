/**
 * blackduck-common-api
 *
 * Copyright (c) 2019 Synopsys, Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentActivityDataView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseFamilyLicenseFamilyRiskRulesUsageType;
import com.synopsys.integration.blackduck.api.generated.view.RiskProfileView;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.OriginView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.VersionBomComponentMatchType;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.VersionBomOriginView;
import java.math.BigDecimal;
import java.util.List;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentReviewedDetailsView;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyStatusType;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentLicensesView;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.VersionBomComponentReviewStatusType;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.MatchedFileView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionComponentViewV6 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-6+json";

	public static final Map<String, LinkResponse> links = new HashMap<>();
        public static final String POLICY_RULES_LINK = "policy-rules";
        public static final String MATCHED_FILES_LINK = "matched-files";
        public static final String ORIGINS_LINK = "origins";

	public static final LinkMultipleResponses<VersionBomPolicyRuleView> POLICY_RULES_LINK_RESPONSE = new LinkMultipleResponses<VersionBomPolicyRuleView>(POLICY_RULES_LINK, VersionBomPolicyRuleView.class);
	public static final LinkMultipleResponses<MatchedFileView> MATCHED_FILES_LINK_RESPONSE = new LinkMultipleResponses<MatchedFileView>(MATCHED_FILES_LINK, MatchedFileView.class);
	public static final LinkMultipleResponses<OriginView> ORIGINS_LINK_RESPONSE = new LinkMultipleResponses<OriginView>(ORIGINS_LINK, OriginView.class);

    static {
	links.put(POLICY_RULES_LINK, POLICY_RULES_LINK_RESPONSE);
	links.put(MATCHED_FILES_LINK, MATCHED_FILES_LINK_RESPONSE);
	links.put(ORIGINS_LINK, ORIGINS_LINK_RESPONSE);
    }

    private ProjectVersionComponentActivityDataView activityData;
    private java.util.List<VersionBomOriginView> origins;
    private String component;
    private Boolean ignored;
    private String componentVersionName;
    private RiskProfileView licenseRiskProfile;
    private Boolean manuallyAdjusted;
    private RiskProfileView activityRiskProfile;
    private Boolean componentModified;
    private java.util.List<VersionBomComponentMatchType> matchTypes;
    private String componentPurpose;
    private ProjectVersionComponentReviewedDetailsView reviewedDetails;
    private String policyStatus;
    private RiskProfileView operationalRiskProfile;
    private RiskProfileView securityRiskProfile;
    private RiskProfileView versionRiskProfile;
    private PolicyStatusType approvalStatus;
    private BigDecimal totalFileMatchCount;
    private String componentVersion;
    private String componentModification;
    private Boolean inAttributionReport;
    private String componentName;
    private VersionBomComponentReviewStatusType reviewStatus;
    private java.util.List<ProjectVersionComponentLicensesView> licenses;
    private java.util.Date releasedOn;
    private java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> usages;
    private String attributionStatement;

    public ProjectVersionComponentActivityDataView getActivityData() {
	return activityData;
    }

    public void setActivityData(ProjectVersionComponentActivityDataView activityData) {
	this.activityData = activityData;
    }

    public java.util.List<VersionBomOriginView> getOrigins() {
	return origins;
    }

    public void setOrigins(java.util.List<VersionBomOriginView> origins) {
	this.origins = origins;
    }

    public String getComponent() {
	return component;
    }

    public void setComponent(String component) {
	this.component = component;
    }

    public Boolean getIgnored() {
	return ignored;
    }

    public void setIgnored(Boolean ignored) {
	this.ignored = ignored;
    }

    public String getComponentVersionName() {
	return componentVersionName;
    }

    public void setComponentVersionName(String componentVersionName) {
	this.componentVersionName = componentVersionName;
    }

    public RiskProfileView getLicenseRiskProfile() {
	return licenseRiskProfile;
    }

    public void setLicenseRiskProfile(RiskProfileView licenseRiskProfile) {
	this.licenseRiskProfile = licenseRiskProfile;
    }

    public Boolean getManuallyAdjusted() {
	return manuallyAdjusted;
    }

    public void setManuallyAdjusted(Boolean manuallyAdjusted) {
	this.manuallyAdjusted = manuallyAdjusted;
    }

    public RiskProfileView getActivityRiskProfile() {
	return activityRiskProfile;
    }

    public void setActivityRiskProfile(RiskProfileView activityRiskProfile) {
	this.activityRiskProfile = activityRiskProfile;
    }

    public Boolean getComponentModified() {
	return componentModified;
    }

    public void setComponentModified(Boolean componentModified) {
	this.componentModified = componentModified;
    }

    public java.util.List<VersionBomComponentMatchType> getMatchTypes() {
	return matchTypes;
    }

    public void setMatchTypes(java.util.List<VersionBomComponentMatchType> matchTypes) {
	this.matchTypes = matchTypes;
    }

    public String getComponentPurpose() {
	return componentPurpose;
    }

    public void setComponentPurpose(String componentPurpose) {
	this.componentPurpose = componentPurpose;
    }

    public ProjectVersionComponentReviewedDetailsView getReviewedDetails() {
	return reviewedDetails;
    }

    public void setReviewedDetails(ProjectVersionComponentReviewedDetailsView reviewedDetails) {
	this.reviewedDetails = reviewedDetails;
    }

    public String getPolicyStatus() {
	return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
	this.policyStatus = policyStatus;
    }

    public RiskProfileView getOperationalRiskProfile() {
	return operationalRiskProfile;
    }

    public void setOperationalRiskProfile(RiskProfileView operationalRiskProfile) {
	this.operationalRiskProfile = operationalRiskProfile;
    }

    public RiskProfileView getSecurityRiskProfile() {
	return securityRiskProfile;
    }

    public void setSecurityRiskProfile(RiskProfileView securityRiskProfile) {
	this.securityRiskProfile = securityRiskProfile;
    }

    public RiskProfileView getVersionRiskProfile() {
	return versionRiskProfile;
    }

    public void setVersionRiskProfile(RiskProfileView versionRiskProfile) {
	this.versionRiskProfile = versionRiskProfile;
    }

    public PolicyStatusType getApprovalStatus() {
	return approvalStatus;
    }

    public void setApprovalStatus(PolicyStatusType approvalStatus) {
	this.approvalStatus = approvalStatus;
    }

    public BigDecimal getTotalFileMatchCount() {
	return totalFileMatchCount;
    }

    public void setTotalFileMatchCount(BigDecimal totalFileMatchCount) {
	this.totalFileMatchCount = totalFileMatchCount;
    }

    public String getComponentVersion() {
	return componentVersion;
    }

    public void setComponentVersion(String componentVersion) {
	this.componentVersion = componentVersion;
    }

    public String getComponentModification() {
	return componentModification;
    }

    public void setComponentModification(String componentModification) {
	this.componentModification = componentModification;
    }

    public Boolean getInAttributionReport() {
	return inAttributionReport;
    }

    public void setInAttributionReport(Boolean inAttributionReport) {
	this.inAttributionReport = inAttributionReport;
    }

    public String getComponentName() {
	return componentName;
    }

    public void setComponentName(String componentName) {
	this.componentName = componentName;
    }

    public VersionBomComponentReviewStatusType getReviewStatus() {
	return reviewStatus;
    }

    public void setReviewStatus(VersionBomComponentReviewStatusType reviewStatus) {
	this.reviewStatus = reviewStatus;
    }

    public java.util.List<ProjectVersionComponentLicensesView> getLicenses() {
	return licenses;
    }

    public void setLicenses(java.util.List<ProjectVersionComponentLicensesView> licenses) {
	this.licenses = licenses;
    }

    public java.util.Date getReleasedOn() {
	return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
	this.releasedOn = releasedOn;
    }

    public java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> getUsages() {
	return usages;
    }

    public void setUsages(java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> usages) {
	this.usages = usages;
    }

    public String getAttributionStatement() {
	return attributionStatement;
    }

    public void setAttributionStatement(String attributionStatement) {
	this.attributionStatement = attributionStatement;
    }


    public String getMediaType() {
	return mediaType;
    }

}

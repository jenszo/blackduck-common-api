package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.DeveloperScansScanItemsComponentViolatingPoliciesView;
import com.synopsys.integration.blackduck.api.generated.component.DeveloperScansScanItemsFailedEvaluationPoliciesView;
import com.synopsys.integration.blackduck.api.generated.component.DeveloperScansScanItemsPolicyViolationLicensesView;
import com.synopsys.integration.blackduck.api.generated.component.DeveloperScansScanItemsPolicyViolationVulnerabilitiesView;
import com.synopsys.integration.blackduck.api.generated.component.DeveloperScansScanItemsViolatingPoliciesView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class DeveloperScansScanView extends BlackDuckView {
    private String componentIdentifier;
    private String componentName;
    private java.util.List<DeveloperScansScanItemsComponentViolatingPoliciesView> componentViolatingPolicies;
    private java.util.List<String> dependencyTrees;
    private String externalId;
    private java.util.List<DeveloperScansScanItemsFailedEvaluationPoliciesView> failedEvaluationPolicies;
    private String originId;
    private java.util.List<String> policyStatuses;
    private java.util.List<DeveloperScansScanItemsPolicyViolationLicensesView> policyViolationLicenses;
    private java.util.List<DeveloperScansScanItemsPolicyViolationVulnerabilitiesView> policyViolationVulnerabilities;
    private String versionName;
    private java.util.List<DeveloperScansScanItemsViolatingPoliciesView> violatingPolicies;

    public String getComponentIdentifier() {
        return componentIdentifier;
    }

    public void setComponentIdentifier(String componentIdentifier) {
        this.componentIdentifier = componentIdentifier;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public java.util.List<DeveloperScansScanItemsComponentViolatingPoliciesView> getComponentViolatingPolicies() {
        return componentViolatingPolicies;
    }

    public void setComponentViolatingPolicies(java.util.List<DeveloperScansScanItemsComponentViolatingPoliciesView> componentViolatingPolicies) {
        this.componentViolatingPolicies = componentViolatingPolicies;
    }

    public java.util.List<String> getDependencyTrees() {
        return dependencyTrees;
    }

    public void setDependencyTrees(java.util.List<String> dependencyTrees) {
        this.dependencyTrees = dependencyTrees;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public java.util.List<DeveloperScansScanItemsFailedEvaluationPoliciesView> getFailedEvaluationPolicies() {
        return failedEvaluationPolicies;
    }

    public void setFailedEvaluationPolicies(java.util.List<DeveloperScansScanItemsFailedEvaluationPoliciesView> failedEvaluationPolicies) {
        this.failedEvaluationPolicies = failedEvaluationPolicies;
    }

    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public java.util.List<String> getPolicyStatuses() {
        return policyStatuses;
    }

    public void setPolicyStatuses(java.util.List<String> policyStatuses) {
        this.policyStatuses = policyStatuses;
    }

    public java.util.List<DeveloperScansScanItemsPolicyViolationLicensesView> getPolicyViolationLicenses() {
        return policyViolationLicenses;
    }

    public void setPolicyViolationLicenses(java.util.List<DeveloperScansScanItemsPolicyViolationLicensesView> policyViolationLicenses) {
        this.policyViolationLicenses = policyViolationLicenses;
    }

    public java.util.List<DeveloperScansScanItemsPolicyViolationVulnerabilitiesView> getPolicyViolationVulnerabilities() {
        return policyViolationVulnerabilities;
    }

    public void setPolicyViolationVulnerabilities(java.util.List<DeveloperScansScanItemsPolicyViolationVulnerabilitiesView> policyViolationVulnerabilities) {
        this.policyViolationVulnerabilities = policyViolationVulnerabilities;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public java.util.List<DeveloperScansScanItemsViolatingPoliciesView> getViolatingPolicies() {
        return violatingPolicies;
    }

    public void setViolatingPolicies(java.util.List<DeveloperScansScanItemsViolatingPoliciesView> violatingPolicies) {
        this.violatingPolicies = violatingPolicies;
    }

}

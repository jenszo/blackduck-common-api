package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentPolicyStatusType;
import com.synopsys.integration.blackduck.api.manual.temporary.component.NameValuePairView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionPolicyStatusView extends BlackDuckView {
    private java.util.Date updatedAt;
    private java.util.List<NameValuePairView> componentVersionStatusCounts;
    private ProjectVersionComponentPolicyStatusType overallStatus;
    private ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView componentVersionPolicyViolationDetails;

    public java.util.Date getUpdatedAt() {
	    return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
	    this.updatedAt = updatedAt;
    }

    public java.util.List<NameValuePairView> getComponentVersionStatusCounts() {
	    return componentVersionStatusCounts;
    }

    public void setComponentVersionStatusCounts(java.util.List<NameValuePairView> componentVersionStatusCounts) {
	    this.componentVersionStatusCounts = componentVersionStatusCounts;
    }

    public ProjectVersionComponentPolicyStatusType getOverallStatus() {
	    return overallStatus;
    }

    public void setOverallStatus(ProjectVersionComponentPolicyStatusType overallStatus) {
	    this.overallStatus = overallStatus;
    }

    public ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView getComponentVersionPolicyViolationDetails() {
	    return componentVersionPolicyViolationDetails;
    }

    public void setComponentVersionPolicyViolationDetails(ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView componentVersionPolicyViolationDetails) {
	    this.componentVersionPolicyViolationDetails = componentVersionPolicyViolationDetails;
    }

}

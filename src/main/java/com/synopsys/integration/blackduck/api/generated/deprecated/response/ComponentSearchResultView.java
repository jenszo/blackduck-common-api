package com.synopsys.integration.blackduck.api.generated.deprecated.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;

@Deprecated
/**
* ComponentSearchResultView from the previous API is now called ComponentsView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentSearchResultView extends BlackDuckResponse {
    private String originId;
    private String component;
    private String version;
    private String variant;
    private String componentName;
    private String versionName;

    public String getOriginId() {
	    return originId;
    }

    public void setOriginId(String originId) {
	    this.originId = originId;
    }

    public String getComponent() {
	    return component;
    }

    public void setComponent(String component) {
	    this.component = component;
    }

    public String getVersion() {
	    return version;
    }

    public void setVersion(String version) {
	    this.version = version;
    }

    public String getVariant() {
	    return variant;
    }

    public void setVariant(String variant) {
	    this.variant = variant;
    }

    public String getComponentName() {
	    return componentName;
    }

    public void setComponentName(String componentName) {
	    this.componentName = componentName;
    }

    public String getVersionName() {
	    return versionName;
    }

    public void setVersionName(String versionName) {
	    this.versionName = versionName;
    }

}

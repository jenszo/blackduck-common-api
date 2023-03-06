/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionSbomFieldsItemsValueView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionSbomFieldsView extends BlackDuckComponent {
    private String fieldName;
    private String label;
    private ComponentVersionSbomFieldsItemsValueView value;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ComponentVersionSbomFieldsItemsValueView getValue() {
        return value;
    }

    public void setValue(ComponentVersionSbomFieldsItemsValueView value) {
        this.value = value;
    }

}

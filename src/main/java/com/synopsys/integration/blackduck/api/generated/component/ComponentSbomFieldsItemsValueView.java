/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentSbomFieldsItemsValueType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentSbomFieldsItemsValueView extends BlackDuckComponent {
    private String email;
    private String name;
    private ComponentSbomFieldsItemsValueType type;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentSbomFieldsItemsValueType getType() {
        return type;
    }

    public void setType(ComponentSbomFieldsItemsValueType type) {
        this.type = type;
    }

}

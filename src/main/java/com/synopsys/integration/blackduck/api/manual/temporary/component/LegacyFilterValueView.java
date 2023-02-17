/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LegacyFilterValueView extends BlackDuckComponent {
    private String key;
    private String label;
    private java.util.List<LegacyFilterValueView> values;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public java.util.List<LegacyFilterValueView> getValues() {
        return values;
    }

    public void setValues(java.util.List<LegacyFilterValueView> values) {
        this.values = values;
    }

}

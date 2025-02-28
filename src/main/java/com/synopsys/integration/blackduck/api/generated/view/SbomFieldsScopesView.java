/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.SbomFieldsScopesItemsScopeNameType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class SbomFieldsScopesView extends BlackDuckView {
    private String name;
    private SbomFieldsScopesItemsScopeNameType scopeName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SbomFieldsScopesItemsScopeNameType getScopeName() {
        return scopeName;
    }

    public void setScopeName(SbomFieldsScopesItemsScopeNameType scopeName) {
        this.scopeName = scopeName;
    }

}

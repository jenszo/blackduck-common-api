package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

@Deprecated
/**
* CommentUserData from the previous API is now called CommentUserView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class CommentUserData extends BlackDuckComponent {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean active;

    public String getUserName() {
	    return userName;
    }

    public void setUserName(String userName) {
	    this.userName = userName;
    }

    public String getFirstName() {
	    return firstName;
    }

    public void setFirstName(String firstName) {
	    this.firstName = firstName;
    }

    public String getLastName() {
	    return lastName;
    }

    public void setLastName(String lastName) {
	    this.lastName = lastName;
    }

    public String getEmail() {
	    return email;
    }

    public void setEmail(String email) {
	    this.email = email;
    }

    public Boolean getActive() {
	    return active;
    }

    public void setActive(Boolean active) {
	    this.active = active;
    }

}

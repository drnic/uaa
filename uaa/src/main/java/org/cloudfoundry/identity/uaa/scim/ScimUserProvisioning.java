package org.cloudfoundry.identity.uaa.scim;

import java.util.Collection;

/**
 * @author Luke Taylor
 * @author Dave Syer
 */
public interface ScimUserProvisioning {

	public ScimUser retrieveUser(String id);

	public Collection<ScimUser> retrieveUsers();

	public ScimUser createUser(ScimUser user);

	public ScimUser updateUser(String id, ScimUser user);

	public ScimUser removeUser(String id);

}

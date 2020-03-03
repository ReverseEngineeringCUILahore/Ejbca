package org.cesecore.certificates.ca.extendedservices;

/**
 * 
 * @version $Id: ExtendedCAServiceTypes.java 32112 2019-04-11 10:36:33Z tarmo_r_helmes $
 *
 */

public class ExtendedCAServiceTypes {

    @Deprecated //Removed in EJBCA 6.0.0, and retained to support migration. Remove once support for upgrading from 4.0.x is dropped. 
	public static final int TYPE_OCSPEXTENDEDSERVICE   = 1; 	
    // Number 2 was XKMS, do not re-use this as it might cause interoperability/upgrade issues from older installations that had it
	public static final int TYPE_CMSEXTENDEDSERVICE = 3;
	
	@Deprecated //Removed in EJBCA 7.1.0, and retained to support migration. Remove once support for upgrading from 7.0.x is dropped.
	public static final int TYPE_HARDTOKENENCEXTENDEDSERVICE = 4;
	
	public static final int TYPE_KEYRECOVERYEXTENDEDSERVICE = 5;

}

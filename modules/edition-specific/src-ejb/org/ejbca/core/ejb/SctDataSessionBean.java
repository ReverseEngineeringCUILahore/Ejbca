/*************************************************************************
 *                                                                       *
 *  EJBCA Community: The OpenSource Certificate Authority                *
 *                                                                       *
 *  This software is free software; you can redistribute it and/or       *
 *  modify it under the terms of the GNU Lesser General Public           *
 *  License as published by the Free Software Foundation; either         *
 *  version 2.1 of the License, or any later version.                    *
 *                                                                       *
 *  See terms of license at gnu.org.                                     *
 *                                                                       *
 *************************************************************************/
package org.ejbca.core.ejb;

import org.cesecore.certificates.certificatetransparency.SctData;
import org.cesecore.certificates.certificatetransparency.SctDataSessionLocal;
import org.cesecore.jndi.JndiConstants;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import java.util.List;
import java.util.concurrent.ExecutorService;

/**
 * @version $Id: SctDataSessionBean.java 32894 2019-07-29 08:27:37Z samuellb $
 */
@Stateless(mappedName = JndiConstants.APP_JNDI_PREFIX + "SctDataSession")
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class SctDataSessionBean implements SctDataSessionLocal {
    @Override
    public List<SctData> findSctData(String fingerprint) {
        throw new UnsupportedOperationException("SCT calls are only supported in EJBCA Enterprise");
    }

    @Override
    public void addSctData(SctData sctData) {
        throw new UnsupportedOperationException("SCT calls are only supported in EJBCA Enterprise");
    }

    @Override
    public ExecutorService getThreadPool() {
        throw new UnsupportedOperationException("SCT calls are only supported in EJBCA Enterprise");
    }
}

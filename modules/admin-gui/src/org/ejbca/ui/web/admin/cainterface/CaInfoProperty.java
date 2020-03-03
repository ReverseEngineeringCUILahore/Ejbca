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

package org.ejbca.ui.web.admin.cainterface;

/**
 * 
 * @version $Id: CaInfoProperty.java 31628 2019-02-28 14:44:04Z anatom $
 *
 */

public class CaInfoProperty {    
    private final String text;
    private final String data;
    
    public CaInfoProperty(final String text, final String data) {
        this.text = text;
        this.data = data;
    }

    public String getText() {
        return text;
    }

    public String getData() {
        return data;
    }
}
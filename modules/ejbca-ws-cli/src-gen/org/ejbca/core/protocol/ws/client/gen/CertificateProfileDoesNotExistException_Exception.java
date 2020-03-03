
package org.ejbca.core.protocol.ws.client.gen;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 *
 */
@WebFault(name = "CertificateProfileDoesNotExistException", targetNamespace = "http://ws.protocol.core.ejbca.org/")
public class CertificateProfileDoesNotExistException_Exception extends Exception {

    private static final long serialVersionUID = -6035290122787475948L;
    /**
     * Java type that goes as soapenv:Fault detail element.
     *
     */
    private CertificateProfileDoesNotExistException faultInfo;

    /**
     *
     * @param faultInfo
     * @param message
     */
    public CertificateProfileDoesNotExistException_Exception(String message, CertificateProfileDoesNotExistException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @param faultInfo
     * @param cause
     * @param message
     */
    public CertificateProfileDoesNotExistException_Exception(String message, CertificateProfileDoesNotExistException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @return
     *     returns fault bean: org.ejbca.core.protocol.ws.client.gen.CertificateProfileDoesNotExistException
     */
    public CertificateProfileDoesNotExistException getFaultInfo() {
        return faultInfo;
    }

}

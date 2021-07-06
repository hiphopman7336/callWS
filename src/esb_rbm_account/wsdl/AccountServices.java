/**
 * AccountServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.wsdl;

public interface AccountServices extends javax.xml.rpc.Service {
    public java.lang.String getAccountPortAddress();

    public esb_rbm_account.wsdl.AccountPortType getAccountPort() throws javax.xml.rpc.ServiceException;

    public esb_rbm_account.wsdl.AccountPortType getAccountPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

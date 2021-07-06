/**
 * UpdateBARequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class UpdateBARequest  implements java.io.Serializable {
    private esb_rbm_account.common_integrated.ContextIntegrator contextIntegrator;

    private esb_rbm_account.xsd.UpdateBARequestBillingAccount billingAccount;

    public UpdateBARequest() {
    }

    public UpdateBARequest(
           esb_rbm_account.common_integrated.ContextIntegrator contextIntegrator,
           esb_rbm_account.xsd.UpdateBARequestBillingAccount billingAccount) {
           this.contextIntegrator = contextIntegrator;
           this.billingAccount = billingAccount;
    }


    /**
     * Gets the contextIntegrator value for this UpdateBARequest.
     * 
     * @return contextIntegrator
     */
    public esb_rbm_account.common_integrated.ContextIntegrator getContextIntegrator() {
        return contextIntegrator;
    }


    /**
     * Sets the contextIntegrator value for this UpdateBARequest.
     * 
     * @param contextIntegrator
     */
    public void setContextIntegrator(esb_rbm_account.common_integrated.ContextIntegrator contextIntegrator) {
        this.contextIntegrator = contextIntegrator;
    }


    /**
     * Gets the billingAccount value for this UpdateBARequest.
     * 
     * @return billingAccount
     */
    public esb_rbm_account.xsd.UpdateBARequestBillingAccount getBillingAccount() {
        return billingAccount;
    }


    /**
     * Sets the billingAccount value for this UpdateBARequest.
     * 
     * @param billingAccount
     */
    public void setBillingAccount(esb_rbm_account.xsd.UpdateBARequestBillingAccount billingAccount) {
        this.billingAccount = billingAccount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateBARequest)) return false;
        UpdateBARequest other = (UpdateBARequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contextIntegrator==null && other.getContextIntegrator()==null) || 
             (this.contextIntegrator!=null &&
              this.contextIntegrator.equals(other.getContextIntegrator()))) &&
            ((this.billingAccount==null && other.getBillingAccount()==null) || 
             (this.billingAccount!=null &&
              this.billingAccount.equals(other.getBillingAccount())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getContextIntegrator() != null) {
            _hashCode += getContextIntegrator().hashCode();
        }
        if (getBillingAccount() != null) {
            _hashCode += getBillingAccount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

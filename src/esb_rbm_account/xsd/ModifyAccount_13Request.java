/**
 * ModifyAccount_13Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class ModifyAccount_13Request  implements java.io.Serializable {
    private esb_rbm_account.common_integrated.ContextIntegrator contextIntegrator;

    private java.lang.String billingAccountId;

    private java.lang.String accountLockVersion;

    private java.lang.String billType;

    private java.lang.String billLanguage;

    private java.lang.String billFrequence;

    private long paymentMethodId;

    private java.math.BigDecimal creditLimit;

    public ModifyAccount_13Request() {
    }

    public ModifyAccount_13Request(
           esb_rbm_account.common_integrated.ContextIntegrator contextIntegrator,
           java.lang.String billingAccountId,
           java.lang.String accountLockVersion,
           java.lang.String billType,
           java.lang.String billLanguage,
           java.lang.String billFrequence,
           long paymentMethodId,
           java.math.BigDecimal creditLimit) {
           this.contextIntegrator = contextIntegrator;
           this.billingAccountId = billingAccountId;
           this.accountLockVersion = accountLockVersion;
           this.billType = billType;
           this.billLanguage = billLanguage;
           this.billFrequence = billFrequence;
           this.paymentMethodId = paymentMethodId;
           this.creditLimit = creditLimit;
    }


    /**
     * Gets the contextIntegrator value for this ModifyAccount_13Request.
     * 
     * @return contextIntegrator
     */
    public esb_rbm_account.common_integrated.ContextIntegrator getContextIntegrator() {
        return contextIntegrator;
    }


    /**
     * Sets the contextIntegrator value for this ModifyAccount_13Request.
     * 
     * @param contextIntegrator
     */
    public void setContextIntegrator(esb_rbm_account.common_integrated.ContextIntegrator contextIntegrator) {
        this.contextIntegrator = contextIntegrator;
    }


    /**
     * Gets the billingAccountId value for this ModifyAccount_13Request.
     * 
     * @return billingAccountId
     */
    public java.lang.String getBillingAccountId() {
        return billingAccountId;
    }


    /**
     * Sets the billingAccountId value for this ModifyAccount_13Request.
     * 
     * @param billingAccountId
     */
    public void setBillingAccountId(java.lang.String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }


    /**
     * Gets the accountLockVersion value for this ModifyAccount_13Request.
     * 
     * @return accountLockVersion
     */
    public java.lang.String getAccountLockVersion() {
        return accountLockVersion;
    }


    /**
     * Sets the accountLockVersion value for this ModifyAccount_13Request.
     * 
     * @param accountLockVersion
     */
    public void setAccountLockVersion(java.lang.String accountLockVersion) {
        this.accountLockVersion = accountLockVersion;
    }


    /**
     * Gets the billType value for this ModifyAccount_13Request.
     * 
     * @return billType
     */
    public java.lang.String getBillType() {
        return billType;
    }


    /**
     * Sets the billType value for this ModifyAccount_13Request.
     * 
     * @param billType
     */
    public void setBillType(java.lang.String billType) {
        this.billType = billType;
    }


    /**
     * Gets the billLanguage value for this ModifyAccount_13Request.
     * 
     * @return billLanguage
     */
    public java.lang.String getBillLanguage() {
        return billLanguage;
    }


    /**
     * Sets the billLanguage value for this ModifyAccount_13Request.
     * 
     * @param billLanguage
     */
    public void setBillLanguage(java.lang.String billLanguage) {
        this.billLanguage = billLanguage;
    }


    /**
     * Gets the billFrequence value for this ModifyAccount_13Request.
     * 
     * @return billFrequence
     */
    public java.lang.String getBillFrequence() {
        return billFrequence;
    }


    /**
     * Sets the billFrequence value for this ModifyAccount_13Request.
     * 
     * @param billFrequence
     */
    public void setBillFrequence(java.lang.String billFrequence) {
        this.billFrequence = billFrequence;
    }


    /**
     * Gets the paymentMethodId value for this ModifyAccount_13Request.
     * 
     * @return paymentMethodId
     */
    public long getPaymentMethodId() {
        return paymentMethodId;
    }


    /**
     * Sets the paymentMethodId value for this ModifyAccount_13Request.
     * 
     * @param paymentMethodId
     */
    public void setPaymentMethodId(long paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }


    /**
     * Gets the creditLimit value for this ModifyAccount_13Request.
     * 
     * @return creditLimit
     */
    public java.math.BigDecimal getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this ModifyAccount_13Request.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.math.BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyAccount_13Request)) return false;
        ModifyAccount_13Request other = (ModifyAccount_13Request) obj;
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
            ((this.billingAccountId==null && other.getBillingAccountId()==null) || 
             (this.billingAccountId!=null &&
              this.billingAccountId.equals(other.getBillingAccountId()))) &&
            ((this.accountLockVersion==null && other.getAccountLockVersion()==null) || 
             (this.accountLockVersion!=null &&
              this.accountLockVersion.equals(other.getAccountLockVersion()))) &&
            ((this.billType==null && other.getBillType()==null) || 
             (this.billType!=null &&
              this.billType.equals(other.getBillType()))) &&
            ((this.billLanguage==null && other.getBillLanguage()==null) || 
             (this.billLanguage!=null &&
              this.billLanguage.equals(other.getBillLanguage()))) &&
            ((this.billFrequence==null && other.getBillFrequence()==null) || 
             (this.billFrequence!=null &&
              this.billFrequence.equals(other.getBillFrequence()))) &&
            this.paymentMethodId == other.getPaymentMethodId() &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit())));
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
        if (getBillingAccountId() != null) {
            _hashCode += getBillingAccountId().hashCode();
        }
        if (getAccountLockVersion() != null) {
            _hashCode += getAccountLockVersion().hashCode();
        }
        if (getBillType() != null) {
            _hashCode += getBillType().hashCode();
        }
        if (getBillLanguage() != null) {
            _hashCode += getBillLanguage().hashCode();
        }
        if (getBillFrequence() != null) {
            _hashCode += getBillFrequence().hashCode();
        }
        _hashCode += new Long(getPaymentMethodId()).hashCode();
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

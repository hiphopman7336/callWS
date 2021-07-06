/**
 * QueryAccount_15ResponseBillingAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class QueryAccount_15ResponseBillingAccount  implements java.io.Serializable {
    private java.lang.String accountLockVersion;

    public QueryAccount_15ResponseBillingAccount() {
    }

    public QueryAccount_15ResponseBillingAccount(
           java.lang.String accountLockVersion) {
           this.accountLockVersion = accountLockVersion;
    }


    /**
     * Gets the accountLockVersion value for this QueryAccount_15ResponseBillingAccount.
     * 
     * @return accountLockVersion
     */
    public java.lang.String getAccountLockVersion() {
        return accountLockVersion;
    }


    /**
     * Sets the accountLockVersion value for this QueryAccount_15ResponseBillingAccount.
     * 
     * @param accountLockVersion
     */
    public void setAccountLockVersion(java.lang.String accountLockVersion) {
        this.accountLockVersion = accountLockVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryAccount_15ResponseBillingAccount)) return false;
        QueryAccount_15ResponseBillingAccount other = (QueryAccount_15ResponseBillingAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountLockVersion==null && other.getAccountLockVersion()==null) || 
             (this.accountLockVersion!=null &&
              this.accountLockVersion.equals(other.getAccountLockVersion())));
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
        if (getAccountLockVersion() != null) {
            _hashCode += getAccountLockVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

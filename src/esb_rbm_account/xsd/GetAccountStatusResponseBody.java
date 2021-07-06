/**
 * GetAccountStatusResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class GetAccountStatusResponseBody  implements java.io.Serializable {
    private int accountStatusNumber;

    private java.lang.String accountStatusDescription;

    public GetAccountStatusResponseBody() {
    }

    public GetAccountStatusResponseBody(
           int accountStatusNumber,
           java.lang.String accountStatusDescription) {
           this.accountStatusNumber = accountStatusNumber;
           this.accountStatusDescription = accountStatusDescription;
    }


    /**
     * Gets the accountStatusNumber value for this GetAccountStatusResponseBody.
     * 
     * @return accountStatusNumber
     */
    public int getAccountStatusNumber() {
        return accountStatusNumber;
    }


    /**
     * Sets the accountStatusNumber value for this GetAccountStatusResponseBody.
     * 
     * @param accountStatusNumber
     */
    public void setAccountStatusNumber(int accountStatusNumber) {
        this.accountStatusNumber = accountStatusNumber;
    }


    /**
     * Gets the accountStatusDescription value for this GetAccountStatusResponseBody.
     * 
     * @return accountStatusDescription
     */
    public java.lang.String getAccountStatusDescription() {
        return accountStatusDescription;
    }


    /**
     * Sets the accountStatusDescription value for this GetAccountStatusResponseBody.
     * 
     * @param accountStatusDescription
     */
    public void setAccountStatusDescription(java.lang.String accountStatusDescription) {
        this.accountStatusDescription = accountStatusDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccountStatusResponseBody)) return false;
        GetAccountStatusResponseBody other = (GetAccountStatusResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accountStatusNumber == other.getAccountStatusNumber() &&
            ((this.accountStatusDescription==null && other.getAccountStatusDescription()==null) || 
             (this.accountStatusDescription!=null &&
              this.accountStatusDescription.equals(other.getAccountStatusDescription())));
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
        _hashCode += getAccountStatusNumber();
        if (getAccountStatusDescription() != null) {
            _hashCode += getAccountStatusDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

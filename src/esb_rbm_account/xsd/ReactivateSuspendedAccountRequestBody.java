/**
 * ReactivateSuspendedAccountRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class ReactivateSuspendedAccountRequestBody  implements java.io.Serializable {
    private java.lang.String accountRef;

    private java.lang.String startDateTime;

    public ReactivateSuspendedAccountRequestBody() {
    }

    public ReactivateSuspendedAccountRequestBody(
           java.lang.String accountRef,
           java.lang.String startDateTime) {
           this.accountRef = accountRef;
           this.startDateTime = startDateTime;
    }


    /**
     * Gets the accountRef value for this ReactivateSuspendedAccountRequestBody.
     * 
     * @return accountRef
     */
    public java.lang.String getAccountRef() {
        return accountRef;
    }


    /**
     * Sets the accountRef value for this ReactivateSuspendedAccountRequestBody.
     * 
     * @param accountRef
     */
    public void setAccountRef(java.lang.String accountRef) {
        this.accountRef = accountRef;
    }


    /**
     * Gets the startDateTime value for this ReactivateSuspendedAccountRequestBody.
     * 
     * @return startDateTime
     */
    public java.lang.String getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this ReactivateSuspendedAccountRequestBody.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(java.lang.String startDateTime) {
        this.startDateTime = startDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReactivateSuspendedAccountRequestBody)) return false;
        ReactivateSuspendedAccountRequestBody other = (ReactivateSuspendedAccountRequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountRef==null && other.getAccountRef()==null) || 
             (this.accountRef!=null &&
              this.accountRef.equals(other.getAccountRef()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime())));
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
        if (getAccountRef() != null) {
            _hashCode += getAccountRef().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

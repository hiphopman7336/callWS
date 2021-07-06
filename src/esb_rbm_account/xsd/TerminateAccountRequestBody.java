/**
 * TerminateAccountRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class TerminateAccountRequestBody  implements java.io.Serializable {
    private java.lang.String accountRef;

    private java.lang.String terminateDateTime;

    private int terminationReasonId;

    public TerminateAccountRequestBody() {
    }

    public TerminateAccountRequestBody(
           java.lang.String accountRef,
           java.lang.String terminateDateTime,
           int terminationReasonId) {
           this.accountRef = accountRef;
           this.terminateDateTime = terminateDateTime;
           this.terminationReasonId = terminationReasonId;
    }


    /**
     * Gets the accountRef value for this TerminateAccountRequestBody.
     * 
     * @return accountRef
     */
    public java.lang.String getAccountRef() {
        return accountRef;
    }


    /**
     * Sets the accountRef value for this TerminateAccountRequestBody.
     * 
     * @param accountRef
     */
    public void setAccountRef(java.lang.String accountRef) {
        this.accountRef = accountRef;
    }


    /**
     * Gets the terminateDateTime value for this TerminateAccountRequestBody.
     * 
     * @return terminateDateTime
     */
    public java.lang.String getTerminateDateTime() {
        return terminateDateTime;
    }


    /**
     * Sets the terminateDateTime value for this TerminateAccountRequestBody.
     * 
     * @param terminateDateTime
     */
    public void setTerminateDateTime(java.lang.String terminateDateTime) {
        this.terminateDateTime = terminateDateTime;
    }


    /**
     * Gets the terminationReasonId value for this TerminateAccountRequestBody.
     * 
     * @return terminationReasonId
     */
    public int getTerminationReasonId() {
        return terminationReasonId;
    }


    /**
     * Sets the terminationReasonId value for this TerminateAccountRequestBody.
     * 
     * @param terminationReasonId
     */
    public void setTerminationReasonId(int terminationReasonId) {
        this.terminationReasonId = terminationReasonId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TerminateAccountRequestBody)) return false;
        TerminateAccountRequestBody other = (TerminateAccountRequestBody) obj;
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
            ((this.terminateDateTime==null && other.getTerminateDateTime()==null) || 
             (this.terminateDateTime!=null &&
              this.terminateDateTime.equals(other.getTerminateDateTime()))) &&
            this.terminationReasonId == other.getTerminationReasonId();
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
        if (getTerminateDateTime() != null) {
            _hashCode += getTerminateDateTime().hashCode();
        }
        _hashCode += getTerminationReasonId();
        __hashCodeCalc = false;
        return _hashCode;
    }

}

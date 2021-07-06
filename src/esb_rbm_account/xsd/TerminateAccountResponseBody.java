/**
 * TerminateAccountResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class TerminateAccountResponseBody  implements java.io.Serializable {
    private long result;

    public TerminateAccountResponseBody() {
    }

    public TerminateAccountResponseBody(
           long result) {
           this.result = result;
    }


    /**
     * Gets the result value for this TerminateAccountResponseBody.
     * 
     * @return result
     */
    public long getResult() {
        return result;
    }


    /**
     * Sets the result value for this TerminateAccountResponseBody.
     * 
     * @param result
     */
    public void setResult(long result) {
        this.result = result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TerminateAccountResponseBody)) return false;
        TerminateAccountResponseBody other = (TerminateAccountResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.result == other.getResult();
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
        _hashCode += new Long(getResult()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}

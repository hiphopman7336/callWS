/**
 * ModifyAccountCPSResponseBodyReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class ModifyAccountCPSResponseBodyReturn  implements java.io.Serializable {
    private int result;

    private int SQLErrorCode;

    private java.lang.String SQLErrorMessage;

    public ModifyAccountCPSResponseBodyReturn() {
    }

    public ModifyAccountCPSResponseBodyReturn(
           int result,
           int SQLErrorCode,
           java.lang.String SQLErrorMessage) {
           this.result = result;
           this.SQLErrorCode = SQLErrorCode;
           this.SQLErrorMessage = SQLErrorMessage;
    }


    /**
     * Gets the result value for this ModifyAccountCPSResponseBodyReturn.
     * 
     * @return result
     */
    public int getResult() {
        return result;
    }


    /**
     * Sets the result value for this ModifyAccountCPSResponseBodyReturn.
     * 
     * @param result
     */
    public void setResult(int result) {
        this.result = result;
    }


    /**
     * Gets the SQLErrorCode value for this ModifyAccountCPSResponseBodyReturn.
     * 
     * @return SQLErrorCode
     */
    public int getSQLErrorCode() {
        return SQLErrorCode;
    }


    /**
     * Sets the SQLErrorCode value for this ModifyAccountCPSResponseBodyReturn.
     * 
     * @param SQLErrorCode
     */
    public void setSQLErrorCode(int SQLErrorCode) {
        this.SQLErrorCode = SQLErrorCode;
    }


    /**
     * Gets the SQLErrorMessage value for this ModifyAccountCPSResponseBodyReturn.
     * 
     * @return SQLErrorMessage
     */
    public java.lang.String getSQLErrorMessage() {
        return SQLErrorMessage;
    }


    /**
     * Sets the SQLErrorMessage value for this ModifyAccountCPSResponseBodyReturn.
     * 
     * @param SQLErrorMessage
     */
    public void setSQLErrorMessage(java.lang.String SQLErrorMessage) {
        this.SQLErrorMessage = SQLErrorMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyAccountCPSResponseBodyReturn)) return false;
        ModifyAccountCPSResponseBodyReturn other = (ModifyAccountCPSResponseBodyReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.result == other.getResult() &&
            this.SQLErrorCode == other.getSQLErrorCode() &&
            ((this.SQLErrorMessage==null && other.getSQLErrorMessage()==null) || 
             (this.SQLErrorMessage!=null &&
              this.SQLErrorMessage.equals(other.getSQLErrorMessage())));
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
        _hashCode += getResult();
        _hashCode += getSQLErrorCode();
        if (getSQLErrorMessage() != null) {
            _hashCode += getSQLErrorMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

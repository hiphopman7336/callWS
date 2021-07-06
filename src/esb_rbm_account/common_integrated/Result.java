/**
 * Result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common_integrated;

public class Result  implements java.io.Serializable {
    private boolean result;

    private java.lang.String esbReturnCode;

    private java.lang.String esbReturnMsg;

    private java.lang.String destinationReturnCode;

    private java.lang.String destinationReturnMsg;

    public Result() {
    }

    public Result(
           boolean result,
           java.lang.String esbReturnCode,
           java.lang.String esbReturnMsg,
           java.lang.String destinationReturnCode,
           java.lang.String destinationReturnMsg) {
           this.result = result;
           this.esbReturnCode = esbReturnCode;
           this.esbReturnMsg = esbReturnMsg;
           this.destinationReturnCode = destinationReturnCode;
           this.destinationReturnMsg = destinationReturnMsg;
    }


    /**
     * Gets the result value for this Result.
     * 
     * @return result
     */
    public boolean isResult() {
        return result;
    }


    /**
     * Sets the result value for this Result.
     * 
     * @param result
     */
    public void setResult(boolean result) {
        this.result = result;
    }


    /**
     * Gets the esbReturnCode value for this Result.
     * 
     * @return esbReturnCode
     */
    public java.lang.String getEsbReturnCode() {
        return esbReturnCode;
    }


    /**
     * Sets the esbReturnCode value for this Result.
     * 
     * @param esbReturnCode
     */
    public void setEsbReturnCode(java.lang.String esbReturnCode) {
        this.esbReturnCode = esbReturnCode;
    }


    /**
     * Gets the esbReturnMsg value for this Result.
     * 
     * @return esbReturnMsg
     */
    public java.lang.String getEsbReturnMsg() {
        return esbReturnMsg;
    }


    /**
     * Sets the esbReturnMsg value for this Result.
     * 
     * @param esbReturnMsg
     */
    public void setEsbReturnMsg(java.lang.String esbReturnMsg) {
        this.esbReturnMsg = esbReturnMsg;
    }


    /**
     * Gets the destinationReturnCode value for this Result.
     * 
     * @return destinationReturnCode
     */
    public java.lang.String getDestinationReturnCode() {
        return destinationReturnCode;
    }


    /**
     * Sets the destinationReturnCode value for this Result.
     * 
     * @param destinationReturnCode
     */
    public void setDestinationReturnCode(java.lang.String destinationReturnCode) {
        this.destinationReturnCode = destinationReturnCode;
    }


    /**
     * Gets the destinationReturnMsg value for this Result.
     * 
     * @return destinationReturnMsg
     */
    public java.lang.String getDestinationReturnMsg() {
        return destinationReturnMsg;
    }


    /**
     * Sets the destinationReturnMsg value for this Result.
     * 
     * @param destinationReturnMsg
     */
    public void setDestinationReturnMsg(java.lang.String destinationReturnMsg) {
        this.destinationReturnMsg = destinationReturnMsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Result)) return false;
        Result other = (Result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.result == other.isResult() &&
            ((this.esbReturnCode==null && other.getEsbReturnCode()==null) || 
             (this.esbReturnCode!=null &&
              this.esbReturnCode.equals(other.getEsbReturnCode()))) &&
            ((this.esbReturnMsg==null && other.getEsbReturnMsg()==null) || 
             (this.esbReturnMsg!=null &&
              this.esbReturnMsg.equals(other.getEsbReturnMsg()))) &&
            ((this.destinationReturnCode==null && other.getDestinationReturnCode()==null) || 
             (this.destinationReturnCode!=null &&
              this.destinationReturnCode.equals(other.getDestinationReturnCode()))) &&
            ((this.destinationReturnMsg==null && other.getDestinationReturnMsg()==null) || 
             (this.destinationReturnMsg!=null &&
              this.destinationReturnMsg.equals(other.getDestinationReturnMsg())));
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
        _hashCode += (isResult() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEsbReturnCode() != null) {
            _hashCode += getEsbReturnCode().hashCode();
        }
        if (getEsbReturnMsg() != null) {
            _hashCode += getEsbReturnMsg().hashCode();
        }
        if (getDestinationReturnCode() != null) {
            _hashCode += getDestinationReturnCode().hashCode();
        }
        if (getDestinationReturnMsg() != null) {
            _hashCode += getDestinationReturnMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

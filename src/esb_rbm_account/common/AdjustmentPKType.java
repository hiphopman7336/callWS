/**
 * AdjustmentPKType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class AdjustmentPKType  implements java.io.Serializable {
    private java.lang.String accountRef;

    private int adjustmentSeq;

    public AdjustmentPKType() {
    }

    public AdjustmentPKType(
           java.lang.String accountRef,
           int adjustmentSeq) {
           this.accountRef = accountRef;
           this.adjustmentSeq = adjustmentSeq;
    }


    /**
     * Gets the accountRef value for this AdjustmentPKType.
     * 
     * @return accountRef
     */
    public java.lang.String getAccountRef() {
        return accountRef;
    }


    /**
     * Sets the accountRef value for this AdjustmentPKType.
     * 
     * @param accountRef
     */
    public void setAccountRef(java.lang.String accountRef) {
        this.accountRef = accountRef;
    }


    /**
     * Gets the adjustmentSeq value for this AdjustmentPKType.
     * 
     * @return adjustmentSeq
     */
    public int getAdjustmentSeq() {
        return adjustmentSeq;
    }


    /**
     * Sets the adjustmentSeq value for this AdjustmentPKType.
     * 
     * @param adjustmentSeq
     */
    public void setAdjustmentSeq(int adjustmentSeq) {
        this.adjustmentSeq = adjustmentSeq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdjustmentPKType)) return false;
        AdjustmentPKType other = (AdjustmentPKType) obj;
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
            this.adjustmentSeq == other.getAdjustmentSeq();
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
        _hashCode += getAdjustmentSeq();
        __hashCodeCalc = false;
        return _hashCode;
    }

}

/**
 * BillRequestPKType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class BillRequestPKType  implements java.io.Serializable {
    private java.lang.String accountRef;

    private int requestSeq;

    public BillRequestPKType() {
    }

    public BillRequestPKType(
           java.lang.String accountRef,
           int requestSeq) {
           this.accountRef = accountRef;
           this.requestSeq = requestSeq;
    }


    /**
     * Gets the accountRef value for this BillRequestPKType.
     * 
     * @return accountRef
     */
    public java.lang.String getAccountRef() {
        return accountRef;
    }


    /**
     * Sets the accountRef value for this BillRequestPKType.
     * 
     * @param accountRef
     */
    public void setAccountRef(java.lang.String accountRef) {
        this.accountRef = accountRef;
    }


    /**
     * Gets the requestSeq value for this BillRequestPKType.
     * 
     * @return requestSeq
     */
    public int getRequestSeq() {
        return requestSeq;
    }


    /**
     * Sets the requestSeq value for this BillRequestPKType.
     * 
     * @param requestSeq
     */
    public void setRequestSeq(int requestSeq) {
        this.requestSeq = requestSeq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillRequestPKType)) return false;
        BillRequestPKType other = (BillRequestPKType) obj;
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
            this.requestSeq == other.getRequestSeq();
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
        _hashCode += getRequestSeq();
        __hashCodeCalc = false;
        return _hashCode;
    }

}

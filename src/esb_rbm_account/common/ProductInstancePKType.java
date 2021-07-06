/**
 * ProductInstancePKType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class ProductInstancePKType  implements java.io.Serializable {
    private java.lang.String customerRef;

    private int productSeq;

    public ProductInstancePKType() {
    }

    public ProductInstancePKType(
           java.lang.String customerRef,
           int productSeq) {
           this.customerRef = customerRef;
           this.productSeq = productSeq;
    }


    /**
     * Gets the customerRef value for this ProductInstancePKType.
     * 
     * @return customerRef
     */
    public java.lang.String getCustomerRef() {
        return customerRef;
    }


    /**
     * Sets the customerRef value for this ProductInstancePKType.
     * 
     * @param customerRef
     */
    public void setCustomerRef(java.lang.String customerRef) {
        this.customerRef = customerRef;
    }


    /**
     * Gets the productSeq value for this ProductInstancePKType.
     * 
     * @return productSeq
     */
    public int getProductSeq() {
        return productSeq;
    }


    /**
     * Sets the productSeq value for this ProductInstancePKType.
     * 
     * @param productSeq
     */
    public void setProductSeq(int productSeq) {
        this.productSeq = productSeq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductInstancePKType)) return false;
        ProductInstancePKType other = (ProductInstancePKType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerRef==null && other.getCustomerRef()==null) || 
             (this.customerRef!=null &&
              this.customerRef.equals(other.getCustomerRef()))) &&
            this.productSeq == other.getProductSeq();
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
        if (getCustomerRef() != null) {
            _hashCode += getCustomerRef().hashCode();
        }
        _hashCode += getProductSeq();
        __hashCodeCalc = false;
        return _hashCode;
    }

}

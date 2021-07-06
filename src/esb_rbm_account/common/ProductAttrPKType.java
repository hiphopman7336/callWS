/**
 * ProductAttrPKType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class ProductAttrPKType  implements java.io.Serializable {
    private int productId;

    private int productAttrSubId;

    public ProductAttrPKType() {
    }

    public ProductAttrPKType(
           int productId,
           int productAttrSubId) {
           this.productId = productId;
           this.productAttrSubId = productAttrSubId;
    }


    /**
     * Gets the productId value for this ProductAttrPKType.
     * 
     * @return productId
     */
    public int getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this ProductAttrPKType.
     * 
     * @param productId
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }


    /**
     * Gets the productAttrSubId value for this ProductAttrPKType.
     * 
     * @return productAttrSubId
     */
    public int getProductAttrSubId() {
        return productAttrSubId;
    }


    /**
     * Sets the productAttrSubId value for this ProductAttrPKType.
     * 
     * @param productAttrSubId
     */
    public void setProductAttrSubId(int productAttrSubId) {
        this.productAttrSubId = productAttrSubId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductAttrPKType)) return false;
        ProductAttrPKType other = (ProductAttrPKType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.productId == other.getProductId() &&
            this.productAttrSubId == other.getProductAttrSubId();
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
        _hashCode += getProductId();
        _hashCode += getProductAttrSubId();
        __hashCodeCalc = false;
        return _hashCode;
    }

}

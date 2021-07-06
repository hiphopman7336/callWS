/**
 * ProductInstanceInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class ProductInstanceInfoType  implements java.io.Serializable {
    private esb_rbm_account.common.ProductInstancePKType productInstancePK;

    private int productId;

    private java.lang.String productName;

    private int billingTariff;

    private java.lang.String billingTariffName;

    private java.lang.String billingTariffNameThai;

    private java.lang.String billingTariffDesc;

    private int productStatus;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private esb_rbm_account.common.ProductAttributesType productAttributes;

    private esb_rbm_account.common.RBMAddressType serviceAddress;

    private esb_rbm_account.common.RBMAddressType startLocationAddress;

    private esb_rbm_account.common.RBMAddressType endLocationAddress;

    private java.lang.Integer parentProductSeq;

    private esb_rbm_account.common.OverridePrice[] overridePrice;

    private esb_rbm_account.common.ProductTariff[] productTariff;

    private java.lang.Integer productQuantity;

    public ProductInstanceInfoType() {
    }

    public ProductInstanceInfoType(
           esb_rbm_account.common.ProductInstancePKType productInstancePK,
           int productId,
           java.lang.String productName,
           int billingTariff,
           java.lang.String billingTariffName,
           java.lang.String billingTariffNameThai,
           java.lang.String billingTariffDesc,
           int productStatus,
           java.lang.String startDate,
           java.lang.String endDate,
           esb_rbm_account.common.ProductAttributesType productAttributes,
           esb_rbm_account.common.RBMAddressType serviceAddress,
           esb_rbm_account.common.RBMAddressType startLocationAddress,
           esb_rbm_account.common.RBMAddressType endLocationAddress,
           java.lang.Integer parentProductSeq,
           esb_rbm_account.common.OverridePrice[] overridePrice,
           esb_rbm_account.common.ProductTariff[] productTariff,
           java.lang.Integer productQuantity) {
           this.productInstancePK = productInstancePK;
           this.productId = productId;
           this.productName = productName;
           this.billingTariff = billingTariff;
           this.billingTariffName = billingTariffName;
           this.billingTariffNameThai = billingTariffNameThai;
           this.billingTariffDesc = billingTariffDesc;
           this.productStatus = productStatus;
           this.startDate = startDate;
           this.endDate = endDate;
           this.productAttributes = productAttributes;
           this.serviceAddress = serviceAddress;
           this.startLocationAddress = startLocationAddress;
           this.endLocationAddress = endLocationAddress;
           this.parentProductSeq = parentProductSeq;
           this.overridePrice = overridePrice;
           this.productTariff = productTariff;
           this.productQuantity = productQuantity;
    }


    /**
     * Gets the productInstancePK value for this ProductInstanceInfoType.
     * 
     * @return productInstancePK
     */
    public esb_rbm_account.common.ProductInstancePKType getProductInstancePK() {
        return productInstancePK;
    }


    /**
     * Sets the productInstancePK value for this ProductInstanceInfoType.
     * 
     * @param productInstancePK
     */
    public void setProductInstancePK(esb_rbm_account.common.ProductInstancePKType productInstancePK) {
        this.productInstancePK = productInstancePK;
    }


    /**
     * Gets the productId value for this ProductInstanceInfoType.
     * 
     * @return productId
     */
    public int getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this ProductInstanceInfoType.
     * 
     * @param productId
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }


    /**
     * Gets the productName value for this ProductInstanceInfoType.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this ProductInstanceInfoType.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the billingTariff value for this ProductInstanceInfoType.
     * 
     * @return billingTariff
     */
    public int getBillingTariff() {
        return billingTariff;
    }


    /**
     * Sets the billingTariff value for this ProductInstanceInfoType.
     * 
     * @param billingTariff
     */
    public void setBillingTariff(int billingTariff) {
        this.billingTariff = billingTariff;
    }


    /**
     * Gets the billingTariffName value for this ProductInstanceInfoType.
     * 
     * @return billingTariffName
     */
    public java.lang.String getBillingTariffName() {
        return billingTariffName;
    }


    /**
     * Sets the billingTariffName value for this ProductInstanceInfoType.
     * 
     * @param billingTariffName
     */
    public void setBillingTariffName(java.lang.String billingTariffName) {
        this.billingTariffName = billingTariffName;
    }


    /**
     * Gets the billingTariffNameThai value for this ProductInstanceInfoType.
     * 
     * @return billingTariffNameThai
     */
    public java.lang.String getBillingTariffNameThai() {
        return billingTariffNameThai;
    }


    /**
     * Sets the billingTariffNameThai value for this ProductInstanceInfoType.
     * 
     * @param billingTariffNameThai
     */
    public void setBillingTariffNameThai(java.lang.String billingTariffNameThai) {
        this.billingTariffNameThai = billingTariffNameThai;
    }


    /**
     * Gets the billingTariffDesc value for this ProductInstanceInfoType.
     * 
     * @return billingTariffDesc
     */
    public java.lang.String getBillingTariffDesc() {
        return billingTariffDesc;
    }


    /**
     * Sets the billingTariffDesc value for this ProductInstanceInfoType.
     * 
     * @param billingTariffDesc
     */
    public void setBillingTariffDesc(java.lang.String billingTariffDesc) {
        this.billingTariffDesc = billingTariffDesc;
    }


    /**
     * Gets the productStatus value for this ProductInstanceInfoType.
     * 
     * @return productStatus
     */
    public int getProductStatus() {
        return productStatus;
    }


    /**
     * Sets the productStatus value for this ProductInstanceInfoType.
     * 
     * @param productStatus
     */
    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }


    /**
     * Gets the startDate value for this ProductInstanceInfoType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ProductInstanceInfoType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ProductInstanceInfoType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ProductInstanceInfoType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the productAttributes value for this ProductInstanceInfoType.
     * 
     * @return productAttributes
     */
    public esb_rbm_account.common.ProductAttributesType getProductAttributes() {
        return productAttributes;
    }


    /**
     * Sets the productAttributes value for this ProductInstanceInfoType.
     * 
     * @param productAttributes
     */
    public void setProductAttributes(esb_rbm_account.common.ProductAttributesType productAttributes) {
        this.productAttributes = productAttributes;
    }


    /**
     * Gets the serviceAddress value for this ProductInstanceInfoType.
     * 
     * @return serviceAddress
     */
    public esb_rbm_account.common.RBMAddressType getServiceAddress() {
        return serviceAddress;
    }


    /**
     * Sets the serviceAddress value for this ProductInstanceInfoType.
     * 
     * @param serviceAddress
     */
    public void setServiceAddress(esb_rbm_account.common.RBMAddressType serviceAddress) {
        this.serviceAddress = serviceAddress;
    }


    /**
     * Gets the startLocationAddress value for this ProductInstanceInfoType.
     * 
     * @return startLocationAddress
     */
    public esb_rbm_account.common.RBMAddressType getStartLocationAddress() {
        return startLocationAddress;
    }


    /**
     * Sets the startLocationAddress value for this ProductInstanceInfoType.
     * 
     * @param startLocationAddress
     */
    public void setStartLocationAddress(esb_rbm_account.common.RBMAddressType startLocationAddress) {
        this.startLocationAddress = startLocationAddress;
    }


    /**
     * Gets the endLocationAddress value for this ProductInstanceInfoType.
     * 
     * @return endLocationAddress
     */
    public esb_rbm_account.common.RBMAddressType getEndLocationAddress() {
        return endLocationAddress;
    }


    /**
     * Sets the endLocationAddress value for this ProductInstanceInfoType.
     * 
     * @param endLocationAddress
     */
    public void setEndLocationAddress(esb_rbm_account.common.RBMAddressType endLocationAddress) {
        this.endLocationAddress = endLocationAddress;
    }


    /**
     * Gets the parentProductSeq value for this ProductInstanceInfoType.
     * 
     * @return parentProductSeq
     */
    public java.lang.Integer getParentProductSeq() {
        return parentProductSeq;
    }


    /**
     * Sets the parentProductSeq value for this ProductInstanceInfoType.
     * 
     * @param parentProductSeq
     */
    public void setParentProductSeq(java.lang.Integer parentProductSeq) {
        this.parentProductSeq = parentProductSeq;
    }


    /**
     * Gets the overridePrice value for this ProductInstanceInfoType.
     * 
     * @return overridePrice
     */
    public esb_rbm_account.common.OverridePrice[] getOverridePrice() {
        return overridePrice;
    }


    /**
     * Sets the overridePrice value for this ProductInstanceInfoType.
     * 
     * @param overridePrice
     */
    public void setOverridePrice(esb_rbm_account.common.OverridePrice[] overridePrice) {
        this.overridePrice = overridePrice;
    }

    public esb_rbm_account.common.OverridePrice getOverridePrice(int i) {
        return this.overridePrice[i];
    }

    public void setOverridePrice(int i, esb_rbm_account.common.OverridePrice _value) {
        this.overridePrice[i] = _value;
    }


    /**
     * Gets the productTariff value for this ProductInstanceInfoType.
     * 
     * @return productTariff
     */
    public esb_rbm_account.common.ProductTariff[] getProductTariff() {
        return productTariff;
    }


    /**
     * Sets the productTariff value for this ProductInstanceInfoType.
     * 
     * @param productTariff
     */
    public void setProductTariff(esb_rbm_account.common.ProductTariff[] productTariff) {
        this.productTariff = productTariff;
    }

    public esb_rbm_account.common.ProductTariff getProductTariff(int i) {
        return this.productTariff[i];
    }

    public void setProductTariff(int i, esb_rbm_account.common.ProductTariff _value) {
        this.productTariff[i] = _value;
    }


    /**
     * Gets the productQuantity value for this ProductInstanceInfoType.
     * 
     * @return productQuantity
     */
    public java.lang.Integer getProductQuantity() {
        return productQuantity;
    }


    /**
     * Sets the productQuantity value for this ProductInstanceInfoType.
     * 
     * @param productQuantity
     */
    public void setProductQuantity(java.lang.Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductInstanceInfoType)) return false;
        ProductInstanceInfoType other = (ProductInstanceInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productInstancePK==null && other.getProductInstancePK()==null) || 
             (this.productInstancePK!=null &&
              this.productInstancePK.equals(other.getProductInstancePK()))) &&
            this.productId == other.getProductId() &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            this.billingTariff == other.getBillingTariff() &&
            ((this.billingTariffName==null && other.getBillingTariffName()==null) || 
             (this.billingTariffName!=null &&
              this.billingTariffName.equals(other.getBillingTariffName()))) &&
            ((this.billingTariffNameThai==null && other.getBillingTariffNameThai()==null) || 
             (this.billingTariffNameThai!=null &&
              this.billingTariffNameThai.equals(other.getBillingTariffNameThai()))) &&
            ((this.billingTariffDesc==null && other.getBillingTariffDesc()==null) || 
             (this.billingTariffDesc!=null &&
              this.billingTariffDesc.equals(other.getBillingTariffDesc()))) &&
            this.productStatus == other.getProductStatus() &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.productAttributes==null && other.getProductAttributes()==null) || 
             (this.productAttributes!=null &&
              this.productAttributes.equals(other.getProductAttributes()))) &&
            ((this.serviceAddress==null && other.getServiceAddress()==null) || 
             (this.serviceAddress!=null &&
              this.serviceAddress.equals(other.getServiceAddress()))) &&
            ((this.startLocationAddress==null && other.getStartLocationAddress()==null) || 
             (this.startLocationAddress!=null &&
              this.startLocationAddress.equals(other.getStartLocationAddress()))) &&
            ((this.endLocationAddress==null && other.getEndLocationAddress()==null) || 
             (this.endLocationAddress!=null &&
              this.endLocationAddress.equals(other.getEndLocationAddress()))) &&
            ((this.parentProductSeq==null && other.getParentProductSeq()==null) || 
             (this.parentProductSeq!=null &&
              this.parentProductSeq.equals(other.getParentProductSeq()))) &&
            ((this.overridePrice==null && other.getOverridePrice()==null) || 
             (this.overridePrice!=null &&
              java.util.Arrays.equals(this.overridePrice, other.getOverridePrice()))) &&
            ((this.productTariff==null && other.getProductTariff()==null) || 
             (this.productTariff!=null &&
              java.util.Arrays.equals(this.productTariff, other.getProductTariff()))) &&
            ((this.productQuantity==null && other.getProductQuantity()==null) || 
             (this.productQuantity!=null &&
              this.productQuantity.equals(other.getProductQuantity())));
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
        if (getProductInstancePK() != null) {
            _hashCode += getProductInstancePK().hashCode();
        }
        _hashCode += getProductId();
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        _hashCode += getBillingTariff();
        if (getBillingTariffName() != null) {
            _hashCode += getBillingTariffName().hashCode();
        }
        if (getBillingTariffNameThai() != null) {
            _hashCode += getBillingTariffNameThai().hashCode();
        }
        if (getBillingTariffDesc() != null) {
            _hashCode += getBillingTariffDesc().hashCode();
        }
        _hashCode += getProductStatus();
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getProductAttributes() != null) {
            _hashCode += getProductAttributes().hashCode();
        }
        if (getServiceAddress() != null) {
            _hashCode += getServiceAddress().hashCode();
        }
        if (getStartLocationAddress() != null) {
            _hashCode += getStartLocationAddress().hashCode();
        }
        if (getEndLocationAddress() != null) {
            _hashCode += getEndLocationAddress().hashCode();
        }
        if (getParentProductSeq() != null) {
            _hashCode += getParentProductSeq().hashCode();
        }
        if (getOverridePrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOverridePrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOverridePrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductTariff() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductTariff());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductTariff(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductQuantity() != null) {
            _hashCode += getProductQuantity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

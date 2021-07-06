/**
 * ProductInstanceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class ProductInstanceType  implements java.io.Serializable {
    private esb_rbm_account.common.ProductInstanceTypeEventSourcesEventSource[] eventSources;

    private esb_rbm_account.common.ProductInstanceTypeEventTypesEventType[] eventTypes;

    private int productRef;

    private java.lang.String startDateTime;

    private java.lang.String endDateTime;

    /* Price Plan ID */
    private int billingTariffRef;

    private int cpsId;

    private esb_rbm_account.common.ProductInstanceTypeAddress address;

    private esb_rbm_account.common.ProductInstanceTypeOverridePriceData overridePriceData;

    private esb_rbm_account.common.ProductInstanceTypeOverrideRateData overrideRateData;

    private java.lang.String startLocation;

    private java.lang.String endLocation;

    private java.lang.String dataSpeed;

    private java.lang.String popUpUnit;

    private java.lang.String publicPhoneType;

    private java.lang.String serviceLocationCode;

    private java.lang.String sbuPayingAccountNo;

    private long productQuantity;

    private esb_rbm_account.common.SIMData[] SIM;

    private java.lang.String discBoo;

    private java.lang.String productLabel;

    public ProductInstanceType() {
    }

    public ProductInstanceType(
           esb_rbm_account.common.ProductInstanceTypeEventSourcesEventSource[] eventSources,
           esb_rbm_account.common.ProductInstanceTypeEventTypesEventType[] eventTypes,
           int productRef,
           java.lang.String startDateTime,
           java.lang.String endDateTime,
           int billingTariffRef,
           int cpsId,
           esb_rbm_account.common.ProductInstanceTypeAddress address,
           esb_rbm_account.common.ProductInstanceTypeOverridePriceData overridePriceData,
           esb_rbm_account.common.ProductInstanceTypeOverrideRateData overrideRateData,
           java.lang.String startLocation,
           java.lang.String endLocation,
           java.lang.String dataSpeed,
           java.lang.String popUpUnit,
           java.lang.String publicPhoneType,
           java.lang.String serviceLocationCode,
           java.lang.String sbuPayingAccountNo,
           long productQuantity,
           esb_rbm_account.common.SIMData[] SIM,
           java.lang.String discBoo,
           java.lang.String productLabel) {
           this.eventSources = eventSources;
           this.eventTypes = eventTypes;
           this.productRef = productRef;
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.billingTariffRef = billingTariffRef;
           this.cpsId = cpsId;
           this.address = address;
           this.overridePriceData = overridePriceData;
           this.overrideRateData = overrideRateData;
           this.startLocation = startLocation;
           this.endLocation = endLocation;
           this.dataSpeed = dataSpeed;
           this.popUpUnit = popUpUnit;
           this.publicPhoneType = publicPhoneType;
           this.serviceLocationCode = serviceLocationCode;
           this.sbuPayingAccountNo = sbuPayingAccountNo;
           this.productQuantity = productQuantity;
           this.SIM = SIM;
           this.discBoo = discBoo;
           this.productLabel = productLabel;
    }


    /**
     * Gets the eventSources value for this ProductInstanceType.
     * 
     * @return eventSources
     */
    public esb_rbm_account.common.ProductInstanceTypeEventSourcesEventSource[] getEventSources() {
        return eventSources;
    }


    /**
     * Sets the eventSources value for this ProductInstanceType.
     * 
     * @param eventSources
     */
    public void setEventSources(esb_rbm_account.common.ProductInstanceTypeEventSourcesEventSource[] eventSources) {
        this.eventSources = eventSources;
    }


    /**
     * Gets the eventTypes value for this ProductInstanceType.
     * 
     * @return eventTypes
     */
    public esb_rbm_account.common.ProductInstanceTypeEventTypesEventType[] getEventTypes() {
        return eventTypes;
    }


    /**
     * Sets the eventTypes value for this ProductInstanceType.
     * 
     * @param eventTypes
     */
    public void setEventTypes(esb_rbm_account.common.ProductInstanceTypeEventTypesEventType[] eventTypes) {
        this.eventTypes = eventTypes;
    }


    /**
     * Gets the productRef value for this ProductInstanceType.
     * 
     * @return productRef
     */
    public int getProductRef() {
        return productRef;
    }


    /**
     * Sets the productRef value for this ProductInstanceType.
     * 
     * @param productRef
     */
    public void setProductRef(int productRef) {
        this.productRef = productRef;
    }


    /**
     * Gets the startDateTime value for this ProductInstanceType.
     * 
     * @return startDateTime
     */
    public java.lang.String getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this ProductInstanceType.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(java.lang.String startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this ProductInstanceType.
     * 
     * @return endDateTime
     */
    public java.lang.String getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this ProductInstanceType.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(java.lang.String endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the billingTariffRef value for this ProductInstanceType.
     * 
     * @return billingTariffRef   * Price Plan ID
     */
    public int getBillingTariffRef() {
        return billingTariffRef;
    }


    /**
     * Sets the billingTariffRef value for this ProductInstanceType.
     * 
     * @param billingTariffRef   * Price Plan ID
     */
    public void setBillingTariffRef(int billingTariffRef) {
        this.billingTariffRef = billingTariffRef;
    }


    /**
     * Gets the cpsId value for this ProductInstanceType.
     * 
     * @return cpsId
     */
    public int getCpsId() {
        return cpsId;
    }


    /**
     * Sets the cpsId value for this ProductInstanceType.
     * 
     * @param cpsId
     */
    public void setCpsId(int cpsId) {
        this.cpsId = cpsId;
    }


    /**
     * Gets the address value for this ProductInstanceType.
     * 
     * @return address
     */
    public esb_rbm_account.common.ProductInstanceTypeAddress getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ProductInstanceType.
     * 
     * @param address
     */
    public void setAddress(esb_rbm_account.common.ProductInstanceTypeAddress address) {
        this.address = address;
    }


    /**
     * Gets the overridePriceData value for this ProductInstanceType.
     * 
     * @return overridePriceData
     */
    public esb_rbm_account.common.ProductInstanceTypeOverridePriceData getOverridePriceData() {
        return overridePriceData;
    }


    /**
     * Sets the overridePriceData value for this ProductInstanceType.
     * 
     * @param overridePriceData
     */
    public void setOverridePriceData(esb_rbm_account.common.ProductInstanceTypeOverridePriceData overridePriceData) {
        this.overridePriceData = overridePriceData;
    }


    /**
     * Gets the overrideRateData value for this ProductInstanceType.
     * 
     * @return overrideRateData
     */
    public esb_rbm_account.common.ProductInstanceTypeOverrideRateData getOverrideRateData() {
        return overrideRateData;
    }


    /**
     * Sets the overrideRateData value for this ProductInstanceType.
     * 
     * @param overrideRateData
     */
    public void setOverrideRateData(esb_rbm_account.common.ProductInstanceTypeOverrideRateData overrideRateData) {
        this.overrideRateData = overrideRateData;
    }


    /**
     * Gets the startLocation value for this ProductInstanceType.
     * 
     * @return startLocation
     */
    public java.lang.String getStartLocation() {
        return startLocation;
    }


    /**
     * Sets the startLocation value for this ProductInstanceType.
     * 
     * @param startLocation
     */
    public void setStartLocation(java.lang.String startLocation) {
        this.startLocation = startLocation;
    }


    /**
     * Gets the endLocation value for this ProductInstanceType.
     * 
     * @return endLocation
     */
    public java.lang.String getEndLocation() {
        return endLocation;
    }


    /**
     * Sets the endLocation value for this ProductInstanceType.
     * 
     * @param endLocation
     */
    public void setEndLocation(java.lang.String endLocation) {
        this.endLocation = endLocation;
    }


    /**
     * Gets the dataSpeed value for this ProductInstanceType.
     * 
     * @return dataSpeed
     */
    public java.lang.String getDataSpeed() {
        return dataSpeed;
    }


    /**
     * Sets the dataSpeed value for this ProductInstanceType.
     * 
     * @param dataSpeed
     */
    public void setDataSpeed(java.lang.String dataSpeed) {
        this.dataSpeed = dataSpeed;
    }


    /**
     * Gets the popUpUnit value for this ProductInstanceType.
     * 
     * @return popUpUnit
     */
    public java.lang.String getPopUpUnit() {
        return popUpUnit;
    }


    /**
     * Sets the popUpUnit value for this ProductInstanceType.
     * 
     * @param popUpUnit
     */
    public void setPopUpUnit(java.lang.String popUpUnit) {
        this.popUpUnit = popUpUnit;
    }


    /**
     * Gets the publicPhoneType value for this ProductInstanceType.
     * 
     * @return publicPhoneType
     */
    public java.lang.String getPublicPhoneType() {
        return publicPhoneType;
    }


    /**
     * Sets the publicPhoneType value for this ProductInstanceType.
     * 
     * @param publicPhoneType
     */
    public void setPublicPhoneType(java.lang.String publicPhoneType) {
        this.publicPhoneType = publicPhoneType;
    }


    /**
     * Gets the serviceLocationCode value for this ProductInstanceType.
     * 
     * @return serviceLocationCode
     */
    public java.lang.String getServiceLocationCode() {
        return serviceLocationCode;
    }


    /**
     * Sets the serviceLocationCode value for this ProductInstanceType.
     * 
     * @param serviceLocationCode
     */
    public void setServiceLocationCode(java.lang.String serviceLocationCode) {
        this.serviceLocationCode = serviceLocationCode;
    }


    /**
     * Gets the sbuPayingAccountNo value for this ProductInstanceType.
     * 
     * @return sbuPayingAccountNo
     */
    public java.lang.String getSbuPayingAccountNo() {
        return sbuPayingAccountNo;
    }


    /**
     * Sets the sbuPayingAccountNo value for this ProductInstanceType.
     * 
     * @param sbuPayingAccountNo
     */
    public void setSbuPayingAccountNo(java.lang.String sbuPayingAccountNo) {
        this.sbuPayingAccountNo = sbuPayingAccountNo;
    }


    /**
     * Gets the productQuantity value for this ProductInstanceType.
     * 
     * @return productQuantity
     */
    public long getProductQuantity() {
        return productQuantity;
    }


    /**
     * Sets the productQuantity value for this ProductInstanceType.
     * 
     * @param productQuantity
     */
    public void setProductQuantity(long productQuantity) {
        this.productQuantity = productQuantity;
    }


    /**
     * Gets the SIM value for this ProductInstanceType.
     * 
     * @return SIM
     */
    public esb_rbm_account.common.SIMData[] getSIM() {
        return SIM;
    }


    /**
     * Sets the SIM value for this ProductInstanceType.
     * 
     * @param SIM
     */
    public void setSIM(esb_rbm_account.common.SIMData[] SIM) {
        this.SIM = SIM;
    }

    public esb_rbm_account.common.SIMData getSIM(int i) {
        return this.SIM[i];
    }

    public void setSIM(int i, esb_rbm_account.common.SIMData _value) {
        this.SIM[i] = _value;
    }


    /**
     * Gets the discBoo value for this ProductInstanceType.
     * 
     * @return discBoo
     */
    public java.lang.String getDiscBoo() {
        return discBoo;
    }


    /**
     * Sets the discBoo value for this ProductInstanceType.
     * 
     * @param discBoo
     */
    public void setDiscBoo(java.lang.String discBoo) {
        this.discBoo = discBoo;
    }


    /**
     * Gets the productLabel value for this ProductInstanceType.
     * 
     * @return productLabel
     */
    public java.lang.String getProductLabel() {
        return productLabel;
    }


    /**
     * Sets the productLabel value for this ProductInstanceType.
     * 
     * @param productLabel
     */
    public void setProductLabel(java.lang.String productLabel) {
        this.productLabel = productLabel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductInstanceType)) return false;
        ProductInstanceType other = (ProductInstanceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eventSources==null && other.getEventSources()==null) || 
             (this.eventSources!=null &&
              java.util.Arrays.equals(this.eventSources, other.getEventSources()))) &&
            ((this.eventTypes==null && other.getEventTypes()==null) || 
             (this.eventTypes!=null &&
              java.util.Arrays.equals(this.eventTypes, other.getEventTypes()))) &&
            this.productRef == other.getProductRef() &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            this.billingTariffRef == other.getBillingTariffRef() &&
            this.cpsId == other.getCpsId() &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.overridePriceData==null && other.getOverridePriceData()==null) || 
             (this.overridePriceData!=null &&
              this.overridePriceData.equals(other.getOverridePriceData()))) &&
            ((this.overrideRateData==null && other.getOverrideRateData()==null) || 
             (this.overrideRateData!=null &&
              this.overrideRateData.equals(other.getOverrideRateData()))) &&
            ((this.startLocation==null && other.getStartLocation()==null) || 
             (this.startLocation!=null &&
              this.startLocation.equals(other.getStartLocation()))) &&
            ((this.endLocation==null && other.getEndLocation()==null) || 
             (this.endLocation!=null &&
              this.endLocation.equals(other.getEndLocation()))) &&
            ((this.dataSpeed==null && other.getDataSpeed()==null) || 
             (this.dataSpeed!=null &&
              this.dataSpeed.equals(other.getDataSpeed()))) &&
            ((this.popUpUnit==null && other.getPopUpUnit()==null) || 
             (this.popUpUnit!=null &&
              this.popUpUnit.equals(other.getPopUpUnit()))) &&
            ((this.publicPhoneType==null && other.getPublicPhoneType()==null) || 
             (this.publicPhoneType!=null &&
              this.publicPhoneType.equals(other.getPublicPhoneType()))) &&
            ((this.serviceLocationCode==null && other.getServiceLocationCode()==null) || 
             (this.serviceLocationCode!=null &&
              this.serviceLocationCode.equals(other.getServiceLocationCode()))) &&
            ((this.sbuPayingAccountNo==null && other.getSbuPayingAccountNo()==null) || 
             (this.sbuPayingAccountNo!=null &&
              this.sbuPayingAccountNo.equals(other.getSbuPayingAccountNo()))) &&
            this.productQuantity == other.getProductQuantity() &&
            ((this.SIM==null && other.getSIM()==null) || 
             (this.SIM!=null &&
              java.util.Arrays.equals(this.SIM, other.getSIM()))) &&
            ((this.discBoo==null && other.getDiscBoo()==null) || 
             (this.discBoo!=null &&
              this.discBoo.equals(other.getDiscBoo()))) &&
            ((this.productLabel==null && other.getProductLabel()==null) || 
             (this.productLabel!=null &&
              this.productLabel.equals(other.getProductLabel())));
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
        if (getEventSources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventSources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventSources(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEventTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getProductRef();
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        _hashCode += getBillingTariffRef();
        _hashCode += getCpsId();
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getOverridePriceData() != null) {
            _hashCode += getOverridePriceData().hashCode();
        }
        if (getOverrideRateData() != null) {
            _hashCode += getOverrideRateData().hashCode();
        }
        if (getStartLocation() != null) {
            _hashCode += getStartLocation().hashCode();
        }
        if (getEndLocation() != null) {
            _hashCode += getEndLocation().hashCode();
        }
        if (getDataSpeed() != null) {
            _hashCode += getDataSpeed().hashCode();
        }
        if (getPopUpUnit() != null) {
            _hashCode += getPopUpUnit().hashCode();
        }
        if (getPublicPhoneType() != null) {
            _hashCode += getPublicPhoneType().hashCode();
        }
        if (getServiceLocationCode() != null) {
            _hashCode += getServiceLocationCode().hashCode();
        }
        if (getSbuPayingAccountNo() != null) {
            _hashCode += getSbuPayingAccountNo().hashCode();
        }
        _hashCode += new Long(getProductQuantity()).hashCode();
        if (getSIM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSIM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSIM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiscBoo() != null) {
            _hashCode += getDiscBoo().hashCode();
        }
        if (getProductLabel() != null) {
            _hashCode += getProductLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

/**
 * ProductAttributesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class ProductAttributesType  implements java.io.Serializable {
    private java.lang.String startLocation;

    private java.lang.String endLocation;

    private java.lang.String dataSpeed;

    private java.lang.String popUpUnit;

    private java.lang.String publicPhoneType;

    private java.lang.String serviceLocationCode;

    private java.lang.String sbuPayingAccountNo;

    private java.lang.String previousMeterReading;

    private java.lang.String corridorPlanId;

    private esb_rbm_account.common.SIMData[] SIM;

    private java.lang.String discBoo;

    public ProductAttributesType() {
    }

    public ProductAttributesType(
           java.lang.String startLocation,
           java.lang.String endLocation,
           java.lang.String dataSpeed,
           java.lang.String popUpUnit,
           java.lang.String publicPhoneType,
           java.lang.String serviceLocationCode,
           java.lang.String sbuPayingAccountNo,
           java.lang.String previousMeterReading,
           java.lang.String corridorPlanId,
           esb_rbm_account.common.SIMData[] SIM,
           java.lang.String discBoo) {
           this.startLocation = startLocation;
           this.endLocation = endLocation;
           this.dataSpeed = dataSpeed;
           this.popUpUnit = popUpUnit;
           this.publicPhoneType = publicPhoneType;
           this.serviceLocationCode = serviceLocationCode;
           this.sbuPayingAccountNo = sbuPayingAccountNo;
           this.previousMeterReading = previousMeterReading;
           this.corridorPlanId = corridorPlanId;
           this.SIM = SIM;
           this.discBoo = discBoo;
    }


    /**
     * Gets the startLocation value for this ProductAttributesType.
     * 
     * @return startLocation
     */
    public java.lang.String getStartLocation() {
        return startLocation;
    }


    /**
     * Sets the startLocation value for this ProductAttributesType.
     * 
     * @param startLocation
     */
    public void setStartLocation(java.lang.String startLocation) {
        this.startLocation = startLocation;
    }


    /**
     * Gets the endLocation value for this ProductAttributesType.
     * 
     * @return endLocation
     */
    public java.lang.String getEndLocation() {
        return endLocation;
    }


    /**
     * Sets the endLocation value for this ProductAttributesType.
     * 
     * @param endLocation
     */
    public void setEndLocation(java.lang.String endLocation) {
        this.endLocation = endLocation;
    }


    /**
     * Gets the dataSpeed value for this ProductAttributesType.
     * 
     * @return dataSpeed
     */
    public java.lang.String getDataSpeed() {
        return dataSpeed;
    }


    /**
     * Sets the dataSpeed value for this ProductAttributesType.
     * 
     * @param dataSpeed
     */
    public void setDataSpeed(java.lang.String dataSpeed) {
        this.dataSpeed = dataSpeed;
    }


    /**
     * Gets the popUpUnit value for this ProductAttributesType.
     * 
     * @return popUpUnit
     */
    public java.lang.String getPopUpUnit() {
        return popUpUnit;
    }


    /**
     * Sets the popUpUnit value for this ProductAttributesType.
     * 
     * @param popUpUnit
     */
    public void setPopUpUnit(java.lang.String popUpUnit) {
        this.popUpUnit = popUpUnit;
    }


    /**
     * Gets the publicPhoneType value for this ProductAttributesType.
     * 
     * @return publicPhoneType
     */
    public java.lang.String getPublicPhoneType() {
        return publicPhoneType;
    }


    /**
     * Sets the publicPhoneType value for this ProductAttributesType.
     * 
     * @param publicPhoneType
     */
    public void setPublicPhoneType(java.lang.String publicPhoneType) {
        this.publicPhoneType = publicPhoneType;
    }


    /**
     * Gets the serviceLocationCode value for this ProductAttributesType.
     * 
     * @return serviceLocationCode
     */
    public java.lang.String getServiceLocationCode() {
        return serviceLocationCode;
    }


    /**
     * Sets the serviceLocationCode value for this ProductAttributesType.
     * 
     * @param serviceLocationCode
     */
    public void setServiceLocationCode(java.lang.String serviceLocationCode) {
        this.serviceLocationCode = serviceLocationCode;
    }


    /**
     * Gets the sbuPayingAccountNo value for this ProductAttributesType.
     * 
     * @return sbuPayingAccountNo
     */
    public java.lang.String getSbuPayingAccountNo() {
        return sbuPayingAccountNo;
    }


    /**
     * Sets the sbuPayingAccountNo value for this ProductAttributesType.
     * 
     * @param sbuPayingAccountNo
     */
    public void setSbuPayingAccountNo(java.lang.String sbuPayingAccountNo) {
        this.sbuPayingAccountNo = sbuPayingAccountNo;
    }


    /**
     * Gets the previousMeterReading value for this ProductAttributesType.
     * 
     * @return previousMeterReading
     */
    public java.lang.String getPreviousMeterReading() {
        return previousMeterReading;
    }


    /**
     * Sets the previousMeterReading value for this ProductAttributesType.
     * 
     * @param previousMeterReading
     */
    public void setPreviousMeterReading(java.lang.String previousMeterReading) {
        this.previousMeterReading = previousMeterReading;
    }


    /**
     * Gets the corridorPlanId value for this ProductAttributesType.
     * 
     * @return corridorPlanId
     */
    public java.lang.String getCorridorPlanId() {
        return corridorPlanId;
    }


    /**
     * Sets the corridorPlanId value for this ProductAttributesType.
     * 
     * @param corridorPlanId
     */
    public void setCorridorPlanId(java.lang.String corridorPlanId) {
        this.corridorPlanId = corridorPlanId;
    }


    /**
     * Gets the SIM value for this ProductAttributesType.
     * 
     * @return SIM
     */
    public esb_rbm_account.common.SIMData[] getSIM() {
        return SIM;
    }


    /**
     * Sets the SIM value for this ProductAttributesType.
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
     * Gets the discBoo value for this ProductAttributesType.
     * 
     * @return discBoo
     */
    public java.lang.String getDiscBoo() {
        return discBoo;
    }


    /**
     * Sets the discBoo value for this ProductAttributesType.
     * 
     * @param discBoo
     */
    public void setDiscBoo(java.lang.String discBoo) {
        this.discBoo = discBoo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductAttributesType)) return false;
        ProductAttributesType other = (ProductAttributesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
            ((this.previousMeterReading==null && other.getPreviousMeterReading()==null) || 
             (this.previousMeterReading!=null &&
              this.previousMeterReading.equals(other.getPreviousMeterReading()))) &&
            ((this.corridorPlanId==null && other.getCorridorPlanId()==null) || 
             (this.corridorPlanId!=null &&
              this.corridorPlanId.equals(other.getCorridorPlanId()))) &&
            ((this.SIM==null && other.getSIM()==null) || 
             (this.SIM!=null &&
              java.util.Arrays.equals(this.SIM, other.getSIM()))) &&
            ((this.discBoo==null && other.getDiscBoo()==null) || 
             (this.discBoo!=null &&
              this.discBoo.equals(other.getDiscBoo())));
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
        if (getPreviousMeterReading() != null) {
            _hashCode += getPreviousMeterReading().hashCode();
        }
        if (getCorridorPlanId() != null) {
            _hashCode += getCorridorPlanId().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

}

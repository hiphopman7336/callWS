/**
 * ProductInstanceTypeEventTypesEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class ProductInstanceTypeEventTypesEventType  implements java.io.Serializable {
    private int eventTypeId;

    private java.lang.String startDateTime;

    private java.lang.String endDateTime;

    private java.lang.Integer defaultRatingTariffRef;

    private java.lang.Integer itemisationOrderId;

    private java.lang.Long itemisationMny;

    public ProductInstanceTypeEventTypesEventType() {
    }

    public ProductInstanceTypeEventTypesEventType(
           int eventTypeId,
           java.lang.String startDateTime,
           java.lang.String endDateTime,
           java.lang.Integer defaultRatingTariffRef,
           java.lang.Integer itemisationOrderId,
           java.lang.Long itemisationMny) {
           this.eventTypeId = eventTypeId;
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.defaultRatingTariffRef = defaultRatingTariffRef;
           this.itemisationOrderId = itemisationOrderId;
           this.itemisationMny = itemisationMny;
    }


    /**
     * Gets the eventTypeId value for this ProductInstanceTypeEventTypesEventType.
     * 
     * @return eventTypeId
     */
    public int getEventTypeId() {
        return eventTypeId;
    }


    /**
     * Sets the eventTypeId value for this ProductInstanceTypeEventTypesEventType.
     * 
     * @param eventTypeId
     */
    public void setEventTypeId(int eventTypeId) {
        this.eventTypeId = eventTypeId;
    }


    /**
     * Gets the startDateTime value for this ProductInstanceTypeEventTypesEventType.
     * 
     * @return startDateTime
     */
    public java.lang.String getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this ProductInstanceTypeEventTypesEventType.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(java.lang.String startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this ProductInstanceTypeEventTypesEventType.
     * 
     * @return endDateTime
     */
    public java.lang.String getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this ProductInstanceTypeEventTypesEventType.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(java.lang.String endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the defaultRatingTariffRef value for this ProductInstanceTypeEventTypesEventType.
     * 
     * @return defaultRatingTariffRef
     */
    public java.lang.Integer getDefaultRatingTariffRef() {
        return defaultRatingTariffRef;
    }


    /**
     * Sets the defaultRatingTariffRef value for this ProductInstanceTypeEventTypesEventType.
     * 
     * @param defaultRatingTariffRef
     */
    public void setDefaultRatingTariffRef(java.lang.Integer defaultRatingTariffRef) {
        this.defaultRatingTariffRef = defaultRatingTariffRef;
    }


    /**
     * Gets the itemisationOrderId value for this ProductInstanceTypeEventTypesEventType.
     * 
     * @return itemisationOrderId
     */
    public java.lang.Integer getItemisationOrderId() {
        return itemisationOrderId;
    }


    /**
     * Sets the itemisationOrderId value for this ProductInstanceTypeEventTypesEventType.
     * 
     * @param itemisationOrderId
     */
    public void setItemisationOrderId(java.lang.Integer itemisationOrderId) {
        this.itemisationOrderId = itemisationOrderId;
    }


    /**
     * Gets the itemisationMny value for this ProductInstanceTypeEventTypesEventType.
     * 
     * @return itemisationMny
     */
    public java.lang.Long getItemisationMny() {
        return itemisationMny;
    }


    /**
     * Sets the itemisationMny value for this ProductInstanceTypeEventTypesEventType.
     * 
     * @param itemisationMny
     */
    public void setItemisationMny(java.lang.Long itemisationMny) {
        this.itemisationMny = itemisationMny;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductInstanceTypeEventTypesEventType)) return false;
        ProductInstanceTypeEventTypesEventType other = (ProductInstanceTypeEventTypesEventType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.eventTypeId == other.getEventTypeId() &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.defaultRatingTariffRef==null && other.getDefaultRatingTariffRef()==null) || 
             (this.defaultRatingTariffRef!=null &&
              this.defaultRatingTariffRef.equals(other.getDefaultRatingTariffRef()))) &&
            ((this.itemisationOrderId==null && other.getItemisationOrderId()==null) || 
             (this.itemisationOrderId!=null &&
              this.itemisationOrderId.equals(other.getItemisationOrderId()))) &&
            ((this.itemisationMny==null && other.getItemisationMny()==null) || 
             (this.itemisationMny!=null &&
              this.itemisationMny.equals(other.getItemisationMny())));
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
        _hashCode += getEventTypeId();
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getDefaultRatingTariffRef() != null) {
            _hashCode += getDefaultRatingTariffRef().hashCode();
        }
        if (getItemisationOrderId() != null) {
            _hashCode += getItemisationOrderId().hashCode();
        }
        if (getItemisationMny() != null) {
            _hashCode += getItemisationMny().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

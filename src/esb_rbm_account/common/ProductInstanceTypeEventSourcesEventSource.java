/**
 * ProductInstanceTypeEventSourcesEventSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class ProductInstanceTypeEventSourcesEventSource  implements java.io.Serializable {
    private java.lang.String eventSource;

    private int eventTypeId;

    private java.lang.String startDateTime;

    private java.lang.String endDateTime;

    private java.lang.String eventSourceLabel;

    private int ratingTariffRef;

    private java.lang.String labelOnBill;

    public ProductInstanceTypeEventSourcesEventSource() {
    }

    public ProductInstanceTypeEventSourcesEventSource(
           java.lang.String eventSource,
           int eventTypeId,
           java.lang.String startDateTime,
           java.lang.String endDateTime,
           java.lang.String eventSourceLabel,
           int ratingTariffRef,
           java.lang.String labelOnBill) {
           this.eventSource = eventSource;
           this.eventTypeId = eventTypeId;
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.eventSourceLabel = eventSourceLabel;
           this.ratingTariffRef = ratingTariffRef;
           this.labelOnBill = labelOnBill;
    }


    /**
     * Gets the eventSource value for this ProductInstanceTypeEventSourcesEventSource.
     * 
     * @return eventSource
     */
    public java.lang.String getEventSource() {
        return eventSource;
    }


    /**
     * Sets the eventSource value for this ProductInstanceTypeEventSourcesEventSource.
     * 
     * @param eventSource
     */
    public void setEventSource(java.lang.String eventSource) {
        this.eventSource = eventSource;
    }


    /**
     * Gets the eventTypeId value for this ProductInstanceTypeEventSourcesEventSource.
     * 
     * @return eventTypeId
     */
    public int getEventTypeId() {
        return eventTypeId;
    }


    /**
     * Sets the eventTypeId value for this ProductInstanceTypeEventSourcesEventSource.
     * 
     * @param eventTypeId
     */
    public void setEventTypeId(int eventTypeId) {
        this.eventTypeId = eventTypeId;
    }


    /**
     * Gets the startDateTime value for this ProductInstanceTypeEventSourcesEventSource.
     * 
     * @return startDateTime
     */
    public java.lang.String getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this ProductInstanceTypeEventSourcesEventSource.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(java.lang.String startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this ProductInstanceTypeEventSourcesEventSource.
     * 
     * @return endDateTime
     */
    public java.lang.String getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this ProductInstanceTypeEventSourcesEventSource.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(java.lang.String endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the eventSourceLabel value for this ProductInstanceTypeEventSourcesEventSource.
     * 
     * @return eventSourceLabel
     */
    public java.lang.String getEventSourceLabel() {
        return eventSourceLabel;
    }


    /**
     * Sets the eventSourceLabel value for this ProductInstanceTypeEventSourcesEventSource.
     * 
     * @param eventSourceLabel
     */
    public void setEventSourceLabel(java.lang.String eventSourceLabel) {
        this.eventSourceLabel = eventSourceLabel;
    }


    /**
     * Gets the ratingTariffRef value for this ProductInstanceTypeEventSourcesEventSource.
     * 
     * @return ratingTariffRef
     */
    public int getRatingTariffRef() {
        return ratingTariffRef;
    }


    /**
     * Sets the ratingTariffRef value for this ProductInstanceTypeEventSourcesEventSource.
     * 
     * @param ratingTariffRef
     */
    public void setRatingTariffRef(int ratingTariffRef) {
        this.ratingTariffRef = ratingTariffRef;
    }


    /**
     * Gets the labelOnBill value for this ProductInstanceTypeEventSourcesEventSource.
     * 
     * @return labelOnBill
     */
    public java.lang.String getLabelOnBill() {
        return labelOnBill;
    }


    /**
     * Sets the labelOnBill value for this ProductInstanceTypeEventSourcesEventSource.
     * 
     * @param labelOnBill
     */
    public void setLabelOnBill(java.lang.String labelOnBill) {
        this.labelOnBill = labelOnBill;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductInstanceTypeEventSourcesEventSource)) return false;
        ProductInstanceTypeEventSourcesEventSource other = (ProductInstanceTypeEventSourcesEventSource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eventSource==null && other.getEventSource()==null) || 
             (this.eventSource!=null &&
              this.eventSource.equals(other.getEventSource()))) &&
            this.eventTypeId == other.getEventTypeId() &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.eventSourceLabel==null && other.getEventSourceLabel()==null) || 
             (this.eventSourceLabel!=null &&
              this.eventSourceLabel.equals(other.getEventSourceLabel()))) &&
            this.ratingTariffRef == other.getRatingTariffRef() &&
            ((this.labelOnBill==null && other.getLabelOnBill()==null) || 
             (this.labelOnBill!=null &&
              this.labelOnBill.equals(other.getLabelOnBill())));
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
        if (getEventSource() != null) {
            _hashCode += getEventSource().hashCode();
        }
        _hashCode += getEventTypeId();
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getEventSourceLabel() != null) {
            _hashCode += getEventSourceLabel().hashCode();
        }
        _hashCode += getRatingTariffRef();
        if (getLabelOnBill() != null) {
            _hashCode += getLabelOnBill().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

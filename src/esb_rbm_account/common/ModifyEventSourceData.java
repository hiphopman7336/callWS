/**
 * ModifyEventSourceData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class ModifyEventSourceData  implements java.io.Serializable {
    private java.lang.String eventSource;

    private int eventTypeId;

    private java.lang.String startDtm;

    private java.lang.String endDtm;

    private java.lang.Integer ratingTariffId;

    private java.lang.String eventSourceLabel;

    private java.lang.Boolean copyGuidingRules;

    public ModifyEventSourceData() {
    }

    public ModifyEventSourceData(
           java.lang.String eventSource,
           int eventTypeId,
           java.lang.String startDtm,
           java.lang.String endDtm,
           java.lang.Integer ratingTariffId,
           java.lang.String eventSourceLabel,
           java.lang.Boolean copyGuidingRules) {
           this.eventSource = eventSource;
           this.eventTypeId = eventTypeId;
           this.startDtm = startDtm;
           this.endDtm = endDtm;
           this.ratingTariffId = ratingTariffId;
           this.eventSourceLabel = eventSourceLabel;
           this.copyGuidingRules = copyGuidingRules;
    }


    /**
     * Gets the eventSource value for this ModifyEventSourceData.
     * 
     * @return eventSource
     */
    public java.lang.String getEventSource() {
        return eventSource;
    }


    /**
     * Sets the eventSource value for this ModifyEventSourceData.
     * 
     * @param eventSource
     */
    public void setEventSource(java.lang.String eventSource) {
        this.eventSource = eventSource;
    }


    /**
     * Gets the eventTypeId value for this ModifyEventSourceData.
     * 
     * @return eventTypeId
     */
    public int getEventTypeId() {
        return eventTypeId;
    }


    /**
     * Sets the eventTypeId value for this ModifyEventSourceData.
     * 
     * @param eventTypeId
     */
    public void setEventTypeId(int eventTypeId) {
        this.eventTypeId = eventTypeId;
    }


    /**
     * Gets the startDtm value for this ModifyEventSourceData.
     * 
     * @return startDtm
     */
    public java.lang.String getStartDtm() {
        return startDtm;
    }


    /**
     * Sets the startDtm value for this ModifyEventSourceData.
     * 
     * @param startDtm
     */
    public void setStartDtm(java.lang.String startDtm) {
        this.startDtm = startDtm;
    }


    /**
     * Gets the endDtm value for this ModifyEventSourceData.
     * 
     * @return endDtm
     */
    public java.lang.String getEndDtm() {
        return endDtm;
    }


    /**
     * Sets the endDtm value for this ModifyEventSourceData.
     * 
     * @param endDtm
     */
    public void setEndDtm(java.lang.String endDtm) {
        this.endDtm = endDtm;
    }


    /**
     * Gets the ratingTariffId value for this ModifyEventSourceData.
     * 
     * @return ratingTariffId
     */
    public java.lang.Integer getRatingTariffId() {
        return ratingTariffId;
    }


    /**
     * Sets the ratingTariffId value for this ModifyEventSourceData.
     * 
     * @param ratingTariffId
     */
    public void setRatingTariffId(java.lang.Integer ratingTariffId) {
        this.ratingTariffId = ratingTariffId;
    }


    /**
     * Gets the eventSourceLabel value for this ModifyEventSourceData.
     * 
     * @return eventSourceLabel
     */
    public java.lang.String getEventSourceLabel() {
        return eventSourceLabel;
    }


    /**
     * Sets the eventSourceLabel value for this ModifyEventSourceData.
     * 
     * @param eventSourceLabel
     */
    public void setEventSourceLabel(java.lang.String eventSourceLabel) {
        this.eventSourceLabel = eventSourceLabel;
    }


    /**
     * Gets the copyGuidingRules value for this ModifyEventSourceData.
     * 
     * @return copyGuidingRules
     */
    public java.lang.Boolean getCopyGuidingRules() {
        return copyGuidingRules;
    }


    /**
     * Sets the copyGuidingRules value for this ModifyEventSourceData.
     * 
     * @param copyGuidingRules
     */
    public void setCopyGuidingRules(java.lang.Boolean copyGuidingRules) {
        this.copyGuidingRules = copyGuidingRules;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyEventSourceData)) return false;
        ModifyEventSourceData other = (ModifyEventSourceData) obj;
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
            ((this.startDtm==null && other.getStartDtm()==null) || 
             (this.startDtm!=null &&
              this.startDtm.equals(other.getStartDtm()))) &&
            ((this.endDtm==null && other.getEndDtm()==null) || 
             (this.endDtm!=null &&
              this.endDtm.equals(other.getEndDtm()))) &&
            ((this.ratingTariffId==null && other.getRatingTariffId()==null) || 
             (this.ratingTariffId!=null &&
              this.ratingTariffId.equals(other.getRatingTariffId()))) &&
            ((this.eventSourceLabel==null && other.getEventSourceLabel()==null) || 
             (this.eventSourceLabel!=null &&
              this.eventSourceLabel.equals(other.getEventSourceLabel()))) &&
            ((this.copyGuidingRules==null && other.getCopyGuidingRules()==null) || 
             (this.copyGuidingRules!=null &&
              this.copyGuidingRules.equals(other.getCopyGuidingRules())));
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
        if (getStartDtm() != null) {
            _hashCode += getStartDtm().hashCode();
        }
        if (getEndDtm() != null) {
            _hashCode += getEndDtm().hashCode();
        }
        if (getRatingTariffId() != null) {
            _hashCode += getRatingTariffId().hashCode();
        }
        if (getEventSourceLabel() != null) {
            _hashCode += getEventSourceLabel().hashCode();
        }
        if (getCopyGuidingRules() != null) {
            _hashCode += getCopyGuidingRules().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

/**
 * HistoriedAccountStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class HistoriedAccountStatus  implements java.io.Serializable {
    private java.lang.String startDtm;

    private int accountStatus;

    private java.lang.String statusReasonTxt;

    public HistoriedAccountStatus() {
    }

    public HistoriedAccountStatus(
           java.lang.String startDtm,
           int accountStatus,
           java.lang.String statusReasonTxt) {
           this.startDtm = startDtm;
           this.accountStatus = accountStatus;
           this.statusReasonTxt = statusReasonTxt;
    }


    /**
     * Gets the startDtm value for this HistoriedAccountStatus.
     * 
     * @return startDtm
     */
    public java.lang.String getStartDtm() {
        return startDtm;
    }


    /**
     * Sets the startDtm value for this HistoriedAccountStatus.
     * 
     * @param startDtm
     */
    public void setStartDtm(java.lang.String startDtm) {
        this.startDtm = startDtm;
    }


    /**
     * Gets the accountStatus value for this HistoriedAccountStatus.
     * 
     * @return accountStatus
     */
    public int getAccountStatus() {
        return accountStatus;
    }


    /**
     * Sets the accountStatus value for this HistoriedAccountStatus.
     * 
     * @param accountStatus
     */
    public void setAccountStatus(int accountStatus) {
        this.accountStatus = accountStatus;
    }


    /**
     * Gets the statusReasonTxt value for this HistoriedAccountStatus.
     * 
     * @return statusReasonTxt
     */
    public java.lang.String getStatusReasonTxt() {
        return statusReasonTxt;
    }


    /**
     * Sets the statusReasonTxt value for this HistoriedAccountStatus.
     * 
     * @param statusReasonTxt
     */
    public void setStatusReasonTxt(java.lang.String statusReasonTxt) {
        this.statusReasonTxt = statusReasonTxt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HistoriedAccountStatus)) return false;
        HistoriedAccountStatus other = (HistoriedAccountStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startDtm==null && other.getStartDtm()==null) || 
             (this.startDtm!=null &&
              this.startDtm.equals(other.getStartDtm()))) &&
            this.accountStatus == other.getAccountStatus() &&
            ((this.statusReasonTxt==null && other.getStatusReasonTxt()==null) || 
             (this.statusReasonTxt!=null &&
              this.statusReasonTxt.equals(other.getStatusReasonTxt())));
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
        if (getStartDtm() != null) {
            _hashCode += getStartDtm().hashCode();
        }
        _hashCode += getAccountStatus();
        if (getStatusReasonTxt() != null) {
            _hashCode += getStatusReasonTxt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

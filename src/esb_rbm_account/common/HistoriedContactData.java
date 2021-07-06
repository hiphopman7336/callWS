/**
 * HistoriedContactData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class HistoriedContactData  implements java.io.Serializable {
    private java.lang.String daytimeContactTel;

    private java.lang.String daytimeExtension;

    private java.lang.String eveningContactTel;

    private java.lang.String eveningExtension;

    private java.lang.String mobileContactTel;

    private java.lang.String faxContactTel;

    private java.lang.String emailAddress;

    private java.lang.String ediAddress;

    private java.lang.String startDat;

    private java.lang.String endDat;

    private esb_rbm_account.common.AddressPKType addressPK;

    private java.lang.String position;

    private java.lang.String department;

    private int countryId;

    private java.lang.String zipCode;

    private java.lang.String[] addressLine;

    public HistoriedContactData() {
    }

    public HistoriedContactData(
           java.lang.String daytimeContactTel,
           java.lang.String daytimeExtension,
           java.lang.String eveningContactTel,
           java.lang.String eveningExtension,
           java.lang.String mobileContactTel,
           java.lang.String faxContactTel,
           java.lang.String emailAddress,
           java.lang.String ediAddress,
           java.lang.String startDat,
           java.lang.String endDat,
           esb_rbm_account.common.AddressPKType addressPK,
           java.lang.String position,
           java.lang.String department,
           int countryId,
           java.lang.String zipCode,
           java.lang.String[] addressLine) {
           this.daytimeContactTel = daytimeContactTel;
           this.daytimeExtension = daytimeExtension;
           this.eveningContactTel = eveningContactTel;
           this.eveningExtension = eveningExtension;
           this.mobileContactTel = mobileContactTel;
           this.faxContactTel = faxContactTel;
           this.emailAddress = emailAddress;
           this.ediAddress = ediAddress;
           this.startDat = startDat;
           this.endDat = endDat;
           this.addressPK = addressPK;
           this.position = position;
           this.department = department;
           this.countryId = countryId;
           this.zipCode = zipCode;
           this.addressLine = addressLine;
    }


    /**
     * Gets the daytimeContactTel value for this HistoriedContactData.
     * 
     * @return daytimeContactTel
     */
    public java.lang.String getDaytimeContactTel() {
        return daytimeContactTel;
    }


    /**
     * Sets the daytimeContactTel value for this HistoriedContactData.
     * 
     * @param daytimeContactTel
     */
    public void setDaytimeContactTel(java.lang.String daytimeContactTel) {
        this.daytimeContactTel = daytimeContactTel;
    }


    /**
     * Gets the daytimeExtension value for this HistoriedContactData.
     * 
     * @return daytimeExtension
     */
    public java.lang.String getDaytimeExtension() {
        return daytimeExtension;
    }


    /**
     * Sets the daytimeExtension value for this HistoriedContactData.
     * 
     * @param daytimeExtension
     */
    public void setDaytimeExtension(java.lang.String daytimeExtension) {
        this.daytimeExtension = daytimeExtension;
    }


    /**
     * Gets the eveningContactTel value for this HistoriedContactData.
     * 
     * @return eveningContactTel
     */
    public java.lang.String getEveningContactTel() {
        return eveningContactTel;
    }


    /**
     * Sets the eveningContactTel value for this HistoriedContactData.
     * 
     * @param eveningContactTel
     */
    public void setEveningContactTel(java.lang.String eveningContactTel) {
        this.eveningContactTel = eveningContactTel;
    }


    /**
     * Gets the eveningExtension value for this HistoriedContactData.
     * 
     * @return eveningExtension
     */
    public java.lang.String getEveningExtension() {
        return eveningExtension;
    }


    /**
     * Sets the eveningExtension value for this HistoriedContactData.
     * 
     * @param eveningExtension
     */
    public void setEveningExtension(java.lang.String eveningExtension) {
        this.eveningExtension = eveningExtension;
    }


    /**
     * Gets the mobileContactTel value for this HistoriedContactData.
     * 
     * @return mobileContactTel
     */
    public java.lang.String getMobileContactTel() {
        return mobileContactTel;
    }


    /**
     * Sets the mobileContactTel value for this HistoriedContactData.
     * 
     * @param mobileContactTel
     */
    public void setMobileContactTel(java.lang.String mobileContactTel) {
        this.mobileContactTel = mobileContactTel;
    }


    /**
     * Gets the faxContactTel value for this HistoriedContactData.
     * 
     * @return faxContactTel
     */
    public java.lang.String getFaxContactTel() {
        return faxContactTel;
    }


    /**
     * Sets the faxContactTel value for this HistoriedContactData.
     * 
     * @param faxContactTel
     */
    public void setFaxContactTel(java.lang.String faxContactTel) {
        this.faxContactTel = faxContactTel;
    }


    /**
     * Gets the emailAddress value for this HistoriedContactData.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this HistoriedContactData.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the ediAddress value for this HistoriedContactData.
     * 
     * @return ediAddress
     */
    public java.lang.String getEdiAddress() {
        return ediAddress;
    }


    /**
     * Sets the ediAddress value for this HistoriedContactData.
     * 
     * @param ediAddress
     */
    public void setEdiAddress(java.lang.String ediAddress) {
        this.ediAddress = ediAddress;
    }


    /**
     * Gets the startDat value for this HistoriedContactData.
     * 
     * @return startDat
     */
    public java.lang.String getStartDat() {
        return startDat;
    }


    /**
     * Sets the startDat value for this HistoriedContactData.
     * 
     * @param startDat
     */
    public void setStartDat(java.lang.String startDat) {
        this.startDat = startDat;
    }


    /**
     * Gets the endDat value for this HistoriedContactData.
     * 
     * @return endDat
     */
    public java.lang.String getEndDat() {
        return endDat;
    }


    /**
     * Sets the endDat value for this HistoriedContactData.
     * 
     * @param endDat
     */
    public void setEndDat(java.lang.String endDat) {
        this.endDat = endDat;
    }


    /**
     * Gets the addressPK value for this HistoriedContactData.
     * 
     * @return addressPK
     */
    public esb_rbm_account.common.AddressPKType getAddressPK() {
        return addressPK;
    }


    /**
     * Sets the addressPK value for this HistoriedContactData.
     * 
     * @param addressPK
     */
    public void setAddressPK(esb_rbm_account.common.AddressPKType addressPK) {
        this.addressPK = addressPK;
    }


    /**
     * Gets the position value for this HistoriedContactData.
     * 
     * @return position
     */
    public java.lang.String getPosition() {
        return position;
    }


    /**
     * Sets the position value for this HistoriedContactData.
     * 
     * @param position
     */
    public void setPosition(java.lang.String position) {
        this.position = position;
    }


    /**
     * Gets the department value for this HistoriedContactData.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this HistoriedContactData.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the countryId value for this HistoriedContactData.
     * 
     * @return countryId
     */
    public int getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this HistoriedContactData.
     * 
     * @param countryId
     */
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the zipCode value for this HistoriedContactData.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this HistoriedContactData.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the addressLine value for this HistoriedContactData.
     * 
     * @return addressLine
     */
    public java.lang.String[] getAddressLine() {
        return addressLine;
    }


    /**
     * Sets the addressLine value for this HistoriedContactData.
     * 
     * @param addressLine
     */
    public void setAddressLine(java.lang.String[] addressLine) {
        this.addressLine = addressLine;
    }

    public java.lang.String getAddressLine(int i) {
        return this.addressLine[i];
    }

    public void setAddressLine(int i, java.lang.String _value) {
        this.addressLine[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HistoriedContactData)) return false;
        HistoriedContactData other = (HistoriedContactData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.daytimeContactTel==null && other.getDaytimeContactTel()==null) || 
             (this.daytimeContactTel!=null &&
              this.daytimeContactTel.equals(other.getDaytimeContactTel()))) &&
            ((this.daytimeExtension==null && other.getDaytimeExtension()==null) || 
             (this.daytimeExtension!=null &&
              this.daytimeExtension.equals(other.getDaytimeExtension()))) &&
            ((this.eveningContactTel==null && other.getEveningContactTel()==null) || 
             (this.eveningContactTel!=null &&
              this.eveningContactTel.equals(other.getEveningContactTel()))) &&
            ((this.eveningExtension==null && other.getEveningExtension()==null) || 
             (this.eveningExtension!=null &&
              this.eveningExtension.equals(other.getEveningExtension()))) &&
            ((this.mobileContactTel==null && other.getMobileContactTel()==null) || 
             (this.mobileContactTel!=null &&
              this.mobileContactTel.equals(other.getMobileContactTel()))) &&
            ((this.faxContactTel==null && other.getFaxContactTel()==null) || 
             (this.faxContactTel!=null &&
              this.faxContactTel.equals(other.getFaxContactTel()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.ediAddress==null && other.getEdiAddress()==null) || 
             (this.ediAddress!=null &&
              this.ediAddress.equals(other.getEdiAddress()))) &&
            ((this.startDat==null && other.getStartDat()==null) || 
             (this.startDat!=null &&
              this.startDat.equals(other.getStartDat()))) &&
            ((this.endDat==null && other.getEndDat()==null) || 
             (this.endDat!=null &&
              this.endDat.equals(other.getEndDat()))) &&
            ((this.addressPK==null && other.getAddressPK()==null) || 
             (this.addressPK!=null &&
              this.addressPK.equals(other.getAddressPK()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            this.countryId == other.getCountryId() &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.addressLine==null && other.getAddressLine()==null) || 
             (this.addressLine!=null &&
              java.util.Arrays.equals(this.addressLine, other.getAddressLine())));
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
        if (getDaytimeContactTel() != null) {
            _hashCode += getDaytimeContactTel().hashCode();
        }
        if (getDaytimeExtension() != null) {
            _hashCode += getDaytimeExtension().hashCode();
        }
        if (getEveningContactTel() != null) {
            _hashCode += getEveningContactTel().hashCode();
        }
        if (getEveningExtension() != null) {
            _hashCode += getEveningExtension().hashCode();
        }
        if (getMobileContactTel() != null) {
            _hashCode += getMobileContactTel().hashCode();
        }
        if (getFaxContactTel() != null) {
            _hashCode += getFaxContactTel().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getEdiAddress() != null) {
            _hashCode += getEdiAddress().hashCode();
        }
        if (getStartDat() != null) {
            _hashCode += getStartDat().hashCode();
        }
        if (getEndDat() != null) {
            _hashCode += getEndDat().hashCode();
        }
        if (getAddressPK() != null) {
            _hashCode += getAddressPK().hashCode();
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        _hashCode += getCountryId();
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getAddressLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

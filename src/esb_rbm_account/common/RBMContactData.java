/**
 * RBMContactData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class RBMContactData  implements java.io.Serializable {
    private java.lang.String addressName;

    private int languageId;

    private java.lang.String contactNotesTxt;

    private esb_rbm_account.common.HistoriedContactData historiedContactData;

    private java.lang.String title;

    private java.lang.String firstName;

    private java.lang.String initials;

    private java.lang.String lastName;

    private java.lang.String namePostFix;

    private java.lang.String salutationName;

    private java.lang.String customerRef;

    private int contactSeq;

    public RBMContactData() {
    }

    public RBMContactData(
           java.lang.String addressName,
           int languageId,
           java.lang.String contactNotesTxt,
           esb_rbm_account.common.HistoriedContactData historiedContactData,
           java.lang.String title,
           java.lang.String firstName,
           java.lang.String initials,
           java.lang.String lastName,
           java.lang.String namePostFix,
           java.lang.String salutationName,
           java.lang.String customerRef,
           int contactSeq) {
           this.addressName = addressName;
           this.languageId = languageId;
           this.contactNotesTxt = contactNotesTxt;
           this.historiedContactData = historiedContactData;
           this.title = title;
           this.firstName = firstName;
           this.initials = initials;
           this.lastName = lastName;
           this.namePostFix = namePostFix;
           this.salutationName = salutationName;
           this.customerRef = customerRef;
           this.contactSeq = contactSeq;
    }


    /**
     * Gets the addressName value for this RBMContactData.
     * 
     * @return addressName
     */
    public java.lang.String getAddressName() {
        return addressName;
    }


    /**
     * Sets the addressName value for this RBMContactData.
     * 
     * @param addressName
     */
    public void setAddressName(java.lang.String addressName) {
        this.addressName = addressName;
    }


    /**
     * Gets the languageId value for this RBMContactData.
     * 
     * @return languageId
     */
    public int getLanguageId() {
        return languageId;
    }


    /**
     * Sets the languageId value for this RBMContactData.
     * 
     * @param languageId
     */
    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }


    /**
     * Gets the contactNotesTxt value for this RBMContactData.
     * 
     * @return contactNotesTxt
     */
    public java.lang.String getContactNotesTxt() {
        return contactNotesTxt;
    }


    /**
     * Sets the contactNotesTxt value for this RBMContactData.
     * 
     * @param contactNotesTxt
     */
    public void setContactNotesTxt(java.lang.String contactNotesTxt) {
        this.contactNotesTxt = contactNotesTxt;
    }


    /**
     * Gets the historiedContactData value for this RBMContactData.
     * 
     * @return historiedContactData
     */
    public esb_rbm_account.common.HistoriedContactData getHistoriedContactData() {
        return historiedContactData;
    }


    /**
     * Sets the historiedContactData value for this RBMContactData.
     * 
     * @param historiedContactData
     */
    public void setHistoriedContactData(esb_rbm_account.common.HistoriedContactData historiedContactData) {
        this.historiedContactData = historiedContactData;
    }


    /**
     * Gets the title value for this RBMContactData.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this RBMContactData.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the firstName value for this RBMContactData.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this RBMContactData.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the initials value for this RBMContactData.
     * 
     * @return initials
     */
    public java.lang.String getInitials() {
        return initials;
    }


    /**
     * Sets the initials value for this RBMContactData.
     * 
     * @param initials
     */
    public void setInitials(java.lang.String initials) {
        this.initials = initials;
    }


    /**
     * Gets the lastName value for this RBMContactData.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this RBMContactData.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the namePostFix value for this RBMContactData.
     * 
     * @return namePostFix
     */
    public java.lang.String getNamePostFix() {
        return namePostFix;
    }


    /**
     * Sets the namePostFix value for this RBMContactData.
     * 
     * @param namePostFix
     */
    public void setNamePostFix(java.lang.String namePostFix) {
        this.namePostFix = namePostFix;
    }


    /**
     * Gets the salutationName value for this RBMContactData.
     * 
     * @return salutationName
     */
    public java.lang.String getSalutationName() {
        return salutationName;
    }


    /**
     * Sets the salutationName value for this RBMContactData.
     * 
     * @param salutationName
     */
    public void setSalutationName(java.lang.String salutationName) {
        this.salutationName = salutationName;
    }


    /**
     * Gets the customerRef value for this RBMContactData.
     * 
     * @return customerRef
     */
    public java.lang.String getCustomerRef() {
        return customerRef;
    }


    /**
     * Sets the customerRef value for this RBMContactData.
     * 
     * @param customerRef
     */
    public void setCustomerRef(java.lang.String customerRef) {
        this.customerRef = customerRef;
    }


    /**
     * Gets the contactSeq value for this RBMContactData.
     * 
     * @return contactSeq
     */
    public int getContactSeq() {
        return contactSeq;
    }


    /**
     * Sets the contactSeq value for this RBMContactData.
     * 
     * @param contactSeq
     */
    public void setContactSeq(int contactSeq) {
        this.contactSeq = contactSeq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RBMContactData)) return false;
        RBMContactData other = (RBMContactData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressName==null && other.getAddressName()==null) || 
             (this.addressName!=null &&
              this.addressName.equals(other.getAddressName()))) &&
            this.languageId == other.getLanguageId() &&
            ((this.contactNotesTxt==null && other.getContactNotesTxt()==null) || 
             (this.contactNotesTxt!=null &&
              this.contactNotesTxt.equals(other.getContactNotesTxt()))) &&
            ((this.historiedContactData==null && other.getHistoriedContactData()==null) || 
             (this.historiedContactData!=null &&
              this.historiedContactData.equals(other.getHistoriedContactData()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.initials==null && other.getInitials()==null) || 
             (this.initials!=null &&
              this.initials.equals(other.getInitials()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.namePostFix==null && other.getNamePostFix()==null) || 
             (this.namePostFix!=null &&
              this.namePostFix.equals(other.getNamePostFix()))) &&
            ((this.salutationName==null && other.getSalutationName()==null) || 
             (this.salutationName!=null &&
              this.salutationName.equals(other.getSalutationName()))) &&
            ((this.customerRef==null && other.getCustomerRef()==null) || 
             (this.customerRef!=null &&
              this.customerRef.equals(other.getCustomerRef()))) &&
            this.contactSeq == other.getContactSeq();
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
        if (getAddressName() != null) {
            _hashCode += getAddressName().hashCode();
        }
        _hashCode += getLanguageId();
        if (getContactNotesTxt() != null) {
            _hashCode += getContactNotesTxt().hashCode();
        }
        if (getHistoriedContactData() != null) {
            _hashCode += getHistoriedContactData().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getInitials() != null) {
            _hashCode += getInitials().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getNamePostFix() != null) {
            _hashCode += getNamePostFix().hashCode();
        }
        if (getSalutationName() != null) {
            _hashCode += getSalutationName().hashCode();
        }
        if (getCustomerRef() != null) {
            _hashCode += getCustomerRef().hashCode();
        }
        _hashCode += getContactSeq();
        __hashCodeCalc = false;
        return _hashCode;
    }

}

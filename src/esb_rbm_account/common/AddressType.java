/**
 * AddressType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class AddressType  implements java.io.Serializable {
    private java.lang.String homeNo;

    private int countryId;

    private java.lang.String code;

    private java.lang.String serialNo;

    private java.lang.String buidingVilage;

    private java.lang.String moo;

    private java.lang.String soi;

    private java.lang.String road;

    private java.lang.String subDistrictName;

    private java.lang.String districtName;

    private java.lang.String provinceName;

    private java.lang.String zipCode;

    private java.lang.String countryName;

    private java.lang.String addressDetail;

    private boolean assignHolidayProfileBoo;

    private boolean createDepositBalanceBoo;

    private java.lang.String[] addressLines;

    public AddressType() {
    }

    public AddressType(
           java.lang.String homeNo,
           int countryId,
           java.lang.String code,
           java.lang.String serialNo,
           java.lang.String buidingVilage,
           java.lang.String moo,
           java.lang.String soi,
           java.lang.String road,
           java.lang.String subDistrictName,
           java.lang.String districtName,
           java.lang.String provinceName,
           java.lang.String zipCode,
           java.lang.String countryName,
           java.lang.String addressDetail,
           boolean assignHolidayProfileBoo,
           boolean createDepositBalanceBoo,
           java.lang.String[] addressLines) {
           this.homeNo = homeNo;
           this.countryId = countryId;
           this.code = code;
           this.serialNo = serialNo;
           this.buidingVilage = buidingVilage;
           this.moo = moo;
           this.soi = soi;
           this.road = road;
           this.subDistrictName = subDistrictName;
           this.districtName = districtName;
           this.provinceName = provinceName;
           this.zipCode = zipCode;
           this.countryName = countryName;
           this.addressDetail = addressDetail;
           this.assignHolidayProfileBoo = assignHolidayProfileBoo;
           this.createDepositBalanceBoo = createDepositBalanceBoo;
           this.addressLines = addressLines;
    }


    /**
     * Gets the homeNo value for this AddressType.
     * 
     * @return homeNo
     */
    public java.lang.String getHomeNo() {
        return homeNo;
    }


    /**
     * Sets the homeNo value for this AddressType.
     * 
     * @param homeNo
     */
    public void setHomeNo(java.lang.String homeNo) {
        this.homeNo = homeNo;
    }


    /**
     * Gets the countryId value for this AddressType.
     * 
     * @return countryId
     */
    public int getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this AddressType.
     * 
     * @param countryId
     */
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the code value for this AddressType.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this AddressType.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the serialNo value for this AddressType.
     * 
     * @return serialNo
     */
    public java.lang.String getSerialNo() {
        return serialNo;
    }


    /**
     * Sets the serialNo value for this AddressType.
     * 
     * @param serialNo
     */
    public void setSerialNo(java.lang.String serialNo) {
        this.serialNo = serialNo;
    }


    /**
     * Gets the buidingVilage value for this AddressType.
     * 
     * @return buidingVilage
     */
    public java.lang.String getBuidingVilage() {
        return buidingVilage;
    }


    /**
     * Sets the buidingVilage value for this AddressType.
     * 
     * @param buidingVilage
     */
    public void setBuidingVilage(java.lang.String buidingVilage) {
        this.buidingVilage = buidingVilage;
    }


    /**
     * Gets the moo value for this AddressType.
     * 
     * @return moo
     */
    public java.lang.String getMoo() {
        return moo;
    }


    /**
     * Sets the moo value for this AddressType.
     * 
     * @param moo
     */
    public void setMoo(java.lang.String moo) {
        this.moo = moo;
    }


    /**
     * Gets the soi value for this AddressType.
     * 
     * @return soi
     */
    public java.lang.String getSoi() {
        return soi;
    }


    /**
     * Sets the soi value for this AddressType.
     * 
     * @param soi
     */
    public void setSoi(java.lang.String soi) {
        this.soi = soi;
    }


    /**
     * Gets the road value for this AddressType.
     * 
     * @return road
     */
    public java.lang.String getRoad() {
        return road;
    }


    /**
     * Sets the road value for this AddressType.
     * 
     * @param road
     */
    public void setRoad(java.lang.String road) {
        this.road = road;
    }


    /**
     * Gets the subDistrictName value for this AddressType.
     * 
     * @return subDistrictName
     */
    public java.lang.String getSubDistrictName() {
        return subDistrictName;
    }


    /**
     * Sets the subDistrictName value for this AddressType.
     * 
     * @param subDistrictName
     */
    public void setSubDistrictName(java.lang.String subDistrictName) {
        this.subDistrictName = subDistrictName;
    }


    /**
     * Gets the districtName value for this AddressType.
     * 
     * @return districtName
     */
    public java.lang.String getDistrictName() {
        return districtName;
    }


    /**
     * Sets the districtName value for this AddressType.
     * 
     * @param districtName
     */
    public void setDistrictName(java.lang.String districtName) {
        this.districtName = districtName;
    }


    /**
     * Gets the provinceName value for this AddressType.
     * 
     * @return provinceName
     */
    public java.lang.String getProvinceName() {
        return provinceName;
    }


    /**
     * Sets the provinceName value for this AddressType.
     * 
     * @param provinceName
     */
    public void setProvinceName(java.lang.String provinceName) {
        this.provinceName = provinceName;
    }


    /**
     * Gets the zipCode value for this AddressType.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this AddressType.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the countryName value for this AddressType.
     * 
     * @return countryName
     */
    public java.lang.String getCountryName() {
        return countryName;
    }


    /**
     * Sets the countryName value for this AddressType.
     * 
     * @param countryName
     */
    public void setCountryName(java.lang.String countryName) {
        this.countryName = countryName;
    }


    /**
     * Gets the addressDetail value for this AddressType.
     * 
     * @return addressDetail
     */
    public java.lang.String getAddressDetail() {
        return addressDetail;
    }


    /**
     * Sets the addressDetail value for this AddressType.
     * 
     * @param addressDetail
     */
    public void setAddressDetail(java.lang.String addressDetail) {
        this.addressDetail = addressDetail;
    }


    /**
     * Gets the assignHolidayProfileBoo value for this AddressType.
     * 
     * @return assignHolidayProfileBoo
     */
    public boolean isAssignHolidayProfileBoo() {
        return assignHolidayProfileBoo;
    }


    /**
     * Sets the assignHolidayProfileBoo value for this AddressType.
     * 
     * @param assignHolidayProfileBoo
     */
    public void setAssignHolidayProfileBoo(boolean assignHolidayProfileBoo) {
        this.assignHolidayProfileBoo = assignHolidayProfileBoo;
    }


    /**
     * Gets the createDepositBalanceBoo value for this AddressType.
     * 
     * @return createDepositBalanceBoo
     */
    public boolean isCreateDepositBalanceBoo() {
        return createDepositBalanceBoo;
    }


    /**
     * Sets the createDepositBalanceBoo value for this AddressType.
     * 
     * @param createDepositBalanceBoo
     */
    public void setCreateDepositBalanceBoo(boolean createDepositBalanceBoo) {
        this.createDepositBalanceBoo = createDepositBalanceBoo;
    }


    /**
     * Gets the addressLines value for this AddressType.
     * 
     * @return addressLines
     */
    public java.lang.String[] getAddressLines() {
        return addressLines;
    }


    /**
     * Sets the addressLines value for this AddressType.
     * 
     * @param addressLines
     */
    public void setAddressLines(java.lang.String[] addressLines) {
        this.addressLines = addressLines;
    }

    public java.lang.String getAddressLines(int i) {
        return this.addressLines[i];
    }

    public void setAddressLines(int i, java.lang.String _value) {
        this.addressLines[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressType)) return false;
        AddressType other = (AddressType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.homeNo==null && other.getHomeNo()==null) || 
             (this.homeNo!=null &&
              this.homeNo.equals(other.getHomeNo()))) &&
            this.countryId == other.getCountryId() &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.serialNo==null && other.getSerialNo()==null) || 
             (this.serialNo!=null &&
              this.serialNo.equals(other.getSerialNo()))) &&
            ((this.buidingVilage==null && other.getBuidingVilage()==null) || 
             (this.buidingVilage!=null &&
              this.buidingVilage.equals(other.getBuidingVilage()))) &&
            ((this.moo==null && other.getMoo()==null) || 
             (this.moo!=null &&
              this.moo.equals(other.getMoo()))) &&
            ((this.soi==null && other.getSoi()==null) || 
             (this.soi!=null &&
              this.soi.equals(other.getSoi()))) &&
            ((this.road==null && other.getRoad()==null) || 
             (this.road!=null &&
              this.road.equals(other.getRoad()))) &&
            ((this.subDistrictName==null && other.getSubDistrictName()==null) || 
             (this.subDistrictName!=null &&
              this.subDistrictName.equals(other.getSubDistrictName()))) &&
            ((this.districtName==null && other.getDistrictName()==null) || 
             (this.districtName!=null &&
              this.districtName.equals(other.getDistrictName()))) &&
            ((this.provinceName==null && other.getProvinceName()==null) || 
             (this.provinceName!=null &&
              this.provinceName.equals(other.getProvinceName()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.countryName==null && other.getCountryName()==null) || 
             (this.countryName!=null &&
              this.countryName.equals(other.getCountryName()))) &&
            ((this.addressDetail==null && other.getAddressDetail()==null) || 
             (this.addressDetail!=null &&
              this.addressDetail.equals(other.getAddressDetail()))) &&
            this.assignHolidayProfileBoo == other.isAssignHolidayProfileBoo() &&
            this.createDepositBalanceBoo == other.isCreateDepositBalanceBoo() &&
            ((this.addressLines==null && other.getAddressLines()==null) || 
             (this.addressLines!=null &&
              java.util.Arrays.equals(this.addressLines, other.getAddressLines())));
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
        if (getHomeNo() != null) {
            _hashCode += getHomeNo().hashCode();
        }
        _hashCode += getCountryId();
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getSerialNo() != null) {
            _hashCode += getSerialNo().hashCode();
        }
        if (getBuidingVilage() != null) {
            _hashCode += getBuidingVilage().hashCode();
        }
        if (getMoo() != null) {
            _hashCode += getMoo().hashCode();
        }
        if (getSoi() != null) {
            _hashCode += getSoi().hashCode();
        }
        if (getRoad() != null) {
            _hashCode += getRoad().hashCode();
        }
        if (getSubDistrictName() != null) {
            _hashCode += getSubDistrictName().hashCode();
        }
        if (getDistrictName() != null) {
            _hashCode += getDistrictName().hashCode();
        }
        if (getProvinceName() != null) {
            _hashCode += getProvinceName().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getCountryName() != null) {
            _hashCode += getCountryName().hashCode();
        }
        if (getAddressDetail() != null) {
            _hashCode += getAddressDetail().hashCode();
        }
        _hashCode += (isAssignHolidayProfileBoo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCreateDepositBalanceBoo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAddressLines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressLines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressLines(), i);
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

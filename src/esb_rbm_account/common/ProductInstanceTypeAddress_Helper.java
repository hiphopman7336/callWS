/**
 * ProductInstanceTypeAddress_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.common;

public class ProductInstanceTypeAddress_Helper {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductInstanceTypeAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", ">ProductInstanceType>address"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "addressPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "AddressPKType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "AddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RBMAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "RBMAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://totbilling.tot.co.th/esb/rbm/common", "RBMAddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

/**
 * ModifyAccountCPSResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class ModifyAccountCPSResponseBody  implements java.io.Serializable {
    private esb_rbm_account.xsd.ModifyAccountCPSResponseBodyReturn _return;

    public ModifyAccountCPSResponseBody() {
    }

    public ModifyAccountCPSResponseBody(
           esb_rbm_account.xsd.ModifyAccountCPSResponseBodyReturn _return) {
           this._return = _return;
    }


    /**
     * Gets the _return value for this ModifyAccountCPSResponseBody.
     * 
     * @return _return
     */
    public esb_rbm_account.xsd.ModifyAccountCPSResponseBodyReturn get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this ModifyAccountCPSResponseBody.
     * 
     * @param _return
     */
    public void set_return(esb_rbm_account.xsd.ModifyAccountCPSResponseBodyReturn _return) {
        this._return = _return;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyAccountCPSResponseBody)) return false;
        ModifyAccountCPSResponseBody other = (ModifyAccountCPSResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._return==null && other.get_return()==null) || 
             (this._return!=null &&
              this._return.equals(other.get_return())));
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
        if (get_return() != null) {
            _hashCode += get_return().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}

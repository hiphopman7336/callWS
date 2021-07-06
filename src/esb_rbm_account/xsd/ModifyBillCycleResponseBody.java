/**
 * ModifyBillCycleResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class ModifyBillCycleResponseBody  implements java.io.Serializable {
    private esb_rbm_account.xsd.ModifyBillCycleResponseBodyReturn _return;

    public ModifyBillCycleResponseBody() {
    }

    public ModifyBillCycleResponseBody(
           esb_rbm_account.xsd.ModifyBillCycleResponseBodyReturn _return) {
           this._return = _return;
    }


    /**
     * Gets the _return value for this ModifyBillCycleResponseBody.
     * 
     * @return _return
     */
    public esb_rbm_account.xsd.ModifyBillCycleResponseBodyReturn get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this ModifyBillCycleResponseBody.
     * 
     * @param _return
     */
    public void set_return(esb_rbm_account.xsd.ModifyBillCycleResponseBodyReturn _return) {
        this._return = _return;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyBillCycleResponseBody)) return false;
        ModifyBillCycleResponseBody other = (ModifyBillCycleResponseBody) obj;
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

/**
 * ReadAccountUnbilledDataResponseBodyReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package esb_rbm_account.xsd;

public class ReadAccountUnbilledDataResponseBodyReturn  implements java.io.Serializable {
    private long unbilledEventMny;

    private int unbilledEventCount;

    public ReadAccountUnbilledDataResponseBodyReturn() {
    }

    public ReadAccountUnbilledDataResponseBodyReturn(
           long unbilledEventMny,
           int unbilledEventCount) {
           this.unbilledEventMny = unbilledEventMny;
           this.unbilledEventCount = unbilledEventCount;
    }


    /**
     * Gets the unbilledEventMny value for this ReadAccountUnbilledDataResponseBodyReturn.
     * 
     * @return unbilledEventMny
     */
    public long getUnbilledEventMny() {
        return unbilledEventMny;
    }


    /**
     * Sets the unbilledEventMny value for this ReadAccountUnbilledDataResponseBodyReturn.
     * 
     * @param unbilledEventMny
     */
    public void setUnbilledEventMny(long unbilledEventMny) {
        this.unbilledEventMny = unbilledEventMny;
    }


    /**
     * Gets the unbilledEventCount value for this ReadAccountUnbilledDataResponseBodyReturn.
     * 
     * @return unbilledEventCount
     */
    public int getUnbilledEventCount() {
        return unbilledEventCount;
    }


    /**
     * Sets the unbilledEventCount value for this ReadAccountUnbilledDataResponseBodyReturn.
     * 
     * @param unbilledEventCount
     */
    public void setUnbilledEventCount(int unbilledEventCount) {
        this.unbilledEventCount = unbilledEventCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadAccountUnbilledDataResponseBodyReturn)) return false;
        ReadAccountUnbilledDataResponseBodyReturn other = (ReadAccountUnbilledDataResponseBodyReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.unbilledEventMny == other.getUnbilledEventMny() &&
            this.unbilledEventCount == other.getUnbilledEventCount();
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
        _hashCode += new Long(getUnbilledEventMny()).hashCode();
        _hashCode += getUnbilledEventCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

}

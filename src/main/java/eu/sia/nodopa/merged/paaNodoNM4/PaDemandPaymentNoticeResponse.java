
package eu.sia.nodopa.merged.paaNodoNM4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paDemandPaymentNoticeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paDemandPaymentNoticeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://pagopa-api.pagopa.gov.it/pa/paForNode.xsd}ctResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="qrCode" type="{http://pagopa-api.pagopa.gov.it/pa/paForNode.xsd}ctQrCode" minOccurs="0"/&gt;
 *         &lt;element name="paymentList" type="{http://pagopa-api.pagopa.gov.it/pa/paForNode.xsd}ctPaymentOptionsDescriptionListPA" minOccurs="0"/&gt;
 *         &lt;element name="paymentDescription" type="{http://pagopa-api.pagopa.gov.it/pa/paForNode.xsd}stText140" minOccurs="0"/&gt;
 *         &lt;element name="fiscalCodePA" type="{http://pagopa-api.pagopa.gov.it/pa/paForNode.xsd}stFiscalCodePA" minOccurs="0"/&gt;
 *         &lt;element name="companyName" type="{http://pagopa-api.pagopa.gov.it/pa/paForNode.xsd}stText140" minOccurs="0"/&gt;
 *         &lt;element name="officeName" type="{http://pagopa-api.pagopa.gov.it/pa/paForNode.xsd}stText140" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paDemandPaymentNoticeResponse", propOrder = {
    "qrCode",
    "paymentList",
    "paymentDescription",
    "fiscalCodePA",
    "companyName",
    "officeName"
})
public class PaDemandPaymentNoticeResponse
    extends CtResponse
{

    protected CtQrCode qrCode;
    protected CtPaymentOptionsDescriptionListPA paymentList;
    protected String paymentDescription;
    protected String fiscalCodePA;
    protected String companyName;
    protected String officeName;

    /**
     * Gets the value of the qrCode property.
     * 
     * @return
     *     possible object is
     *     {@link CtQrCode }
     *     
     */
    public CtQrCode getQrCode() {
        return qrCode;
    }

    /**
     * Sets the value of the qrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtQrCode }
     *     
     */
    public void setQrCode(CtQrCode value) {
        this.qrCode = value;
    }

    /**
     * Gets the value of the paymentList property.
     * 
     * @return
     *     possible object is
     *     {@link CtPaymentOptionsDescriptionListPA }
     *     
     */
    public CtPaymentOptionsDescriptionListPA getPaymentList() {
        return paymentList;
    }

    /**
     * Sets the value of the paymentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtPaymentOptionsDescriptionListPA }
     *     
     */
    public void setPaymentList(CtPaymentOptionsDescriptionListPA value) {
        this.paymentList = value;
    }

    /**
     * Gets the value of the paymentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDescription() {
        return paymentDescription;
    }

    /**
     * Sets the value of the paymentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDescription(String value) {
        this.paymentDescription = value;
    }

    /**
     * Gets the value of the fiscalCodePA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalCodePA() {
        return fiscalCodePA;
    }

    /**
     * Sets the value of the fiscalCodePA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalCodePA(String value) {
        this.fiscalCodePA = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the officeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeName() {
        return officeName;
    }

    /**
     * Sets the value of the officeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeName(String value) {
        this.officeName = value;
    }

}

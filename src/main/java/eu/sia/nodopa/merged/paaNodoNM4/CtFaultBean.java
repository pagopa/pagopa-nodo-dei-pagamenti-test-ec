
package eu.sia.nodopa.merged.paaNodoNM4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * - 'id' : Subject issuing the error.
 * Allowed values \u200b\u200bare : 
 *   - 'NodoDeiPagamentiSPC' : constant which identifies the NodoSPC
 *   - '[domain identifier]' : domain id of the creditor entity issuing the fault
 *   - '[PSP identifier]' : PSP identifier issuing the fault
 * 
 * - 'faultCode' : error code (see 'stFaultCode' to details)
 * 
 * - 'faultString' : Specification of the error code, specific to the subject issuing it. Contains a more talking description relating to the 'faultCode'.
 * 
 * - 'description' : Additional description of the error set by the NodoSPC, by the creditor or PSP.
 * 
 * - 'serial' : Position of the element in the referenced list. Useful when providing a parameter in the form of a vector (for example, in the primitive 'SendCarrelloRPT' node).
 * If the error is generated by the EC or by the PSP, the data reported is the value of the 'faultBean.serial' data set by the EC or by the PSP.
 * 
 * - 'originalFaultCode' : Error code generated by the counterpart. (_Set only it isn't generated by NodoSPC._)
 * 
 * - 'originalFaultString' : Specification of the error code generated by the counterpart. (_Set only it isn't generated by NodoSPC._)
 * 
 * - 'originalDescription' : Additional description of the error generated by the counterparty. (_Set only it isn't generated by NodoSPC._)
 *       
 * 
 * <p>Java class for ctFaultBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctFaultBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="faultCode" type="{http://pagopa-api.pagopa.gov.it/pa/paForNode.xsd}stFaultCode"/&gt;
 *         &lt;element name="faultString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="originalFaultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originalFaultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originalDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctFaultBean", propOrder = {
    "faultCode",
    "faultString",
    "id",
    "description",
    "serial",
    "originalFaultCode",
    "originalFaultString",
    "originalDescription"
})
public class CtFaultBean {

    @XmlElement(required = true)
    protected String faultCode;
    @XmlElement(required = true)
    protected String faultString;
    @XmlElement(required = true)
    protected String id;
    protected String description;
    protected Integer serial;
    protected String originalFaultCode;
    protected String originalFaultString;
    protected String originalDescription;

    /**
     * Gets the value of the faultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultCode() {
        return faultCode;
    }

    /**
     * Sets the value of the faultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultCode(String value) {
        this.faultCode = value;
    }

    /**
     * Gets the value of the faultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultString() {
        return faultString;
    }

    /**
     * Sets the value of the faultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultString(String value) {
        this.faultString = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the serial property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSerial() {
        return serial;
    }

    /**
     * Sets the value of the serial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSerial(Integer value) {
        this.serial = value;
    }

    /**
     * Gets the value of the originalFaultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalFaultCode() {
        return originalFaultCode;
    }

    /**
     * Sets the value of the originalFaultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalFaultCode(String value) {
        this.originalFaultCode = value;
    }

    /**
     * Gets the value of the originalFaultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalFaultString() {
        return originalFaultString;
    }

    /**
     * Sets the value of the originalFaultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalFaultString(String value) {
        this.originalFaultString = value;
    }

    /**
     * Gets the value of the originalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalDescription() {
        return originalDescription;
    }

    /**
     * Sets the value of the originalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalDescription(String value) {
        this.originalDescription = value;
    }

}

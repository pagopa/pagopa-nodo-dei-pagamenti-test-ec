
package merged.pagopa.pagopa_api.pa.pafornode;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ctTransferPAReceiptV2 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ctTransferPAReceiptV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idTransfer" type="{http://pagopa-api.pagopa.gov.it/pa/paForNode.xsd}stIdTransfer"/&gt;
 *         &lt;element name="transferAmount" type="{http://pagopa-api.pagopa.gov.it/pa/paForNode.xsd}stAmountNotZero"/&gt;
 *         &lt;element name="fiscalCodePA" type="{http://pagopa-api.pagopa.gov.it/xsd/common-types/v1.0.0/}stFiscalCodePA"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="IBAN" type="{http://pagopa-api.pagopa.gov.it/pa/paForNode.xsd}stIBAN"/&gt;
 *           &lt;element name="MBDAttachment" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="remittanceInformation" type="{http://pagopa-api.pagopa.gov.it/xsd/common-types/v1.0.0/}stText140"/&gt;
 *         &lt;element name="transferCategory" type="{http://pagopa-api.pagopa.gov.it/xsd/common-types/v1.0.0/}stText140"/&gt;
 *         &lt;element name="metadata" type="{http://pagopa-api.pagopa.gov.it/xsd/common-types/v1.0.0/}ctMetadata" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctTransferPAReceiptV2", propOrder = {
    "idTransfer",
    "transferAmount",
    "fiscalCodePA",
    "companyName",
    "iban",
    "mbdAttachment",
    "remittanceInformation",
    "transferCategory",
    "metadata"
})
public class CtTransferPAReceiptV2 {

    protected int idTransfer;
    @XmlElement(required = true)
    protected BigDecimal transferAmount;
    @XmlElement(required = true)
    protected String fiscalCodePA;
    protected String companyName;
    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "MBDAttachment")
    protected byte[] mbdAttachment;
    @XmlElement(required = true)
    protected String remittanceInformation;
    @XmlElement(required = true)
    protected String transferCategory;
    protected CtMetadata metadata;

    /**
     * Recupera il valore della proprieta idTransfer.
     * 
     */
    public int getIdTransfer() {
        return idTransfer;
    }

    /**
     * Imposta il valore della proprieta idTransfer.
     * 
     */
    public void setIdTransfer(int value) {
        this.idTransfer = value;
    }

    /**
     * Recupera il valore della proprieta transferAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransferAmount() {
        return transferAmount;
    }

    /**
     * Imposta il valore della proprieta transferAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransferAmount(BigDecimal value) {
        this.transferAmount = value;
    }

    /**
     * Recupera il valore della proprieta fiscalCodePA.
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
     * Imposta il valore della proprieta fiscalCodePA.
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
     * Recupera il valore della proprieta iban.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Imposta il valore della proprieta iban.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Recupera il valore della proprieta mbdAttachment.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMBDAttachment() {
        return mbdAttachment;
    }

    /**
     * Imposta il valore della proprieta mbdAttachment.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMBDAttachment(byte[] value) {
        this.mbdAttachment = value;
    }

    /**
     * Recupera il valore della proprieta remittanceInformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemittanceInformation() {
        return remittanceInformation;
    }

    /**
     * Imposta il valore della proprieta remittanceInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemittanceInformation(String value) {
        this.remittanceInformation = value;
    }

    /**
     * Recupera il valore della proprieta transferCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferCategory() {
        return transferCategory;
    }

    /**
     * Imposta il valore della proprieta transferCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferCategory(String value) {
        this.transferCategory = value;
    }

    /**
     * Recupera il valore della proprieta metadata.
     * 
     * @return
     *     possible object is
     *     {@link CtMetadata }
     *     
     */
    public CtMetadata getMetadata() {
        return metadata;
    }

    /**
     * Imposta il valore della proprieta metadata.
     * 
     * @param value
     *     allowed object is
     *     {@link CtMetadata }
     *     
     */
    public void setMetadata(CtMetadata value) {
        this.metadata = value;
    }

}


package eu.sia.nodopa.merged.paaNodoNM4;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctDatiPagamentoPA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctDatiPagamentoPA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="importoSingoloVersamento" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/}stImporto"/&gt;
 *         &lt;element name="ibanAccredito" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/}stIBANIdentifier"/&gt;
 *         &lt;element name="bicAccredito" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/}stBICIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="enteBeneficiario" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/}ctEnteBeneficiario" minOccurs="0"/&gt;
 *         &lt;element name="credenzialiPagatore" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/}stText35" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="causaleVersamento" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/}stText140"/&gt;
 *           &lt;element name="spezzoniCausaleVersamento" type="{http://ws.pagamenti.telematici.gov/}ctSpezzoniCausaleVersamento"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctDatiPagamentoPA", namespace = "http://ws.pagamenti.telematici.gov/", propOrder = {
    "importoSingoloVersamento",
    "ibanAccredito",
    "bicAccredito",
    "enteBeneficiario",
    "credenzialiPagatore",
    "causaleVersamento",
    "spezzoniCausaleVersamento"
})
public class CtDatiPagamentoPA {

    @XmlElement(required = true)
    protected BigDecimal importoSingoloVersamento;
    @XmlElement(required = true)
    protected String ibanAccredito;
    protected String bicAccredito;
    protected CtEnteBeneficiario enteBeneficiario;
    protected String credenzialiPagatore;
    protected String causaleVersamento;
    protected CtSpezzoniCausaleVersamento spezzoniCausaleVersamento;

    /**
     * Gets the value of the importoSingoloVersamento property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoSingoloVersamento() {
        return importoSingoloVersamento;
    }

    /**
     * Sets the value of the importoSingoloVersamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoSingoloVersamento(BigDecimal value) {
        this.importoSingoloVersamento = value;
    }

    /**
     * Gets the value of the ibanAccredito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbanAccredito() {
        return ibanAccredito;
    }

    /**
     * Sets the value of the ibanAccredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbanAccredito(String value) {
        this.ibanAccredito = value;
    }

    /**
     * Gets the value of the bicAccredito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBicAccredito() {
        return bicAccredito;
    }

    /**
     * Sets the value of the bicAccredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBicAccredito(String value) {
        this.bicAccredito = value;
    }

    /**
     * Gets the value of the enteBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link CtEnteBeneficiario }
     *     
     */
    public CtEnteBeneficiario getEnteBeneficiario() {
        return enteBeneficiario;
    }

    /**
     * Sets the value of the enteBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtEnteBeneficiario }
     *     
     */
    public void setEnteBeneficiario(CtEnteBeneficiario value) {
        this.enteBeneficiario = value;
    }

    /**
     * Gets the value of the credenzialiPagatore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredenzialiPagatore() {
        return credenzialiPagatore;
    }

    /**
     * Sets the value of the credenzialiPagatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredenzialiPagatore(String value) {
        this.credenzialiPagatore = value;
    }

    /**
     * Gets the value of the causaleVersamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausaleVersamento() {
        return causaleVersamento;
    }

    /**
     * Sets the value of the causaleVersamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausaleVersamento(String value) {
        this.causaleVersamento = value;
    }

    /**
     * Gets the value of the spezzoniCausaleVersamento property.
     * 
     * @return
     *     possible object is
     *     {@link CtSpezzoniCausaleVersamento }
     *     
     */
    public CtSpezzoniCausaleVersamento getSpezzoniCausaleVersamento() {
        return spezzoniCausaleVersamento;
    }

    /**
     * Sets the value of the spezzoniCausaleVersamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSpezzoniCausaleVersamento }
     *     
     */
    public void setSpezzoniCausaleVersamento(CtSpezzoniCausaleVersamento value) {
        this.spezzoniCausaleVersamento = value;
    }

}

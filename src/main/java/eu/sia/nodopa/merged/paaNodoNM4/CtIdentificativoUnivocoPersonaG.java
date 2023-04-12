
package eu.sia.nodopa.merged.paaNodoNM4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctIdentificativoUnivocoPersonaG complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctIdentificativoUnivocoPersonaG"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoIdentificativoUnivoco" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/}stTipoIdentificativoUnivocoPersG"/&gt;
 *         &lt;element name="codiceIdentificativoUnivoco" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/}stCodiceIdentificativoUnivoco"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctIdentificativoUnivocoPersonaG", namespace = "http://www.digitpa.gov.it/schemas/2011/Pagamenti/", propOrder = {
    "tipoIdentificativoUnivoco",
    "codiceIdentificativoUnivoco"
})
public class CtIdentificativoUnivocoPersonaG {

    @XmlElement(namespace = "http://www.digitpa.gov.it/schemas/2011/Pagamenti/", required = true)
    @XmlSchemaType(name = "string")
    protected StTipoIdentificativoUnivocoPersG tipoIdentificativoUnivoco;
    @XmlElement(namespace = "http://www.digitpa.gov.it/schemas/2011/Pagamenti/", required = true)
    protected String codiceIdentificativoUnivoco;

    /**
     * Gets the value of the tipoIdentificativoUnivoco property.
     * 
     * @return
     *     possible object is
     *     {@link StTipoIdentificativoUnivocoPersG }
     *     
     */
    public StTipoIdentificativoUnivocoPersG getTipoIdentificativoUnivoco() {
        return tipoIdentificativoUnivoco;
    }

    /**
     * Sets the value of the tipoIdentificativoUnivoco property.
     * 
     * @param value
     *     allowed object is
     *     {@link StTipoIdentificativoUnivocoPersG }
     *     
     */
    public void setTipoIdentificativoUnivoco(StTipoIdentificativoUnivocoPersG value) {
        this.tipoIdentificativoUnivoco = value;
    }

    /**
     * Gets the value of the codiceIdentificativoUnivoco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceIdentificativoUnivoco() {
        return codiceIdentificativoUnivoco;
    }

    /**
     * Sets the value of the codiceIdentificativoUnivoco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceIdentificativoUnivoco(String value) {
        this.codiceIdentificativoUnivoco = value;
    }

}


package eu.sia.nodopa.merged.paaNodoNM4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctSpezzoniCausaleVersamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctSpezzoniCausaleVersamento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="6"&gt;
 *         &lt;choice&gt;
 *           &lt;element name="spezzoneCausaleVersamento" type="{http://www.digitpa.gov.it/schemas/2011/Pagamenti/}stText35"/&gt;
 *           &lt;element name="spezzoneStrutturatoCausaleVersamento" type="{http://ws.pagamenti.telematici.gov/}ctSpezzoneStrutturatoCausaleVersamento"/&gt;
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
@XmlType(name = "ctSpezzoniCausaleVersamento", namespace = "http://ws.pagamenti.telematici.gov/", propOrder = {
    "spezzoneCausaleVersamentoOrSpezzoneStrutturatoCausaleVersamento"
})
public class CtSpezzoniCausaleVersamento {

    @XmlElements({
        @XmlElement(name = "spezzoneCausaleVersamento", type = String.class),
        @XmlElement(name = "spezzoneStrutturatoCausaleVersamento", type = CtSpezzoneStrutturatoCausaleVersamento.class)
    })
    protected List<Object> spezzoneCausaleVersamentoOrSpezzoneStrutturatoCausaleVersamento;

    /**
     * Gets the value of the spezzoneCausaleVersamentoOrSpezzoneStrutturatoCausaleVersamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spezzoneCausaleVersamentoOrSpezzoneStrutturatoCausaleVersamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpezzoneCausaleVersamentoOrSpezzoneStrutturatoCausaleVersamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtSpezzoneStrutturatoCausaleVersamento }
     * {@link String }
     * 
     * 
     */
    public List<Object> getSpezzoneCausaleVersamentoOrSpezzoneStrutturatoCausaleVersamento() {
        if (spezzoneCausaleVersamentoOrSpezzoneStrutturatoCausaleVersamento == null) {
            spezzoneCausaleVersamentoOrSpezzoneStrutturatoCausaleVersamento = new ArrayList<Object>();
        }
        return this.spezzoneCausaleVersamentoOrSpezzoneStrutturatoCausaleVersamento;
    }

}

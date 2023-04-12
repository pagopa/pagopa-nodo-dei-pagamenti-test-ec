
package merged.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per esitoAttivaRPT complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="esitoAttivaRPT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.pagamenti.telematici.gov/}risposta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="esito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datiPagamentoPA" type="{http://ws.pagamenti.telematici.gov/}paaTipoDatiPagamentoPA" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esitoAttivaRPT", propOrder = {
    "esito",
    "datiPagamentoPA"
})
public class EsitoAttivaRPT
    extends Risposta
{

    protected String esito;
    protected PaaTipoDatiPagamentoPA datiPagamentoPA;

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsito(String value) {
        this.esito = value;
    }

    /**
     * Recupera il valore della proprietà datiPagamentoPA.
     * 
     * @return
     *     possible object is
     *     {@link PaaTipoDatiPagamentoPA }
     *     
     */
    public PaaTipoDatiPagamentoPA getDatiPagamentoPA() {
        return datiPagamentoPA;
    }

    /**
     * Imposta il valore della proprietà datiPagamentoPA.
     * 
     * @param value
     *     allowed object is
     *     {@link PaaTipoDatiPagamentoPA }
     *     
     */
    public void setDatiPagamentoPA(PaaTipoDatiPagamentoPA value) {
        this.datiPagamentoPA = value;
    }

}

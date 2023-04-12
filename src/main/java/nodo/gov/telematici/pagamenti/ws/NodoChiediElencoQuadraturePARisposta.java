
package nodo.gov.telematici.pagamenti.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nodoChiediElencoQuadraturePARisposta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nodoChiediElencoQuadraturePARisposta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.pagamenti.telematici.gov/}risposta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaQuadrature" type="{http://ws.pagamenti.telematici.gov/}tipoListaQuadrature" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nodoChiediElencoQuadraturePARisposta", propOrder = {
    "listaQuadrature"
})
public class NodoChiediElencoQuadraturePARisposta
    extends Risposta
{

    protected TipoListaQuadrature listaQuadrature;

    /**
     * Gets the value of the listaQuadrature property.
     * 
     * @return
     *     possible object is
     *     {@link TipoListaQuadrature }
     *     
     */
    public TipoListaQuadrature getListaQuadrature() {
        return listaQuadrature;
    }

    /**
     * Sets the value of the listaQuadrature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoListaQuadrature }
     *     
     */
    public void setListaQuadrature(TipoListaQuadrature value) {
        this.listaQuadrature = value;
    }

}

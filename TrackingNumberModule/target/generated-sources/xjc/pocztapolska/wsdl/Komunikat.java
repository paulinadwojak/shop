//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.31 at 01:46:06 PM CEST 
//


package pocztapolska.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Komunikat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Komunikat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="przesylki" type="{http://ws.sledzenie.pocztapolska.pl/xsd}ListaPrzesylek" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Komunikat", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", propOrder = {
    "przesylki",
    "status"
})
public class Komunikat {

    @XmlElementRef(name = "przesylki", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ListaPrzesylek> przesylki;
    protected Integer status;

    /**
     * Gets the value of the przesylki property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListaPrzesylek }{@code >}
     *     
     */
    public JAXBElement<ListaPrzesylek> getPrzesylki() {
        return przesylki;
    }

    /**
     * Sets the value of the przesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListaPrzesylek }{@code >}
     *     
     */
    public void setPrzesylki(JAXBElement<ListaPrzesylek> value) {
        this.przesylki = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

}

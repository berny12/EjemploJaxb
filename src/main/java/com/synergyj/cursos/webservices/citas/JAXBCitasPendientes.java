//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci—n de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder‡n si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.08.30 a las 06:06:09 PM CDT 
//


package com.synergyj.cursos.webservices.citas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="totalCitas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="citas" type="{http://www.synergyj.com/cursos/webservices/citas}JAXBCita" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fecha",
    "totalCitas",
    "citas"
})
@XmlRootElement(name = "JAXBCitasPendientes")
public class JAXBCitasPendientes
    implements Serializable
{

    private final static long serialVersionUID = -6026937020915831338L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fecha;
    protected int totalCitas;
    @XmlElement(required = true)
    protected List<JAXBCita> citas;

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCitas.
     * 
     */
    public int getTotalCitas() {
        return totalCitas;
    }

    /**
     * Define el valor de la propiedad totalCitas.
     * 
     */
    public void setTotalCitas(int value) {
        this.totalCitas = value;
    }

    /**
     * Gets the value of the citas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBCita }
     * 
     * 
     */
    public List<JAXBCita> getCitas() {
        if (citas == null) {
            citas = new ArrayList<JAXBCita>();
        }
        return this.citas;
    }

}

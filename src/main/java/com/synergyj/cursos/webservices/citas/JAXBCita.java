//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci—n de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder‡n si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.08.30 a las 01:55:06 PM CDT 
//


package com.synergyj.cursos.webservices.citas;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para JAXBCita complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="JAXBCita">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apellidoPaterno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apellidoMaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *               &lt;enumeration value="M"/>
 *               &lt;enumeration value="H"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="horaCita" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="estatus" type="{http://www.synergyj.com/cursos/webservices/citas}JAXBEstatusCita"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JAXBCita", propOrder = {
    "nombre",
    "apellidoPaterno",
    "apellidoMaterno",
    "sexo",
    "horaCita",
    "estatus",
    "observaciones"
})
public class JAXBCita
    implements Serializable
{

    private final static long serialVersionUID = -6026937020915831338L;
    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    @XmlElement(required = true)
    protected String sexo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar horaCita;
    @XmlElement(required = true)
    protected JAXBEstatusCita estatus;
    protected Object observaciones;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoPaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Define el valor de la propiedad apellidoPaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoPaterno(String value) {
        this.apellidoPaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoMaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Define el valor de la propiedad apellidoMaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoMaterno(String value) {
        this.apellidoMaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad horaCita.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraCita() {
        return horaCita;
    }

    /**
     * Define el valor de la propiedad horaCita.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraCita(XMLGregorianCalendar value) {
        this.horaCita = value;
    }

    /**
     * Obtiene el valor de la propiedad estatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBEstatusCita }
     *     
     */
    public JAXBEstatusCita getEstatus() {
        return estatus;
    }

    /**
     * Define el valor de la propiedad estatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBEstatusCita }
     *     
     */
    public void setEstatus(JAXBEstatusCita value) {
        this.estatus = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setObservaciones(Object value) {
        this.observaciones = value;
    }

}

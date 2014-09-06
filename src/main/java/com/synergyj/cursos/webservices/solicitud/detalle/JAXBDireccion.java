//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci—n de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder‡n si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.08.30 a las 06:06:09 PM CDT 
//


package com.synergyj.cursos.webservices.solicitud.detalle;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para JAXBDireccion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="JAXBDireccion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aniosResidencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="calle">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codigoPostal" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minExclusive value="0"/>
 *               &lt;maxExclusive value="100000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="colonia">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mesesResidencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="noExterior">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="noInterior" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="referenciaDireccion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="250"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JAXBDireccion", propOrder = {
    "aniosResidencia",
    "calle",
    "codigoPostal",
    "colonia",
    "mesesResidencia",
    "noExterior",
    "noInterior",
    "referenciaDireccion"
})
public class JAXBDireccion
    implements Serializable
{

    private final static long serialVersionUID = -6026937020915831338L;
    protected int aniosResidencia;
    @XmlElement(required = true)
    protected String calle;
    protected Integer codigoPostal;
    @XmlElement(required = true)
    protected String colonia;
    protected int mesesResidencia;
    @XmlElement(required = true)
    protected String noExterior;
    protected String noInterior;
    protected String referenciaDireccion;

    /**
     * Obtiene el valor de la propiedad aniosResidencia.
     * 
     */
    public int getAniosResidencia() {
        return aniosResidencia;
    }

    /**
     * Define el valor de la propiedad aniosResidencia.
     * 
     */
    public void setAniosResidencia(int value) {
        this.aniosResidencia = value;
    }

    /**
     * Obtiene el valor de la propiedad calle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Define el valor de la propiedad calle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalle(String value) {
        this.calle = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPostal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Define el valor de la propiedad codigoPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoPostal(Integer value) {
        this.codigoPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad colonia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Define el valor de la propiedad colonia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColonia(String value) {
        this.colonia = value;
    }

    /**
     * Obtiene el valor de la propiedad mesesResidencia.
     * 
     */
    public int getMesesResidencia() {
        return mesesResidencia;
    }

    /**
     * Define el valor de la propiedad mesesResidencia.
     * 
     */
    public void setMesesResidencia(int value) {
        this.mesesResidencia = value;
    }

    /**
     * Obtiene el valor de la propiedad noExterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoExterior() {
        return noExterior;
    }

    /**
     * Define el valor de la propiedad noExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoExterior(String value) {
        this.noExterior = value;
    }

    /**
     * Obtiene el valor de la propiedad noInterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoInterior() {
        return noInterior;
    }

    /**
     * Define el valor de la propiedad noInterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoInterior(String value) {
        this.noInterior = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaDireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaDireccion() {
        return referenciaDireccion;
    }

    /**
     * Define el valor de la propiedad referenciaDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaDireccion(String value) {
        this.referenciaDireccion = value;
    }

}

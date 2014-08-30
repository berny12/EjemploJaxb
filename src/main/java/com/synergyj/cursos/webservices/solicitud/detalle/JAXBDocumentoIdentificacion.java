//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci—n de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder‡n si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.08.30 a las 01:55:06 PM CDT 
//


package com.synergyj.cursos.webservices.solicitud.detalle;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para JAXBDocumentoIdentificacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="JAXBDocumentoIdentificacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anioRegistro" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="institucion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="folio" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="foja" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="idEntidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="claveMunicipio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idPaisRegistroActa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idTipoActaNacimiento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idTipoDocumentoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="libro" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tomo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="25"/>
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
@XmlType(name = "JAXBDocumentoIdentificacion", propOrder = {
    "anioRegistro",
    "institucion",
    "fechaExpedicion",
    "folio",
    "foja",
    "idEntidad",
    "claveMunicipio",
    "idPaisRegistroActa",
    "idTipoActaNacimiento",
    "idTipoDocumentoIdentificacion",
    "libro",
    "tomo"
})
public class JAXBDocumentoIdentificacion
    implements Serializable
{

    private final static long serialVersionUID = -6026937020915831338L;
    protected String anioRegistro;
    protected String institucion;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaExpedicion;
    protected String folio;
    protected String foja;
    protected Integer idEntidad;
    protected Integer claveMunicipio;
    protected Integer idPaisRegistroActa;
    protected Integer idTipoActaNacimiento;
    protected int idTipoDocumentoIdentificacion;
    protected String libro;
    protected String tomo;

    /**
     * Obtiene el valor de la propiedad anioRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnioRegistro() {
        return anioRegistro;
    }

    /**
     * Define el valor de la propiedad anioRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnioRegistro(String value) {
        this.anioRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad institucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitucion() {
        return institucion;
    }

    /**
     * Define el valor de la propiedad institucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitucion(String value) {
        this.institucion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Define el valor de la propiedad fechaExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaExpedicion(XMLGregorianCalendar value) {
        this.fechaExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad foja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoja() {
        return foja;
    }

    /**
     * Define el valor de la propiedad foja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoja(String value) {
        this.foja = value;
    }

    /**
     * Obtiene el valor de la propiedad idEntidad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdEntidad() {
        return idEntidad;
    }

    /**
     * Define el valor de la propiedad idEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdEntidad(Integer value) {
        this.idEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad claveMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClaveMunicipio() {
        return claveMunicipio;
    }

    /**
     * Define el valor de la propiedad claveMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClaveMunicipio(Integer value) {
        this.claveMunicipio = value;
    }

    /**
     * Obtiene el valor de la propiedad idPaisRegistroActa.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdPaisRegistroActa() {
        return idPaisRegistroActa;
    }

    /**
     * Define el valor de la propiedad idPaisRegistroActa.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPaisRegistroActa(Integer value) {
        this.idPaisRegistroActa = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoActaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTipoActaNacimiento() {
        return idTipoActaNacimiento;
    }

    /**
     * Define el valor de la propiedad idTipoActaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTipoActaNacimiento(Integer value) {
        this.idTipoActaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoDocumentoIdentificacion.
     * 
     */
    public int getIdTipoDocumentoIdentificacion() {
        return idTipoDocumentoIdentificacion;
    }

    /**
     * Define el valor de la propiedad idTipoDocumentoIdentificacion.
     * 
     */
    public void setIdTipoDocumentoIdentificacion(int value) {
        this.idTipoDocumentoIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad libro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibro() {
        return libro;
    }

    /**
     * Define el valor de la propiedad libro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibro(String value) {
        this.libro = value;
    }

    /**
     * Obtiene el valor de la propiedad tomo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTomo() {
        return tomo;
    }

    /**
     * Define el valor de la propiedad tomo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTomo(String value) {
        this.tomo = value;
    }

}

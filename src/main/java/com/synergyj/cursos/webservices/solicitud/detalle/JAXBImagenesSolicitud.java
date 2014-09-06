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
 * <p>Clase Java para JAXBImagenesSolicitud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="JAXBImagenesSolicitud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCausaSinFirma" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idCausaSinHuella" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idPrimerDedo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idSegundoDedo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="imagenFirma" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="imagenFotografia" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="primerWSQ" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="segundoWSQ" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JAXBImagenesSolicitud", propOrder = {
    "idCausaSinFirma",
    "idCausaSinHuella",
    "idPrimerDedo",
    "idSegundoDedo",
    "imagenFirma",
    "imagenFotografia",
    "primerWSQ",
    "segundoWSQ"
})
public class JAXBImagenesSolicitud
    implements Serializable
{

    private final static long serialVersionUID = -6026937020915831338L;
    protected Long idCausaSinFirma;
    protected Long idCausaSinHuella;
    protected Long idPrimerDedo;
    protected Long idSegundoDedo;
    protected byte[] imagenFirma;
    @XmlElement(required = true)
    protected byte[] imagenFotografia;
    protected byte[] primerWSQ;
    protected byte[] segundoWSQ;

    /**
     * Obtiene el valor de la propiedad idCausaSinFirma.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdCausaSinFirma() {
        return idCausaSinFirma;
    }

    /**
     * Define el valor de la propiedad idCausaSinFirma.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdCausaSinFirma(Long value) {
        this.idCausaSinFirma = value;
    }

    /**
     * Obtiene el valor de la propiedad idCausaSinHuella.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdCausaSinHuella() {
        return idCausaSinHuella;
    }

    /**
     * Define el valor de la propiedad idCausaSinHuella.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdCausaSinHuella(Long value) {
        this.idCausaSinHuella = value;
    }

    /**
     * Obtiene el valor de la propiedad idPrimerDedo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPrimerDedo() {
        return idPrimerDedo;
    }

    /**
     * Define el valor de la propiedad idPrimerDedo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPrimerDedo(Long value) {
        this.idPrimerDedo = value;
    }

    /**
     * Obtiene el valor de la propiedad idSegundoDedo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdSegundoDedo() {
        return idSegundoDedo;
    }

    /**
     * Define el valor de la propiedad idSegundoDedo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdSegundoDedo(Long value) {
        this.idSegundoDedo = value;
    }

    /**
     * Obtiene el valor de la propiedad imagenFirma.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagenFirma() {
        return imagenFirma;
    }

    /**
     * Define el valor de la propiedad imagenFirma.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagenFirma(byte[] value) {
        this.imagenFirma = value;
    }

    /**
     * Obtiene el valor de la propiedad imagenFotografia.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagenFotografia() {
        return imagenFotografia;
    }

    /**
     * Define el valor de la propiedad imagenFotografia.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagenFotografia(byte[] value) {
        this.imagenFotografia = value;
    }

    /**
     * Obtiene el valor de la propiedad primerWSQ.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPrimerWSQ() {
        return primerWSQ;
    }

    /**
     * Define el valor de la propiedad primerWSQ.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPrimerWSQ(byte[] value) {
        this.primerWSQ = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoWSQ.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSegundoWSQ() {
        return segundoWSQ;
    }

    /**
     * Define el valor de la propiedad segundoWSQ.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSegundoWSQ(byte[] value) {
        this.segundoWSQ = value;
    }

}

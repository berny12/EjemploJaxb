//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci—n de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder‡n si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.08.30 a las 06:06:09 PM CDT 
//


package com.synergyj.cursos.webservices.solicitud;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.synergyj.cursos.webservices.solicitud.detalle.JAXBDocumentoIdentificacion;
import com.synergyj.cursos.webservices.solicitud.detalle.JAXBImagenesSolicitud;
import com.synergyj.cursos.webservices.solicitud.detalle.JAXBSolicitante;
import org.w3._2001.xmlschema.Adapter1;


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
 *         &lt;element name="documentoIdentificacion" type="{http://www.synergyj.com/cursos/webservices/solicitud/detalle}JAXBDocumentoIdentificacion"/>
 *         &lt;element name="fechaSolicitud">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="folioSolicitud">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="13"/>
 *               &lt;maxLength value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="idTipoSolicitud" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="imagenesSolicitud" type="{http://www.synergyj.com/cursos/webservices/solicitud/detalle}JAXBImagenesSolicitud"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="solicitante" type="{http://www.synergyj.com/cursos/webservices/solicitud/detalle}JAXBSolicitante"/>
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
    "documentoIdentificacion",
    "fechaSolicitud",
    "folioSolicitud",
    "idTipoSolicitud",
    "imagenesSolicitud",
    "observaciones",
    "solicitante"
})
@XmlRootElement(name = "JAXBSolicitud")
public class JAXBSolicitud
    implements Serializable
{

    private final static long serialVersionUID = -6026937020915831338L;
    @XmlElement(required = true)
    protected JAXBDocumentoIdentificacion documentoIdentificacion;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date fechaSolicitud;
    @XmlElement(required = true)
    protected String folioSolicitud;
    protected long idTipoSolicitud;
    @XmlElement(required = true)
    protected JAXBImagenesSolicitud imagenesSolicitud;
    protected String observaciones;
    @XmlElement(required = true)
    protected JAXBSolicitante solicitante;

    /**
     * Obtiene el valor de la propiedad documentoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBDocumentoIdentificacion }
     *     
     */
    public JAXBDocumentoIdentificacion getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }

    /**
     * Define el valor de la propiedad documentoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBDocumentoIdentificacion }
     *     
     */
    public void setDocumentoIdentificacion(JAXBDocumentoIdentificacion value) {
        this.documentoIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSolicitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    /**
     * Define el valor de la propiedad fechaSolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaSolicitud(Date value) {
        this.fechaSolicitud = value;
    }

    /**
     * Obtiene el valor de la propiedad folioSolicitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioSolicitud() {
        return folioSolicitud;
    }

    /**
     * Define el valor de la propiedad folioSolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioSolicitud(String value) {
        this.folioSolicitud = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoSolicitud.
     * 
     */
    public long getIdTipoSolicitud() {
        return idTipoSolicitud;
    }

    /**
     * Define el valor de la propiedad idTipoSolicitud.
     * 
     */
    public void setIdTipoSolicitud(long value) {
        this.idTipoSolicitud = value;
    }

    /**
     * Obtiene el valor de la propiedad imagenesSolicitud.
     * 
     * @return
     *     possible object is
     *     {@link JAXBImagenesSolicitud }
     *     
     */
    public JAXBImagenesSolicitud getImagenesSolicitud() {
        return imagenesSolicitud;
    }

    /**
     * Define el valor de la propiedad imagenesSolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBImagenesSolicitud }
     *     
     */
    public void setImagenesSolicitud(JAXBImagenesSolicitud value) {
        this.imagenesSolicitud = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBSolicitante }
     *     
     */
    public JAXBSolicitante getSolicitante() {
        return solicitante;
    }

    /**
     * Define el valor de la propiedad solicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBSolicitante }
     *     
     */
    public void setSolicitante(JAXBSolicitante value) {
        this.solicitante = value;
    }

}

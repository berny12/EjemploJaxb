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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para JAXBSolicitante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="JAXBSolicitante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellidoMaterno">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="apellidoPaterno">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="correoElectronico" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="120"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="curp" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="18"/>
 *               &lt;maxLength value="18"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="direccion" type="{http://www.synergyj.com/cursos/webservices/solicitud/detalle}JAXBDireccion"/>
 *         &lt;element name="edad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="escolaridad" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="fechaNaturalizacion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="idLugarNacimiento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nombre">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ocupacion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="paisNacimiento" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sexo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="H"/>
 *               &lt;enumeration value="M"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="telefono" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="35"/>
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
@XmlType(name = "JAXBSolicitante", propOrder = {
    "apellidoMaterno",
    "apellidoPaterno",
    "correoElectronico",
    "curp",
    "direccion",
    "edad",
    "escolaridad",
    "fechaNacimiento",
    "fechaNaturalizacion",
    "idLugarNacimiento",
    "nombre",
    "ocupacion",
    "paisNacimiento",
    "sexo",
    "telefono"
})
public class JAXBSolicitante
    implements Serializable
{

    private final static long serialVersionUID = -6026937020915831338L;
    @XmlElement(required = true)
    protected String apellidoMaterno;
    @XmlElement(required = true)
    protected String apellidoPaterno;
    protected String correoElectronico;
    protected String curp;
    @XmlElement(required = true)
    protected JAXBDireccion direccion;
    protected int edad;
    protected long escolaridad;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaNacimiento;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaNaturalizacion;
    protected long idLugarNacimiento;
    @XmlElement(required = true)
    protected String nombre;
    protected long ocupacion;
    protected String paisNacimiento;
    @XmlElement(required = true)
    protected String sexo;
    protected String telefono;

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
     * Obtiene el valor de la propiedad correoElectronico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Define el valor de la propiedad correoElectronico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoElectronico(String value) {
        this.correoElectronico = value;
    }

    /**
     * Obtiene el valor de la propiedad curp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurp() {
        return curp;
    }

    /**
     * Define el valor de la propiedad curp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurp(String value) {
        this.curp = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBDireccion }
     *     
     */
    public JAXBDireccion getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBDireccion }
     *     
     */
    public void setDireccion(JAXBDireccion value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad edad.
     * 
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Define el valor de la propiedad edad.
     * 
     */
    public void setEdad(int value) {
        this.edad = value;
    }

    /**
     * Obtiene el valor de la propiedad escolaridad.
     * 
     */
    public long getEscolaridad() {
        return escolaridad;
    }

    /**
     * Define el valor de la propiedad escolaridad.
     * 
     */
    public void setEscolaridad(long value) {
        this.escolaridad = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNacimiento(XMLGregorianCalendar value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNaturalizacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNaturalizacion() {
        return fechaNaturalizacion;
    }

    /**
     * Define el valor de la propiedad fechaNaturalizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNaturalizacion(XMLGregorianCalendar value) {
        this.fechaNaturalizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idLugarNacimiento.
     * 
     */
    public long getIdLugarNacimiento() {
        return idLugarNacimiento;
    }

    /**
     * Define el valor de la propiedad idLugarNacimiento.
     * 
     */
    public void setIdLugarNacimiento(long value) {
        this.idLugarNacimiento = value;
    }

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
     * Obtiene el valor de la propiedad ocupacion.
     * 
     */
    public long getOcupacion() {
        return ocupacion;
    }

    /**
     * Define el valor de la propiedad ocupacion.
     * 
     */
    public void setOcupacion(long value) {
        this.ocupacion = value;
    }

    /**
     * Obtiene el valor de la propiedad paisNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    /**
     * Define el valor de la propiedad paisNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisNacimiento(String value) {
        this.paisNacimiento = value;
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
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

}

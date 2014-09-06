//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci—n de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder‡n si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.08.30 a las 06:06:09 PM CDT 
//


package com.synergyj.cursos.webservices.citas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para JAXBEstatusCita.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="JAXBEstatusCita">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ORDINARIA"/>
 *     &lt;enumeration value="URGENTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JAXBEstatusCita")
@XmlEnum
public enum JAXBEstatusCita {

    ORDINARIA,
    URGENTE;

    public String value() {
        return name();
    }

    public static JAXBEstatusCita fromValue(String v) {
        return valueOf(v);
    }

}

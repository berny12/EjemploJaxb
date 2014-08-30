//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci—n de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder‡n si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.08.30 a las 01:55:06 PM CDT 
//


package org.w3._2001.xmlschema;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (mx.bigdata.sat.schema.binder.DateTimeCustomBinder.parseDateTime(value));
    }

    public String marshal(Date value) {
        return (mx.bigdata.sat.schema.binder.DateTimeCustomBinder.printDateTime(value));
    }

}

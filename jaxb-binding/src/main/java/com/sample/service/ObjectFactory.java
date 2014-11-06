
package com.sample.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sample.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetReport_QNAME = new QName("http://com.sample/types", "GetReport");
    private final static QName _GetReportResponse_QNAME = new QName("http://com.sample/types", "GetReportResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sample.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetReportType }
     * 
     */
    public GetReportType createGetReportType() {
        return new GetReportType();
    }

    /**
     * Create an instance of {@link GetReportResponseType }
     * 
     */
    public GetReportResponseType createGetReportResponseType() {
        return new GetReportResponseType();
    }

    /**
     * Create an instance of {@link ClientType }
     * 
     */
    public ClientType createClientType() {
        return new ClientType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.sample/types", name = "GetReport")
    public JAXBElement<GetReportType> createGetReport(GetReportType value) {
        return new JAXBElement<GetReportType>(_GetReport_QNAME, GetReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReportResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.sample/types", name = "GetReportResponse")
    public JAXBElement<GetReportResponseType> createGetReportResponse(GetReportResponseType value) {
        return new JAXBElement<GetReportResponseType>(_GetReportResponse_QNAME, GetReportResponseType.class, null, value);
    }

}

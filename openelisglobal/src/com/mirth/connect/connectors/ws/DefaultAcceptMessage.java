package com.mirth.connect.connectors.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-09-16T15:23:45.906+07:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://ws.connectors.connect.mirth.com/", name = "DefaultAcceptMessage")
@XmlSeeAlso({ObjectFactory.class})
public interface DefaultAcceptMessage {

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://ws.connectors.connect.mirth.com/DefaultAcceptMessage/acceptMessageRequest", output = "http://ws.connectors.connect.mirth.com/DefaultAcceptMessage/acceptMessageResponse")
    @RequestWrapper(localName = "acceptMessage", targetNamespace = "http://ws.connectors.connect.mirth.com/", className = "com.mirth.connect.connectors.ws.AcceptMessage")
    @WebMethod
    @ResponseWrapper(localName = "acceptMessageResponse", targetNamespace = "http://ws.connectors.connect.mirth.com/", className = "com.mirth.connect.connectors.ws.AcceptMessageResponse")
    public java.lang.String acceptMessage(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}

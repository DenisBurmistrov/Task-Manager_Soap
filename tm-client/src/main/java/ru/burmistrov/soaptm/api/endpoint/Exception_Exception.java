
package ru.burmistrov.soaptm.api.endpoint;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-05-16T13:30:19.123+03:00
 * Generated source version: 3.2.7
 */

@WebFault(name = "Exception", targetNamespace = "http://endpoint.api.soapTM.burmistrov.ru/")
public class Exception_Exception extends java.lang.Exception {

    private ru.burmistrov.soaptm.api.endpoint.Exception exception;

    public Exception_Exception() {
        super();
    }

    public Exception_Exception(String message) {
        super(message);
    }

    public Exception_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public Exception_Exception(String message, ru.burmistrov.soaptm.api.endpoint.Exception exception) {
        super(message);
        this.exception = exception;
    }

    public Exception_Exception(String message, ru.burmistrov.soaptm.api.endpoint.Exception exception, java.lang.Throwable cause) {
        super(message, cause);
        this.exception = exception;
    }

    public ru.burmistrov.soaptm.api.endpoint.Exception getFaultInfo() {
        return this.exception;
    }
}

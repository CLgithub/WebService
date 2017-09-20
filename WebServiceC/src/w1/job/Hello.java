
package w1.job;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Hello", targetNamespace = "http://job.w1/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Hello {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStr", targetNamespace = "http://job.w1/", className = "w1.job.GetStr")
    @ResponseWrapper(localName = "getStrResponse", targetNamespace = "http://job.w1/", className = "w1.job.GetStrResponse")
    @Action(input = "http://job.w1/Hello/getStrRequest", output = "http://job.w1/Hello/getStrResponse")
    public String getStr(
        @WebParam(name = "arg0", targetNamespace = "")
        Entity1 arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://job.w1/", className = "w1.job.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://job.w1/", className = "w1.job.SayHelloResponse")
    @Action(input = "http://job.w1/Hello/sayHelloRequest", output = "http://job.w1/Hello/sayHelloResponse")
    public String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}


package w1.job;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the w1.job package. 
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

    private final static QName _GetStrResponse_QNAME = new QName("http://job.w1/", "getStrResponse");
    private final static QName _SayHelloResponse_QNAME = new QName("http://job.w1/", "sayHelloResponse");
    private final static QName _GetStr_QNAME = new QName("http://job.w1/", "getStr");
    private final static QName _SayHello_QNAME = new QName("http://job.w1/", "sayHello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: w1.job
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStr }
     * 
     */
    public GetStr createGetStr() {
        return new GetStr();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link GetStrResponse }
     * 
     */
    public GetStrResponse createGetStrResponse() {
        return new GetStrResponse();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link Entity1 }
     * 
     */
    public Entity1 createEntity1() {
        return new Entity1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://job.w1/", name = "getStrResponse")
    public JAXBElement<GetStrResponse> createGetStrResponse(GetStrResponse value) {
        return new JAXBElement<GetStrResponse>(_GetStrResponse_QNAME, GetStrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://job.w1/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://job.w1/", name = "getStr")
    public JAXBElement<GetStr> createGetStr(GetStr value) {
        return new JAXBElement<GetStr>(_GetStr_QNAME, GetStr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://job.w1/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

}

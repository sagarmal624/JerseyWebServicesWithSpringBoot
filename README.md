# JerseyWebServicesWithSpringBoot

#@Path is used to identify the URI path (relative) that a resource class or class method will serve requests for.

#@PathParam is used to bind the value of a URI template parameter or a path segment containing the template parameter to a resource method parameter, resource class field, or resource class bean property. The value is URL decoded unless this is disabled using the @Encoded annotation.

#@GET indicates that annotated method handles HTTP GET requests.

#@POST indicates that annotated method handles HTTP POST requests.

#@PUT indicates that annotated method handles HTTP PUT requests.

#@DELETE indicates that annotated method handles HTTP DELETE requests.

#@Produces defines a media-type that the resource method can produce.

#@Consumes defines a media-type that the resource method can accept.



# XML Annotataions
#@XmlRootElement is an annotation that people are used to using with JAXB (JSR-222).  It's purpose is to uniquely associate a root element with a class.  Since JAXB classes map to complex types, it is possible for a class to correspond to multiple root elements. In this case @XmlRootElement can not be used and people start getting a bit confused.  In this post I'll demonstrate how @XmlElementDecl can be used to map this use case.

#XmlElement:  this is used to showing as sub element of root



<pre><code>
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.NONE)
public class Person {
    @XmlElement
    private String name;
    @XmlElement
    private Integer salary;
    @XmlElement
    private Integer age;
</code></pre>









#Application Response...........................

#JSON

To GET
http://localhost:8080/employee/get?id=1

{
"name": "Sagar",
"salary": 60000,
"age": 25
}




To Save

http://localhost:8080/employee/save

PayLoad:

{
"name" : "Spring BOOT",
"salary":7000,
"age":20
}



#To XML


To Get

http://localhost:8080/person/xml?id=1


You will get result in XML Format.


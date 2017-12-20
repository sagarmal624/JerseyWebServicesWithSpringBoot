package com.sagarandcompany.sagarandcompany.XML;

import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Controller
@Path("/person")
public class PersonController {

    @Path("/xml")
    @Produces(MediaType.APPLICATION_XML)
    @GET
    public Person getEmployeeInXML(@QueryParam("id") Long id) {
        Person person = new Person();
        person.setAge(25);
        person.setName("Sagar");
        person.setSalary(60000);
        return person;
    }


}

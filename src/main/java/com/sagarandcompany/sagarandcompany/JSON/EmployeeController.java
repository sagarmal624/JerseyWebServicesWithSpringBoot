package com.sagarandcompany.sagarandcompany.JSON;

import com.sagarandcompany.sagarandcompany.XML.Person;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Controller
@Path("/employee")
public class EmployeeController {
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public Employee getEmployee(@QueryParam("id") Long id) {
        Employee employee = new Employee();
        employee.setAge(25);
        employee.setName("Sagar");
        employee.setSalary(60000);
        return employee;
    }

    @Path("/save")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @POST
    public Employee saveEmployee(Employee employee) {
        return employee;
    }

}

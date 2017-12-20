package com.sagarandcompany.sagarandcompany;

import com.sagarandcompany.sagarandcompany.JSON.EmployeeController;
import com.sagarandcompany.sagarandcompany.XML.PersonController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
//@ApplicationPath("/")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(PersonController.class);
        register(EmployeeController.class);
    }
}
package io.opentracing.contrib.jaxrs2.example.spring.boot;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Path("/hello")
public class HelloResource {
    @GET
    @Produces(MediaType.TEXT_XML)
    public String sayHello() {
        return "Hello, world!";
    }
}

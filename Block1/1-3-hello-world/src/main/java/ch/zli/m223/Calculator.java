package ch.zli.m223;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/calculator/add/{x}/{y}")
public class Calculator {
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String add(@PathParam("x") double x, @PathParam("y") double y) {
    return Double.toString(x + y);
  }
}

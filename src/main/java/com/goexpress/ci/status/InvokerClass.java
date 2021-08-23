package com.goexpress.ci.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@ApplicationPath("/resources")

public class InvokerClass {
	 @GET
	    //@Path Identifies the URI path that a resource class will serve requests for.
	 @Path("status")
	    //@Produces defines the media type(s) that the methods of a resource class can produce.
	 //This is used to test REST 
	 @Produces(MediaType.TEXT_PLAIN)
	  public String getStatusResponse() {
	    return "Response";
	  }
}

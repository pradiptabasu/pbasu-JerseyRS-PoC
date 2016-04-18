package com.pradipta.rest.test;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


// The class registers its methods for the HTTP GET request using the @GET annotation. 
// Using the @Produces annotation, it defines that it can deliver several MIME types,
// text, XML and HTML. 

// The browser requests per default the HTML MIME type.

//Sets the path to base URL + /hello
@Path("/hello")
public class HelloWorld {

	// This method is called if TEXT_PLAIN is request
	  @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String sayPlainTextHello() {
		  System.out.println("\n\n\n\n\n\n\n\n\n\n PRADIPTA HELLO WORLD REST PLAIN TEXT \n\n\n\n\n\n\n\n\n\n\n");
	    return "Hello Jersey";
	  }

	  // This method is called if XML is request
	  @GET
	  @Produces(MediaType.TEXT_XML)
	  public String sayXMLHello() {
		  System.out.println("\n\n\n\n\n\n\n\n\n\n PRADIPTA HELLO WORLD REST XML \n\n\n\n\n\n\n\n\n\n\n");
	    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
	  }

	  // This method is called if HTML is request
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public String sayHtmlHello() {
		  System.out.println("\n\n\n\n\n\n\n\n\n\n PRADIPTA HELLO WORLD REST HTML \n\n\n\n\n\n\n\n\n\n\n");
	    return "<html> " + "<title>" + "Hello Jersey" + "</title>"
	        + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
	  }
	  
	  // This method is called if XML is request
	  @POST
	  @Path("/sayXMLHelloPOST")
	  @Produces(MediaType.TEXT_XML)
	  public String sayXMLHelloPOSTPath() {
		  System.out.println("\n\n\n\n\n\n\n\n\n\n PRADIPTA HELLO WORLD REST POST WITH PATH\n\n\n\n\n\n\n\n\n\n\n");
		return "<?xml version=\"1.0\"?>" + "<hello> Hello sayXMLHelloPOSTPath Jersey" + "</hello>";
	  }
	  
	  // This method is called if XML is request
	  @POST
	  @Produces(MediaType.TEXT_XML)
	  public String sayXMLHelloPOST() {
		  System.out.println("\n\n\n\n\n\n\n\n\n\n PRADIPTA HELLO WORLD REST POST XML \n\n\n\n\n\n\n\n\n\n\n");
		return "<?xml version=\"1.0\"?>" + "<hello> Hello sayXMLHelloPOST Jersey" + "</hello>";
	  }
}

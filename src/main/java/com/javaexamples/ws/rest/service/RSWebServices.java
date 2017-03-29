package com.javaexamples.ws.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.javaexamples.ws.rest.dao.RSOutputDAO;

@Path("/examples")
public class RSWebServices {
	
	@GET
	@Path("/getUserInfo")
	@Produces(MediaType.APPLICATION_JSON)
	public RSOutputDAO getUserInfo(){
		
		RSOutputDAO out = new RSOutputDAO();
		out.setUserName("Kamil");
		out.setUserAge(29);
		
		return out;
		
	}
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg){
		
		String output = "Welcome to Restful WS : " + msg;
		return Response.status(200).entity(output).build();
		
	}

}
package com.samuel.lnd.ajaxexample.data.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.samuel.lnd.ajaxexample.data.Student;


@Path("/StudentResource")
public class JSONService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudents() {
		System.out.println("Resource called");
		List<Student> students = new ArrayList<Student>();

		Student st = new Student();
		st.setName("Met Life");
		st.setId(2);
		students.add(st);
		
		st = new Student();
		st.setName("Hilary Clinton");
		st.setId(21);
		students.add(st);
		
		st = new Student();
		st.setName("Barry Smith");
		st.setId(42);
		students.add(st);

		return students;

	}

/*	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();
		
	}*/
	
}
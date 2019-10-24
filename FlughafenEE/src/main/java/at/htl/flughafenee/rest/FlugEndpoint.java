package at.htl.flughafenee.rest;

import at.htl.flughafenee.model.Flug;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("flug")
@Stateless
public class FlugEndpoint {
    @PersistenceContext
    EntityManager em;

    @PostConstruct
    public void init(){
        System.err.println("*** created ***");
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Flug getFlug(@PathParam("id") long id){
        return em.find(Flug.class, id);
    }
}

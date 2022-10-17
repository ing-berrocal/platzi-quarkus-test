/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.platzi;


import io.smallrye.mutiny.Uni;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;
import org.example.platzi.service.TerceroService;

import org.example.platzi.model.Tercero;

/**
 *
 * @author DELL
 */
@Path("/tercero")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ReactiveTerceroResource {
    
    @Inject
    TerceroService terceroService;

    @GET
    public Uni<List<Tercero>> list() {
        return terceroService.getFindAll();
    }
    
}

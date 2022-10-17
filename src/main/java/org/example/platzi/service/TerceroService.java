/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.platzi.service;

import io.quarkus.mongodb.reactive.ReactiveMongoClient;
import io.quarkus.mongodb.reactive.ReactiveMongoCollection;
import io.smallrye.mutiny.Uni;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.bson.Document;

import org.example.platzi.model.Tercero;
/**
 *
 * @author DELL
 */
@ApplicationScoped
public class TerceroService {
    
    @Inject
    private ReactiveMongoClient mongoClient;
    
    public Uni<List<Tercero>> getFindAll(){
        return getCollection()
                .find()
                .map((t) -> new Tercero(
                        t.get("tipoDocumento", String.class),
                        t.get("numeroDocumento", String.class),
                        t.get("razonSocial", String.class)
                ))
                .collect().asList();
    }
    
    private ReactiveMongoCollection<Document> getCollection() {
        return mongoClient.getDatabase("platzi").getCollection("terceros");
    }
}

package com.cccc

import io.smallrye.mutiny.Uni
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/hello")
class RestResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): Uni<String> = Uni.createFrom().item { "Hello from Quarkus REST" }
}
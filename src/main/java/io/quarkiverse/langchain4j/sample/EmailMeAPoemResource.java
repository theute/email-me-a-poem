package io.quarkiverse.langchain4j.sample;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

import io.quarkus.logging.Log;

@Path("/email-me-a-poem")
public class EmailMeAPoemResource {

    private final MyAiService service;

    public EmailMeAPoemResource(MyAiService service) {
        this.service = service;
    }

    @GET
    public String emailMeAPoem(@QueryParam("topic") String topic) {
        Log.info("Topic: " + topic);
        return service.writeAPoem(topic, 4);
    }

}

package com.co.req.tasks;

import com.co.req.interactions.Post;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class PostLogin implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to("/api/login")
                        .with(requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .header("x-api-key"," reqres-free-v1")
                                .body("{\n" +
                                        "    \"email\": \"eve.holt@reqres.in\",\n" +
                                        "    \"password\": \"cityslicka\"\n" +
                                        "}"))

        );
    }

    public static PostLogin withTheData() {
        return Tasks.instrumented(PostLogin.class);
    }
}

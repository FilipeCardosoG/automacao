package com.seuprojeto.api;

import com.seuprojeto.model.CreateUserRequest;
import com.seuprojeto.model.CreateUserResponse;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class UserApiTest extends BaseTest {

    @Test
    public void testCreateUser() {
        CreateUserRequest request = new CreateUserRequest();
        request.setName("John Doe");
        request.setJob("Developer");

        CreateUserResponse createdUser = given()
            .contentType("application/json")
            .body(request)
            .when()
            .post("/users")
            .then()
            .statusCode(201)
            .extract()
            .as(CreateUserResponse.class);

        assertThat(createdUser.getName(), equalTo(request.getName()));
        assertThat(createdUser.getJob(), equalTo(request.getJob()));
        //assertThat(createdUser.statusCode(), equalTo(200));
    }
}

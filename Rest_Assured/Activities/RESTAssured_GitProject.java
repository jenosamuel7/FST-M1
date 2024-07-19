package GithubRestProject;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;


public class GithubrestassuredProjectActivity {
	RequestSpecification requestSpec;
	  String sshKey = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAICrbM33cy0SD+akMDTkNsyqtMryWMV077zVCRNeocBeC";
	  int sshKeyid;
	  

@BeforeClass
public void setUp() {
	  requestSpec = new RequestSpecBuilder()
			        .setBaseUri("https://api.github.com/user/keys")
			        .addHeader("Content-Type", "application/json")
			        .addHeader("Authorization", "token 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")
			        .build();
}

@Test(priority=1)
public void addSSHKey() {
		Map<String, String> reqBody = new HashMap<String, String>();
		
		reqBody.put("title", "TestAPIKey");
		reqBody.put("key", sshKey);
	  
	  Response response = given().spec(requestSpec).body(reqBody)
			              .when()
			              .post();
	  
	  response.prettyPrint();
  response.then().log().all();  
 
	sshKeyid = response.then().extract().path("id");  
	System.out.println("sshKeyid: " +sshKeyid);
	response.then().statusCode(201);
		 
}

@Test(priority=2)
public void getSSHKey() {
	  
	  Response response = given().spec(requestSpec)
			                 .pathParam("keyId", sshKeyid)
			                 .when().get("/{keyId}");
	  
	  Reporter.log(response.asPrettyString());
	 
	  response.then().statusCode(200);
	  
}
@Test(priority=3)
public void deleteSSHKey() {
	  Response response = given().spec(requestSpec)
			               .pathParam("keyId", sshKeyid)
			               .when().delete("/{keyId}");
	  
	  Reporter.log(response.asPrettyString());
	  
	  response.then().statusCode(204);
}
}

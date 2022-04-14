package Common;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class BaseClass implements IConstant {

	@BeforeSuite
	public void init() {
		// Set Base uri
		RestAssured.baseURI = BASEURI;
	}

}

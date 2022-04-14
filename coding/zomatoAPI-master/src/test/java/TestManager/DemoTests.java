package TestManager;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Common.BaseClass;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DemoTests extends BaseClass{
	
	static RequestSpecification requestspec;
	int entity_id;
	float lattitude;
	float longitude;
	int city_id;
	int estb_id;
	int category_id;
	List<String> listofcuisines=new ArrayList<String>();
	List<String> desiredres=new ArrayList<String>();
	List<String> listofestb=new ArrayList<String>();
	List<String> category=new ArrayList<String>();
	List<String> finalout=new ArrayList<String>();
	
	@BeforeClass
	public static void setup() {
		RequestSpecBuilder builder=new RequestSpecBuilder();
		builder.addHeader("user-key", "4bd8b592e55054458e37c284ae9459f1");
		requestspec=builder.build();
	}
	
	
	@Test(priority=1)		
	public void getLocation() {
		Response response=given()
									.spec(requestspec)
									.queryParam("query", "Bengaluru")
									.queryParam("count", 1)
									
						.get(LOCATIONS);
		
		JsonPath js=new JsonPath(response.asString());
		entity_id=js.getInt("location_suggestions[0].entity_id");
		lattitude=js.getFloat("location_suggestions[0].latitude");
		longitude=js.getFloat("location_suggestions[0].longitude");
		city_id=js.getInt("location_suggestions[0].city_id");
		
	}
	
	@Test(priority=2)		
	public void getCusisines() {
		Response response=given()
									.spec(requestspec)
									.queryParam(CITY_ID, city_id)
									.queryParam(LATTITUDE, lattitude)
									.queryParam(LONGITUDE, longitude)
									
						.get(CUISINES);
		
		JsonPath js=new JsonPath(response.asString());
		listofcuisines=js.getList("cuisines");
		for(int i=0;i<listofcuisines.size();i++) {
			if(js.get("cuisines["+i+"].cuisine.cuisine_name").toString().contains("Continental")
					||js.get("cuisines["+i+"].cuisine.cuisine_name").toString().contains("Indian")) {
				desiredres.add(js.get("cuisines["+i+"].cuisine.cuisine_id").toString());
				
			}
		}
	}
	
	@Test(priority=3)		
	public void getEstablishment() {
		Response response=given()
									.spec(requestspec)
									.queryParam(CITY_ID, city_id)
									.queryParam(LATTITUDE, lattitude)
									.queryParam(LONGITUDE, longitude)
									
						.get(ESTABLISHMENTS);
		
		JsonPath js=new JsonPath(response.asString());
		listofestb=js.getList("establishments");
		for(int i=0;i<listofestb.size();i++) {
			if(js.get("establishments["+i+"].establishment.name").toString().contains("Bar")){
			 estb_id=js.getInt("establishments["+i+"].establishment.id");
			 break;
			}
			
		}
		
	}
	
	
	@Test(priority=4)		
	public void getCategory() {
		Response response=given()
								.spec(requestspec)
						  .get(CATEGORIES);
		
		JsonPath js=new JsonPath(response.asString());
		category=js.getList("categories");
		for(int i=0;i<category.size();i++) {
			if(js.get("categories["+i+"].categories.name").toString().contains("Dinner")){
				category_id=js.getInt("categories["+i+"].categories.id");
			 break;
			}
			
		}
		
	}
	
	

	
	@Test(priority=5)		
	public void recommendRestaurant() {

	Response response=	given()
				.spec(requestspec)
				.queryParam(ENTITY_ID, entity_id)
				.queryParam(ENTITY_TYPE, ENTITY_TYPE_CITY)
				.queryParam(LATTITUDE, lattitude)
				.queryParam(LONGITUDE, longitude)
				.queryParam(RADIUS, "3")
				.queryParam(CUISINESTYPE, String.join(",", desiredres))
				.queryParam(CATEGORY, category_id)
				.queryParam(ESTABLISHMENT_TYPE, estb_id)
				.queryParam(SORT, "cost")
		.when().get(SEARCH);
	
	JsonPath js=new JsonPath(response.asString());
	
	//System.out.println(js.prettify());
    
	finalout=js.getList("restaurants");
   
	for(int i=0;i<finalout.size();i++) {
    	if(js.getInt("restaurants["+i+"].restaurant.average_cost_for_two")>=1500 && js.getInt("restaurants["+i+"].restaurant.average_cost_for_two")<=2000) {
    		System.out.println("Restuarant no"+i);
    		System.out.println("Name of Restaurant"+js.get("restaurants["+i+"].restaurant.name").toString());
    		System.out.println("Price for Two"+js.get("restaurants["+i+"].restaurant.average_cost_for_two").toString());
    	}
    }
	
				
	}
}

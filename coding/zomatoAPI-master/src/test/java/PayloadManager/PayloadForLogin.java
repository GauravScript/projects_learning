package PayloadManager;

public class PayloadForLogin {
	
	
	public static String validLogin() {
		return "{\n" + 
				"   \"lotto\":{\n" + 
				"      \"lottoId\":5,\n" + 
				"      \"winning-numbers\":[2,45,34,23,7,5,3],\n" + 
				"      \"winners\":[\n" + 
				"         {\n" + 
				"            \"winnerId\":23,\n" + 
				"            \"numbers\":[2,45,34,23,3,5]\n" + 
				"         },\n" + 
				"         {\n" + 
				"            \"winnerId\":54,\n" + 
				"            \"numbers\":[52,3,12,11,18,22]\n" + 
				"         }\n" + 
				"      ]\n" + 
				"   }\n" + 
				"}";
	}

}

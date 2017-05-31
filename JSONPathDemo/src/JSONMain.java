import java.io.File;
import java.io.IOException;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class JSONMain {


	//testing
	public static void main(String[] args) throws IOException {
		
		String jsonpathCreatorNamePath = "$['tool']['jsonpath']['creator']['name']";
		String jsonpathCreatorLocationPath = "$['tool']['jsonpath']['creator']['location'][*]";
		
//		String jsonDataSourceString = "";
//		DocumentContext jsonContext = JsonPath.parse(jsonDataSourceString);
		
		File f = new File("C:\\Users\\vikrant\\Desktop\\jsonfile.txt");
		
		DocumentContext jsonContext = JsonPath.parse(f);
		String jsonpathCreatorName = jsonContext.read(jsonpathCreatorNamePath);
		
		System.out.println(jsonpathCreatorName);
		
//		List<String> jsonpathCreatorLocation = 
		Object read = jsonContext.read(jsonpathCreatorLocationPath);
		
		System.out.println(read);

	}

}


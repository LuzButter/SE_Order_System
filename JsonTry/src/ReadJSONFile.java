import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJSONFile {

    public static void main(String[] args)
    {
        JSONParser parser = new JSONParser();

        try
        {
            Object obj = parser.parse(new FileReader("myJSON.json"));
            JSONObject jsonObject = (JSONObject) obj; 
            String name = (String) jsonObject.get("name");
            System.out.println(name);

            JSONArray gameArray = (JSONArray) jsonObject.get("game");
            Iterator<String> iterator = gameArray.iterator();

            while(iterator.hasNext())
            {
                System.out.println("game : " + iterator.next());
            }

        }

        catch(FileNotFoundException e){e.printStackTrace();}
        catch(IOException e){e.printStackTrace();}
        catch(ParseException e){e.printStackTrace();}
        catch(Exception e){e.printStackTrace();}
    }
    
}

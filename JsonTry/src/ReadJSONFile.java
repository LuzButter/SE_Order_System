import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

import javax.imageio.ImageReadParam;

import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJSONFile {

    public static String readState(String table)
    {
        JSONParser parser = new JSONParser();

        try
        {
            Object obj = parser.parse(new FileReader("myJSON.json"));
            JSONObject jsonObject = (JSONObject) obj; 
            JSONObject Table =(JSONObject)jsonObject.get(table);
            String state = (String) Table.get("State");
            System.out.println("State of "+table+" is "+state);

            return state;

            // JSONArray gameArray = (JSONArray) jsonObject.get("game");
            // Iterator<String> iterator = gameArray.iterator();

            // while(iterator.hasNext())
            // {
            //     System.out.println("game : " + iterator.next());
            // }

        }

        catch(FileNotFoundException e){e.printStackTrace();}
        catch(IOException e){e.printStackTrace();}
        catch(ParseException e){e.printStackTrace();}
        catch(Exception e){e.printStackTrace();}

        return "error";
    }

    public static String[] readOrder(String table)
    {
        JSONParser parser = new JSONParser();

        try
        {
            Object obj = parser.parse(new FileReader("myJSON.json"));
            JSONObject jsonObject = (JSONObject) obj; 
            //System.out.println(jsonObject);
            JSONObject TableJSON =(JSONObject)jsonObject.get(table);
            //System.out.println(TableJSON);
            JSONArray orderArray = (JSONArray) TableJSON.get("Order");
            //System.out.println(orderArray);

            Object[] array = orderArray.toArray();
            String[] stringArray = Arrays.copyOf(array, array.length, String[].class);

            return stringArray;

        }

        catch(FileNotFoundException e){e.printStackTrace();}
        catch(IOException e){e.printStackTrace();}
        catch(ParseException e){e.printStackTrace();}
        catch(Exception e){e.printStackTrace();}
        return null;

    }
    
}

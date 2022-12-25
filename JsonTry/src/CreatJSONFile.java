import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreatJSONFile {

    public static void main(String[] args){
        JSONObject obj = new JSONObject();

        obj.put("name","jason");
        obj.put("sex","male");

        JSONArray list = new JSONArray();
        list.add("Minecraft");
        list.add("Overwatch");

        obj.put("game",list);

        try(FileWriter file= new FileWriter("myJSON.json"))
        {
            file.write(obj.toString());
            file.flush();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        System.out.println(obj);

    }   
    
}

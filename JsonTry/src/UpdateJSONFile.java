import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class UpdateJSONFile {

    public static void init(String[] args)
    {
        JSONParser parser = new JSONParser();

        try
        {
            Object obj = parser.parse(new FileReader("myJSON.json"));
            JSONObject jsonObject = (JSONObject) obj; 
           
        }

        catch(FileNotFoundException e){e.printStackTrace();}
        catch(IOException e){e.printStackTrace();}
        catch(ParseException e){e.printStackTrace();}
        catch(Exception e){e.printStackTrace();}
    }

    public static void AddOrder(String table, String dish)
    {
        JSONParser parser = new JSONParser();
        try
        {
            Object obj = parser.parse(new FileReader("myJSON.json"));
            JSONObject jsonObject = (JSONObject) obj; 
            JSONObject TableObject = (JSONObject) jsonObject.get(table);
            JSONArray order = (JSONArray)TableObject.get("Order");

            order.add(dish);

            TableObject.put("Order", order);

            jsonObject.put(table, TableObject);

            //System.out.println(TableObject);

            UpdateJSON(jsonObject);
            System.out.println("Add Order " + dish + "to "+table);
        }

        catch(FileNotFoundException e){e.printStackTrace();}
        catch(IOException e){e.printStackTrace();}
        catch(ParseException e){e.printStackTrace();}
        catch(Exception e){e.printStackTrace();}
    }
    
    public static void RemoveOrder(String table, String dish)
    {
        JSONParser parser = new JSONParser();
        try
        {
            Object obj = parser.parse(new FileReader("myJSON.json"));
            JSONObject jsonObject = (JSONObject) obj; 
            JSONObject TableObject = (JSONObject) jsonObject.get(table);
            JSONArray order = (JSONArray)TableObject.get("Order");

            order.remove(dish);

            TableObject.put("Order", order);

            jsonObject.put(table, TableObject);

            //System.out.println(TableObject);

            UpdateJSON(jsonObject);
            System.out.println("Remove Order : " + dish);
        }

        catch(FileNotFoundException e){e.printStackTrace();}
        catch(IOException e){e.printStackTrace();}
        catch(ParseException e){e.printStackTrace();}
        catch(Exception e){e.printStackTrace();}
    }

    public static void RemoveAllOrder(String table)
    {
        JSONParser parser = new JSONParser();
        try
        {
            Object obj = parser.parse(new FileReader("myJSON.json"));
            JSONObject jsonObject = (JSONObject) obj; 
            JSONObject TableObject = (JSONObject) jsonObject.get(table);
            JSONArray order = new JSONArray();

            TableObject.put("Order", order);

            jsonObject.put(table, TableObject);

            //System.out.println(TableObject);

            UpdateJSON(jsonObject);
            System.out.println("Remove All Order Of " + table);
        }

        catch(FileNotFoundException e){e.printStackTrace();}
        catch(IOException e){e.printStackTrace();}
        catch(ParseException e){e.printStackTrace();}
        catch(Exception e){e.printStackTrace();}
    }
    
    public static void SwitchState(String table, String imput)
    {
        JSONParser parser = new JSONParser();
        try
        {
            Object obj = parser.parse(new FileReader("myJSON.json"));
            JSONObject jsonObject = (JSONObject) obj; 
            JSONObject TableObject = (JSONObject) jsonObject.get(table);
            String state = (String)TableObject.get("State");

            state = imput;

            TableObject.put("State", state);
            jsonObject.put(table, TableObject);

            //System.out.println(TableObject);

            UpdateJSON(jsonObject);
            System.out.println("Change "+ table + " State to " + state);
        }

        catch(FileNotFoundException e){e.printStackTrace();}
        catch(IOException e){e.printStackTrace();}
        catch(ParseException e){e.printStackTrace();}
        catch(Exception e){e.printStackTrace();}
    }

    public static void UpdateJSON(JSONObject obj)
    {
        try(FileWriter file= new FileWriter("myJSON.json"))
        {
            file.write(obj.toString());
            file.flush();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        //System.out.println(obj);
    }
}
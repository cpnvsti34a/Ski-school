/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 *
 * @author Lionel.MARMIER
 */
public class UserService {
    
    private String phrase;
    
    public UserService(){
    }
    
    public String retour(String urlPassed) throws MalformedURLException, IOException{
        
        URL url = new URL(urlPassed);
        InputStream response = url.openStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(response));
        phrase = "";
        for (String line; (line = reader.readLine()) != null;) {
            phrase += line;
        }
        reader.close();
        System.out.print(phrase.toString());
        return "Voici la chaine envoyée : " + phrase.toString();
    }
    
    public String create(String data){
        String ln = "";
        
        try{   
            //Construct data
            //String donnee = URLEncoder.encode("id", "UTF-8") + "=" + URLEncoder.encode(data, "UTF-8"); 
            
            //Send data
            URL url = new URL("http://localhost:3000/users/test.json");
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();
            System.out.print(data);
            //Get the response
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            while((line = rd.readLine()) != null){
                ln += line;
            }
            wr.close();
            rd.close();
            
        }catch(Exception e){
            System.out.print(e);
        }
        return ln + "Utilisateurs Créer";
    }
}

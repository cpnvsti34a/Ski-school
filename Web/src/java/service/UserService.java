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
<<<<<<< HEAD
import java.net.URLEncoder;
=======
>>>>>>> 5693524e46cac565afeeeac23a7e10946a7856fa

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
<<<<<<< HEAD
            String donnee = URLEncoder.encode("key1", "UTF-8") + "=" + URLEncoder.encode(data, "UTF-8"); 
            
            //Send data
            URL url = new URL("http://localhost:3000/users/test.xml");
=======
            //String donnee = URLEncoder.encode("id", "UTF-8") + "=" + URLEncoder.encode(data, "UTF-8"); 
            
            //Send data
            URL url = new URL("http://localhost:3000/users/test.json");
>>>>>>> 5693524e46cac565afeeeac23a7e10946a7856fa
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();
<<<<<<< HEAD
            System.out.print(donnee);
=======
            System.out.print(data);
>>>>>>> 5693524e46cac565afeeeac23a7e10946a7856fa
            //Get the response
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            while((line = rd.readLine()) != null){
                ln += line;
            }
<<<<<<< HEAD
            
        }catch(Exception e){
            
        }
        return ln;
=======
            wr.close();
            rd.close();
            
        }catch(Exception e){
            System.out.print(e);
        }
        return ln + "Utilisateurs Créer";
>>>>>>> 5693524e46cac565afeeeac23a7e10946a7856fa
    }
}

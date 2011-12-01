/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

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
        phrase = "<nobalise>";
        for (String line; (line = reader.readLine()) != null;) {
            phrase += line;
        }
        phrase += "</nobalise>";
        reader.close();
        return "Voici la chaine envoyée : " + phrase.toString();
    }
}

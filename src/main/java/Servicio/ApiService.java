/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

/**
 *
 * @author Jurbano
 */

import modelo.Post;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import static one.xingyi.core.http.JavaHttpClient.httpClient;
import org.json.JSONObject;

public class ApiService {
    private static final HttpClient httpclient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
    private static final String API_URL="https://jsonplaceholder.typicode.com/posts"; //endpoints
    public Post getPost(int id) throws IOException, InterruptedException{
        // construimos la petición
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(API_URL+id)).header("Accept", "Application/json").build();
        
        //enviar la peticion
        HttpResponse <String> response = httpclient.send(request, HttpResponse.BodyHandlers.ofString()) ;
        
        //verificar que no responda
        if(response.statusCode()!=200){
            System.out.println("error: "+response.statusCode());
        }
        
        // mapear el json
        String jsonString = response.body();
        
        //crear un jsonObject
        JSONObject jsonObject = new JSONObject(jsonString);
        Post post = new Post(jsonObject);
        
        return post;
    }            
}

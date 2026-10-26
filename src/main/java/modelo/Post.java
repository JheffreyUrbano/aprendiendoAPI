/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jurbano
 */

import org.json.JSONObject;

public class Post {
    private int userID;
    private int id;
    private String title;
    private String body;

    public Post(int userID, int id, String title, String body) {
        this.userID = json.getInt("userID");
        this.id = json.getInt("id");
        this.title = json.getString("title");
        this.body = json.getString("body");
    }
    
    // getters y setters
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    
    
    //
    @override
    public String toString(){
        return "post(id: "+id+", title: "+title+", body: "+body")";
    }
    
    
}

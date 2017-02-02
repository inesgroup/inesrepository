/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp;

/**
 *
 * @author Nitroman
 */
public class ObjectDetail {
    private int id_object;
    private String type;
    private String name;
    private String author;
    private String publish;
    private String date;
    private String pages;
    
    public int getId_object(){
        return id_object;
    }
    public void setId_object(int id_object){
        this.id_object = id_object;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getPublish(){
        return publish;
    }
    public void setPublish(String publish){
        this.publish = publish;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getPages(){
        return pages;
    }
    public void setPages(String pages){
        this.pages = pages;
    }
    
}

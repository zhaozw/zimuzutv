package com.skyland.zimuzutv.zimuzutv.MVP.Entity;

/**
 * Created by skyland on 2016/12/1.
 */

public class BannerDto {
    private String id;
    private String title;
    private String type;
    private String poster;
    private String dateline;

    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getType(){
        return type;
    }
    public String getPoster(){
        return poster;
    }
    public String getDateline(){
        return dateline;
    }


    public void setId (String id){
        this.id = id;
    }
    public void setTitle (String title){
        this.title = title;
    }
    public void setType (String type){
        this.type = type;
    }
    public  void setPoster (String poster){
    this.poster = poster;
}
    public void setDateline(String dateline){
        this.dateline = dateline;
    }


}

package com.restapidynamic;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Videos {

    @Id
    @GeneratedValue
    private long  video_id;
    private String title;
    private  String descriptions;
    private String link;

    public long getVideo_id() {
        return video_id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public String getLink() {
        return link;
    }

    public void setVideo_id(long video_id) {
        this.video_id = video_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Videos{" +
                "video_id=" + video_id +
                ", title='" + title + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}

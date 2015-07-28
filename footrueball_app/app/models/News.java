package models;

import javax.persistence.*;

/**
 * Created by Admin on 13/07/2015.
 */

@Entity
@Table(name="news")
public class News {

    @javax.persistence.Id
    @GeneratedValue
    public Long id;

    public String tittle;

    public String subtittle;

    public String description;

    public String photo_url;

    public String article_url;

    public String category;

    public int decision;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "newspapper_id")
    public Newspapper newspapper_obj;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_id")
    public Team team_obj;

}

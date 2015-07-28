package models;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;

/**
 * Created by Admin on 13/07/2015.
 */

@Entity
@Table(name="comment")
public class Comment {

    @javax.persistence.Id
    @GeneratedValue
    public Long id;

    @JsonInclude
    public String content;

    @JsonInclude
    public Boolean state;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    public User user_obj;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "news_id")
    public News news_obj;


}

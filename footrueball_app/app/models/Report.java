package models;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;

/**
 * Created by Admin on 13/07/2015.
 */

@Entity
@Table(name="report")
public class Report {

    @javax.persistence.Id
    @GeneratedValue
    public Long id;

    @JsonInclude
    public String title;

    @JsonInclude
    public String content;

    @JsonInclude
    public String admin_response;

    @JsonInclude
    public int state;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_reporter_id")
    public User user_reporter_obj;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_disrespectfull_id")
    public User user_disrespectfull_obj;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "news_id")
    public News news_obj;
}

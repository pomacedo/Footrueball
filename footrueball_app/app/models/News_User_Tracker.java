package models;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Admin on 13/07/2015.
 */

@Entity
@Table(name="news_user_tracker")
public class News_User_Tracker {

    @EmbeddedId
    public NewsUserTrackerID primary_key;

    @GeneratedValue
    @JsonInclude
    public Long id;

    @JsonInclude
    public int response_value;

    @JsonInclude
    public DateTime date;
}

@Embeddable
class NewsUserTrackerID implements Serializable {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    public User user_obj;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "news_id")
    public News news_obj;
}

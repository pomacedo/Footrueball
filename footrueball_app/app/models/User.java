package models;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.joda.time.DateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Created by Admin on 13/07/2015.
 */
@Entity
@Table(name = "user",uniqueConstraints=
@UniqueConstraint(columnNames = {"email","user_name"}))
public class User {

    @javax.persistence.Id
    @GeneratedValue
    public Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String first_name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String last_name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String user_name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DateTime birthday;

    @JsonInclude
    public String location;

    @JsonInclude
    public String country;

    @JsonInclude
    public String photo_url;

    @JsonInclude
    public String token;

    @JsonInclude
    public int state;

    @JsonInclude
    public Long score;
}
package models;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

/**
 * Created by Admin on 13/07/2015.
 */

@Entity
@Table(name="team")
public class Team {

    @javax.persistence.Id
    @GeneratedValue
    public Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String name;

    @JsonInclude
    public String site_url;

    @JsonInclude
    public String logo_url;
}

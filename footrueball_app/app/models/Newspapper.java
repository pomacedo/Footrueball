package models;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

/**
 * Created by Admin on 13/07/2015.
 */

@Entity
@Table(name="newspapper")
public class Newspapper {

    @javax.persistence.Id
    @GeneratedValue
    public Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String name;

    @JsonInclude
    public String feed_url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String site_url;

    @JsonInclude
    public String logo_url;

    @JsonInclude
    public Long score;
}

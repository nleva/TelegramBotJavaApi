package org.telegram.telegrambots.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @date	2016-08-09
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class User extends ApiObject{
    Long id; ///< Unique identifier for this user or bot
    @JsonProperty("first_name") String firstName; ///< User‘s or bot’s first name
    @JsonProperty("last_name") String lastName; ///< Optional. User‘s or bot’s last name
    @JsonProperty("user_name") String userName; ///< Optional. User‘s or bot’s username

}

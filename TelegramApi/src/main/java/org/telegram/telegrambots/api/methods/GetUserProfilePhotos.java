package org.telegram.telegrambots.api.methods;

import javax.ws.rs.Path;

import org.telegram.telegrambots.api.methods.send.ApiMethod;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Use this method to get a list of profile pictures for a user. Returns a UserProfilePhotos object.
 * @date	2016-11-21
 */
@Path("getuserprofilephotos")
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class GetUserProfilePhotos extends ApiMethod {

    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id") Integer userId; 
    /**
     * Sequential number of the first photo to be returned. By default, all photos are returned.
     */
    Integer offset;
    /**
     * Optional. Limits the number of photos to be retrieved. Values between 1—100 are accepted. Defaults to 100.
     */
    Integer limit;
}

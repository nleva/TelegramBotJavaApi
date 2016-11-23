package org.telegram.telegrambots.api.objects;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief This object represent a user's profile pictures.
 * @date	2016-11-22
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class UserProfilePhotos extends ApiObject {
    @JsonProperty("total_count") Integer totalCount; ///< Total number of profile pictures the target user has
    List<List<PhotoSize>> photos; ///< Requested profile pictures (in up to 4 sizes each)

}

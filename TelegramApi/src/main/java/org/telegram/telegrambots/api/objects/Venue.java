package org.telegram.telegrambots.api.objects;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief This object represents a venue.
 * @date	2016-11-22
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Venue extends ApiObject {
    Location location; ///< Venue location
    String title; ///< Name of the venue
    String address; ///< Address of the venue
    @JsonProperty("foursquare_id") String foursquareId; ///< Optional. Foursquare identifier of the venue

}

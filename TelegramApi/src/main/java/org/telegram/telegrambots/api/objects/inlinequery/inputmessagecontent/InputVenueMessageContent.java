package org.telegram.telegrambots.api.objects.inlinequery.inputmessagecontent;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Represents the content of a venue message to be sent as the result of an inline query.
 * @note This will only work in Telegram versions released after 9 April, 2016. Older clients will
 * ignore them.
 * @date	2016-11-22
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InputVenueMessageContent extends InputMessageContent{
    Float latitude; ///< Latitude of the venue in degrees
    Float longitude; ///< Longitude of the venue in degrees
    String title; ///< Name of the venue
    String address; ///< Address of the venue
    String foursquareId; ///< Optional. Foursquare identifier of the venue, if known

}

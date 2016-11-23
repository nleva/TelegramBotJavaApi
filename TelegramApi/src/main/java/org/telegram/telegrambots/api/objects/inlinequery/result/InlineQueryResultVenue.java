package org.telegram.telegrambots.api.objects.inlinequery.result;

import org.telegram.telegrambots.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Represents a venue. By default, the venue will be sent by the user. Alternatively, you can
 * use input_message_content to send a message with the specified content instead of the venue.
 * @note This will only work in Telegram versions released after 9 April, 2016. Older clients will
 * ignore them.
 * @date 10 of April of 2016
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InlineQueryResultVenue extends InlineQueryResult{
    String id; ///< Unique identifier of this result, 1-64 bytes
    String title; ///< Optional. Location title
    Float latitude; ///< Venue latitude in degrees
    Float longitude; ///< Venue longitude in degrees
    String address; ///< Address of the venue
    @JsonProperty("foursquare_id") String foursquareId; ///< Optional. Foursquare identifier of the venue if known
    @JsonProperty("reply_markup") InlineKeyboardMarkup replyMarkup; ///< Optional. Inline keyboard attached to the message
    @JsonProperty("input_message_content") InputMessageContent inputMessageContent; ///< Optional. Content of the message to be sent
    @JsonProperty("thumb_url") String thumbUrl; ///< Optional. URL of the thumbnail (jpeg only) for the file
    @JsonProperty("thumb_width") Integer thumbWidth; ///< Optional. Thumbnail width
    @JsonProperty("thumb_height") Integer thumbHeight; ///< Optional. Thumbnail height

}

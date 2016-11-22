package org.telegram.telegrambots.api.methods.send;

import javax.ws.rs.Path;

import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboard;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Use this method to send information about a venue. On success, the sent Message is
 * returned.
 * @date 10 of April of 2016
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
@Path("sendVenue")
public class SendVenue extends ApiMethod {
	String chatId; ///< Unique identifier for the chat to send the message to (Or username for channels)
    Float latitude; ///< Latitude of venue location
    Float longitude; ///< Longitude of venue location
    String title; ///< Title of the venue
    /**
     * Optional. Sends the message silently. iOS users will not receive a notification, Android
     * users will receive a notification with no sound. Other apps coming soon
     */
    Boolean disableNotification;
    String address; ///< Address of the venue
    String foursquareId; ///< Optional. Foursquare identifier of the venue
    Integer replyToMessageId; ///< Optional. If the message is a reply, ID of the original message
    ReplyKeyboard replyMarkup; ///< Optional. JSON-serialized object for a custom reply keyboard

    
}

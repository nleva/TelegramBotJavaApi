package org.telegram.telegrambots.api.methods.send;

import javax.ws.rs.Path;

import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboard;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Use this method to send information about user contact. On success, the sent Message is
 * returned.
 * @date	2016-11-21
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
@Path("sendContact")
public class SendContact extends ApiMethod {
    String chatId; ///< Unique identifier for the chat to send the message to (Or username for channels)
    String phoneNumber; ///< User's phone number
    String firstName; ///< User's first name
    String lastName; ///< Optional. User's last name
    /**
     * Optional. Sends the message silently. iOS users will not receive a notification, Android
     * users will receive a notification with no sound. Other apps coming soon
     */
    Boolean disableNotification;
    Integer replyToMessageId; ///< Optional. If the message is a reply, ID of the original message
    ReplyKeyboard replyMarkup; ///< Optional. JSON-serialized object for a custom reply keyboard

}

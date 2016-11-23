package org.telegram.telegrambots.api.methods.send;

import java.io.File;
import java.io.InputStream;

import javax.ws.rs.Path;

import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboard;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Use this method to send photos. On success, the sent Message is returned.
 * @date	2016-11-21
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
@Path("sendphoto")
public class SendPhoto extends ApiMethod{
    @JsonProperty("chat_id") String chatId; ///< Unique identifier for the chat to send the message to (Or username for channels)
    String photo; ///< Photo to send. file_id as String to resend a photo that is already on the Telegram servers
    String caption; ///< Optional Photo caption (may also be used when resending photos by file_id).
    /**
     * Optional. Sends the message silently. iOS users will not receive a notification, Android
     * users will receive a notification with no sound. Other apps coming soon
     */
    @JsonProperty("disable_notification") Boolean disableNotification;
    @JsonProperty("reply_to_message_id") Integer replyToMessageId; ///< Optional. If the message is a reply, ID of the original message
    @JsonProperty("reply_markup") ReplyKeyboard replyMarkup; ///< Optional. JSON-serialized object for a custom reply keyboard

    @JsonProperty("is_new_photo") boolean isNewPhoto; ///< True if the photo must be uploaded from a file, file if it is a fileId
    @JsonProperty("photo_name") String photoName; ///< Name of the photo
    @JsonProperty("new_photo_file") File newPhotoFile; // New photo file
    @JsonProperty("new_photo_stream") InputStream newPhotoStream; // New photo stream

}

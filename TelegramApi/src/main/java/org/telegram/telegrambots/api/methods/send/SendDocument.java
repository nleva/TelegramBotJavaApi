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
 * @brief Use this method to send general files. On success, the sent Message is returned.
 * @date	2016-11-21
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
@Path("senddocument")
public class SendDocument extends ApiMethod{
    String chatId; ///< Unique identifier for the chat to send the message to or Username for the channel to send the message to
    String document; ///< File file to send. file_id as String to resend a file that is already on the Telegram servers
    String caption; ///< Optional. Document caption (may also be used when resending documents by file_id), 0-200 characters
    /**
     * Optional. Sends the message silently. iOS users will not receive a notification, Android
     * users will receive a notification with no sound. Other apps coming soon
     */
    Boolean disableNotification;
    Integer replyToMessageId; ///< Optional. If the message is a reply, ID of the original message
    ReplyKeyboard replyMarkup; ///< Optional. JSON-serialized object for a custom reply keyboard

    boolean isNewDocument; ///< True to upload a new document, false to use a fileId
    String documentName;
    File newDocumentFile; ///< New document file
    InputStream newDocumentStream; ///< New document stream

}

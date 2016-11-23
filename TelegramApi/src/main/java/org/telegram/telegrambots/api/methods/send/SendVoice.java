package org.telegram.telegrambots.api.methods.send;

import java.io.File;
import java.io.InputStream;

import javax.ws.rs.Path;

import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboard;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Use this method to send voice notes, if you want Telegram clients to display the file as a
 * playable voice message. For this to work, your audio must be in an .ogg file encoded with OPUS
 * (other formats may be sent as Audio or Document).
 * @date	2016-11-21
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
@Path("sendvoice")
public class SendVoice extends ApiMethod{

    @JsonProperty("chat_id") String chatId; ///< Unique identifier for the chat sent message to (Or username for channels)
    String voice; ///< Audio file to send. You can either pass a file_id as String to resend an audio that is already on the Telegram servers, or upload a new audio file using multipart/form-data.
    /**
     * Optional. Sends the message silently. iOS users will not receive a notification, Android
     * users will receive a notification with no sound. Other apps coming soon
     */
    @JsonProperty("disable_notification") Boolean disableNotification;
    @JsonProperty("reply_to_message_id") Integer replyToMessageId; ///< Optional. If the message is a reply, ID of the original message
    @JsonProperty("reply_markup") ReplyKeyboard replyMarkup; ///< Optional. JSON-serialized object for a custom reply keyboard
    Integer duration; ///< Optional. Duration of sent audio in seconds

    @JsonProperty("is_new_voice") boolean isNewVoice; ///< True to upload a new voice note, false to use a fileId
    @JsonProperty("voice_name") String voiceName; ///< Name of the voice note
    @JsonProperty("new_voice_file") File newVoiceFile; ///< New voice note file
    @JsonProperty("new_voice_stream") InputStream newVoiceStream; ///< New voice note stream

}

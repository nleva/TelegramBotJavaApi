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
 * @brief Use this method to send .webp stickers. On success, the sent Message is returned.
 * @date	2016-11-21
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
@Path("sendsticker")
public class SendSticker extends ApiMethod{
    @JsonProperty("chat_id") String chatId; ///< Unique identifier for the chat to send the message to (Or username for channels)
    String sticker; ///< Sticker file to send. file_id as String to resend a sticker that is already on the Telegram servers
    /**
     * Optional. Sends the message silently. iOS users will not receive a notification, Android
     * users will receive a notification with no sound. Other apps coming soon
     */
    @JsonProperty("disable_notification") Boolean disableNotification;
    @JsonProperty("reply_to_message_id") Integer replyToMessageId; ///< Optional. If the message is a reply, ID of the original message
    @JsonProperty("reply_markup") ReplyKeyboard replyMarkup; ///< Optional. JSON-serialized object for a custom reply keyboard

    @JsonProperty("is_new_sticker") boolean isNewSticker; ///< True to upload a new sticker, false to use a fileId
    @JsonProperty("sticker_name") String stickerName;
    @JsonProperty("new_sticker_file") File newStickerFile; ///< New sticker file
    @JsonProperty("new_sticker_stream") InputStream newStickerStream; ///< New sticker stream
}

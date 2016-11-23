package org.telegram.telegrambots.api.methods.updatingmessages;

import javax.ws.rs.Path;

import org.telegram.telegrambots.api.methods.send.ApiMethod;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Use this method to edit captions of messages sent by the bot or via the bot (for inline
 * bots). On success, the edited Message is returned
 * @date 10 of April of 2016
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
@Path("editmessagecaption")
public class EditMessageCaption extends ApiMethod {
    /**
     * Required if inline_message_id is not specified. Unique identifier for the chat to send the
     * message to (Or username for channels)
     */
    @JsonProperty("chat_id") String chatId;
    /**
     * Required if inline_message_id is not specified. Unique identifier of the sent message
     */
    @JsonProperty("message_id") Integer messageId;
    /**
     * Required if chat_id and message_id are not specified. Identifier of the inline message
     */
    @JsonProperty("inline_message_id") String inlineMessageId;
    String caption; ///< Optional. New caption of the message
    @JsonProperty("reply_markup") InlineKeyboardMarkup replyMarkup; ///< Optional. A JSON-serialized object for an inline keyboard.

    
}

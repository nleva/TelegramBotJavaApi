package org.telegram.telegrambots.api.methods.updatingmessages;

import javax.ws.rs.Path;

import org.telegram.telegrambots.api.methods.send.ApiMethod;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Use this method to edit text messages sent by the bot or via the bot (for inline bots). On
 * success, the edited Message is returned.
 * @date	2016-11-21
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
@Path("editmessagetext")
public class EditMessageText extends ApiMethod {

    /**
     * Required if inline_message_id is not specified. Unique identifier for the chat to send the
     * message to (Or username for channels)
     */
    String chatId;
    /**
     * Required if inline_message_id is not specified. Unique identifier of the sent message
     */
    Integer messageId;
    /**
     * Required if chat_id and message_id are not specified. Identifier of the inline message
     */
    String inlineMessageId;
    /**
     * New text of the message
     */
    String text;
    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width
     * text or inline URLs in your bot's message.
     */
    String parseMode;
    Boolean disableWebPagePreview; ///< Optional. Disables link previews for links in this message
    InlineKeyboardMarkup replyMarkup; ///< Optional. A JSON-serialized object for an inline keyboard.

}

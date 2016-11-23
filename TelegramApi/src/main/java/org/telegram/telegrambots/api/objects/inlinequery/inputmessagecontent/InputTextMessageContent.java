package org.telegram.telegrambots.api.objects.inlinequery.inputmessagecontent;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Represents the content of a text message to be sent as the result of an inline query.
 * @date	2016-11-22
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InputTextMessageContent extends InputMessageContent{
    @JsonProperty("message_text") String messageText; ///< Text of a message to be sent, 1-4096 characters
    @JsonProperty("parse_mode") String parseMode; ///< Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline URLs in your bot's message.
    @JsonProperty("disable_web_page_preview") Boolean disableWebPagePreview; ///< Optional. Disables link previews for links in the sent message

}

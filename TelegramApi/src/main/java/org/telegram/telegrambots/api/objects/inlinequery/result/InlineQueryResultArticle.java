package org.telegram.telegrambots.api.objects.inlinequery.result;

import org.telegram.telegrambots.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Represents a link to an article or web page.
 * @date 01 of January of 2016
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InlineQueryResultArticle extends InlineQueryResult{
    String id; ///< Unique identifier of this result, 1-64 bytes
    String title; ///< Title of the result
    @JsonProperty("input_message_content") InputMessageContent inputMessageContent; ///< Content of the message to be sent
    @JsonProperty("reply_markup") InlineKeyboardMarkup replyMarkup; ///< Optional. Inline keyboard attached to the message
    String url; ///< Optional. URL of the result
    @JsonProperty("hide_url") Boolean hideUrl; ///< Optional. Pass True, if you don't want the URL to be shown in the message
    String description; ///< Optional. Short description of the result
    @JsonProperty("thumb_url") String thumbUrl; ///< Optional. Url of the thumbnail for the result
    @JsonProperty("thumb_width") Integer thumbWidth; ///< Optional. Thumbnail width
    @JsonProperty("thumb_height") Integer thumbHeight; ///< Optional. Thumbnail height

}

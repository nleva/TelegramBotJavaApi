package org.telegram.telegrambots.api.objects.inlinequery.result;

import org.telegram.telegrambots.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Represents a link to a file. By default, this file will be sent by the user with an
 * optional caption. Alternatively, you can use input_message_content to send a message with the
 * specified content instead of the file.
 * @note Currently, only .PDF and .ZIP files can be sent using this method.
 * @note This will only work in Telegram versions released after 9 April, 2016. Older clients will
 * ignore them.
 * @date 01 of January of 2016
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InlineQueryResultDocument extends InlineQueryResult{
    String id; ///< Unique identifier of this result, 1-64 bytes
    String title; ///< Optional. Title for the result
    @JsonProperty("document_url") String documentUrl; ///< A valid URL for the file
    @JsonProperty("mime_type") String mimeType; ///< Mime type of the content of the file, either “application/pdf” or “application/zip”
    String description; ///< Optional. Short description of the result
    String caption; ///< Optional. Caption of the document to be sent, 0-200 characters
    @JsonProperty("reply_markup") InlineKeyboardMarkup replyMarkup; ///< Optional. Inline keyboard attached to the message
    @JsonProperty("input_message_content") InputMessageContent inputMessageContent; ///< Optional. Content of the message to be sent instead of the file
    @JsonProperty("thumb_url") String thumbUrl; ///< Optional. URL of the thumbnail (jpeg only) for the file
    @JsonProperty("thumb_width") Integer thumbWidth; ///< Optional. Thumbnail width
    @JsonProperty("thumb_height") Integer thumbHeight; ///< Optional. Thumbnail height

}

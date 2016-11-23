package org.telegram.telegrambots.api.objects.inlinequery.result.chached;

import org.telegram.telegrambots.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.api.objects.inlinequery.result.InlineQueryResult;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Represents a link to a file stored on the Telegram servers. By default, this file will be
 * sent by the user with an optional caption. Alternatively, you can use input_message_content to
 * send a message with the specified content instead of the file.
 * @note Currently, only pdf-files and zip archives can be sent using this method.
 * @note This will only work in Telegram versions released after 9 April, 2016. Older clients will
 * ignore them.
 * @date 10 of April of 2016
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InlineQueryResultCachedDocument extends InlineQueryResult{
    String id; ///< Unique identifier of this result, 1-64 bytes
    String title; ///< Optional. Title for the result
    @JsonProperty("document_file_id") String documentFileId; ///< A valid file identifier for the file
    String description; ///< Optional. Short description of the result
    String caption; ///< Optional. Caption of the document to be sent, 0-200 characters
    @JsonProperty("reply_markup") InlineKeyboardMarkup replyMarkup; ///< Optional. Inline keyboard attached to the message
    @JsonProperty("input_message_content") InputMessageContent inputMessageContent; ///< Optional. Content of the message to be sent instead of the file

}

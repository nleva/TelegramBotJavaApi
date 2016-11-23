package org.telegram.telegrambots.api.objects.inlinequery.result.chached;

import org.telegram.telegrambots.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.api.objects.inlinequery.result.InlineQueryResult;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Represents a link to a photo stored on the Telegram servers. By default, this photo will
 * be sent by the user with an optional caption. Alternatively, you can use input_message_content to
 * send a message with the specified content instead of the photo.
 * @date 10 of April of 2016
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InlineQueryResultCachedPhoto extends InlineQueryResult{
    String id; ///< Unique identifier of this result, 1-64 bytes
    @JsonProperty("photo_file_id") String photoFileId; ///< A valid file identifier of the photo
    String title; ///< Optional. Title for the result
    String description; ///< Optional. Short description of the result
    String caption; ///< Optional. Caption of the photo to be sent
    @JsonProperty("input_message_content") InputMessageContent inputMessageContent; ///< Optional. Content of the message to be sent instead of the photo
    @JsonProperty("reply_markup") InlineKeyboardMarkup replyMarkup; ///< Optional. Inline keyboard attached to the message

}

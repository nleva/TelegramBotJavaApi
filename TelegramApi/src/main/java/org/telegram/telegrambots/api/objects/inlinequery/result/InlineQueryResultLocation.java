package org.telegram.telegrambots.api.objects.inlinequery.result;

import org.telegram.telegrambots.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Represents a location on a map. By default, the location will be sent by the user.
 * Alternatively, you can use input_message_content to send a message with the specified content
 * instead of the location.
 * @note This will only work in Telegram versions released after 9 April, 2016. Older clients will
 * ignore them.
 * @date 10 of April of 2016
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InlineQueryResultLocation extends InlineQueryResult{
    String id; ///< Unique identifier of this result, 1-64 bytes
    String title; ///< Optional. Location title
    Float latitude; ///< Location latitude in degrees
    Float longitude; ///< Location longitude in degrees
    InlineKeyboardMarkup replyMarkup; ///< Optional. Inline keyboard attached to the message
    InputMessageContent inputMessageContent; ///< Optional. Content of the message to be sent
    String thumbUrl; ///< Optional. URL of the thumbnail (jpeg only) for the file
    Integer thumbWidth; ///< Optional. Thumbnail width
    Integer thumbHeight; ///< Optional. Thumbnail height
}

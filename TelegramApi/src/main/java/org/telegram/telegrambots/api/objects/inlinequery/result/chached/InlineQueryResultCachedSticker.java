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
 * @brief Represents a link to a sticker stored on the Telegram servers. By default, this sticker
 * will be sent by the user. Alternatively, you can use input_message_content to send a message with
 * the specified content instead of the sticker.
 * @note This will only work in Telegram versions released after 9 April, 2016. Older clients will
 * ignore them.
 * @date 10 of April of 2016
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InlineQueryResultCachedSticker extends InlineQueryResult{
    String id; ///< Unique identifier of this result, 1-64 bytes
    String stickerFileId; ///< A valid file identifier of the sticker
    InputMessageContent inputMessageContent; ///< Optional. Content of the message to be sent instead of the sticker
    InlineKeyboardMarkup replyMarkup; ///< Optional. Inline keyboard attached to the message

}

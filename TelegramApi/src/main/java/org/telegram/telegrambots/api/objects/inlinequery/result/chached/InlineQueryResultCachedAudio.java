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
 * @brief Represents a link to an mp3 audio file stored on the Telegram servers. By default, this
 * audio file will be sent by the user. Alternatively, you can use input_message_content to send a
 * message with the specified content instead of the audio.
 * @note This will only work in Telegram versions released after 9 April, 2016. Older clients will
 * ignore them.
 * @date 10 of April of 2016
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InlineQueryResultCachedAudio extends InlineQueryResult{
    String id; ///< Unique identifier of this result
    String audioFileId; ///< A valid file identifier for the audio file
    InputMessageContent inputMessageContent; ///< Optional. Content of the message to be sent instead of the audio
    InlineKeyboardMarkup replyMarkup; ///< Optional. Inline keyboard attached to the message
}

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
 * @brief Represents a link to an animated GIF file stored on the Telegram servers. By default, this
 * animated GIF file will be sent by the user with an optional caption. Alternatively, you can use
 * input_message_content to send a message with specified content instead of the animation.
 * @date 10 of April of 2016
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InlineQueryResultCachedGif extends InlineQueryResult{
    String id; ///< Unique identifier of this result, 1-64 bytes
    @JsonProperty("gif_file_id") String gifFileId; ///< A valid file identifier for the GIF file
    String title; ///< Optional. Title for the result
    String caption; ///< Optional. Caption of the GIF file to be sent
    @JsonProperty("input_message_content") InputMessageContent inputMessageContent; ///< Optional. Content of the message to be sent instead of the GIF animation
    @JsonProperty("reply_markup") InlineKeyboardMarkup replyMarkup; ///< Optional. Inline keyboard attached to the message

}

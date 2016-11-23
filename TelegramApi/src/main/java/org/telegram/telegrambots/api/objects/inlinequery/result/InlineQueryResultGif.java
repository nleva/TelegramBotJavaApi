package org.telegram.telegrambots.api.objects.inlinequery.result;

import org.telegram.telegrambots.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Represents a link to an animated GIF file. By default, this animated GIF file will be sent
 * by the user with optional caption. Alternatively, you can use input_message_content to send a
 * message with the specified content instead of the animation.
 * @date 01 of January of 2016
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InlineQueryResultGif extends InlineQueryResult{
    String id; ///< Unique identifier of this result, 1-64 bytes
    @JsonProperty("gif_url") String gifUrl; ///< A valid URL for the GIF file. File size must not exceed 1MB
    @JsonProperty("gif_width") Integer gifWidth; ///< Optional. Width of the GIF
    @JsonProperty("gif_height") Integer gifHeight; ///< Optional. Height of the GIF
    @JsonProperty("thumb_url") String thumbUrl; ///< Optional. URL of a static thumbnail for the result (jpeg or gif)
    String title; ///< Optional. Title for the result
    String caption; ///< Optional. Caption of the GIF file to be sent
    @JsonProperty("input_message_content") InputMessageContent inputMessageContent; ///< Optional. Content of the message to be sent instead of the GIF animation
    @JsonProperty("reply_markup") InlineKeyboardMarkup replyMarkup; ///< Optional. Inline keyboard attached to the message
}

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
 * @brief Represents a link to a video animation (H.264/MPEG-4 AVC video without sound). By default,
 * this animated MPEG-4 file will be sent by the user with optional caption. Alternatively, you can
 * use input_message_content to send a message with the specified content instead of the animation.
 * @date 01 of January of 2016
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InlineQueryResultCachedMpeg4Gif extends InlineQueryResult{
    String id; ///< Unique identifier of this result, 1-64 bytes
    String mpeg4FileId; ///< A valid file identifier for the MP4 file
    String title; ///< Optional. Title for the result
    String caption; ///< Optional. Caption of the MPEG-4 file to be sent
    @JsonProperty("input_message_content") InputMessageContent inputMessageContent; ///< Optional. Content of the message to be sent instead of the photo
    @JsonProperty("reply_markup") InlineKeyboardMarkup replyMarkup; ///< Optional. Inline keyboard attached to the message

}

package org.telegram.telegrambots.api.objects.inlinequery.result;

import org.telegram.telegrambots.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Represents a link to an mp3 audio file. By default, this audio file will be sent by the
 * user. Alternatively, you can use input_message_content to send a message with the specified
 * content instead of the audio.
 * @note This will only work in Telegram versions released after 9 April, 2016. Older clients will
 * ignore them.
 * @date	2016-11-22
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InlineQueryResultAudio extends InlineQueryResult{
    String id; ///< Unique identifier of this result
    @JsonProperty("audio_url") String audioUrl; ///< A valid URL for the audio file
    String title; ///< Optional. Title for the result
    String performer; ///< Optional. Performer
    @JsonProperty("audio_duration") Integer audioDuration; ///< Optional. Audio duration in seconds
    @JsonProperty("input_message_content") InputMessageContent inputMessageContent; ///< Optional. Content of the message to be sent instead of the audio
    @JsonProperty("reply_markup") InlineKeyboardMarkup replyMarkup; ///< Optional. Inline keyboard attached to the message

}

package org.telegram.telegrambots.api.objects.inlinequery.result;

import org.telegram.telegrambots.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Represents link to a page containing an embedded video player or a video file.
 * Alternatively, you can use input_message_content to send a message with the specified content
 * instead of the video.
 * @date 01 of January of 2016
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InlineQueryResultVideo extends InlineQueryResult{
    String id; ///< Unique identifier of this result
    String mimeType; ///< Mime type of the content of video url, i.e. “text/html” or “video/mp4”
    String videoUrl; ///< A valid URL for the embedded video player or video file
    Integer videoWidth; ///< Optional. Video width
    Integer videoHeight; ///< Optional. Video height
    Integer videoDuration; ///< Optional. Video duration in seconds
    String thumbUrl; ///< Optional. URL of the thumbnail (jpeg only) for the video
    String title; ///< Optional. Title for the result
    String description; ///< Optional. Short description of the result
    String caption; ///< Optional. Caption of the video to be sent, 0-200 characters
    InputMessageContent inputMessageContent; ///< Optional. Content of the message to be sent instead of the photo
    InlineKeyboardMarkup replyMarkup; ///< Optional. Inline keyboard attached to the message

}

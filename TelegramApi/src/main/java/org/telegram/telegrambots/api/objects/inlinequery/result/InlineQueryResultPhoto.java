package org.telegram.telegrambots.api.objects.inlinequery.result;

import org.telegram.telegrambots.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Represents a link to a photo. By default, this photo will be sent by the user with
 * optional caption. Alternatively, you can use input_message_content to send a message with the
 * specified content instead of the photo.
 * @date 01 of January of 2016
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InlineQueryResultPhoto extends InlineQueryResult{
    String id; ///< Unique identifier of this result, 1-64 bytes
    @JsonProperty("photo_url") String photoUrl; ///< A valid URL of the photo. Photo size must not exceed 5MB
    @JsonProperty("mime_type") String mimeType; ///< Optional. MIME type of the photo, defaults to image/jpeg
    @JsonProperty("photo_width") Integer photoWidth; ///< Optional. Width of the photo
    @JsonProperty("photo_height") Integer photoHeight; ///< Optional. Height of the photo
    @JsonProperty("thumb_url") String thumbUrl; ///< Optional. URL of the thumbnail for the photo
    String title; ///< Optional. Title for the result
    String description; ///< Optional. Short description of the result
    String caption; ///< Optional. Caption of the photo to be sent
    @JsonProperty("input_message_content") InputMessageContent inputMessageContent; ///< Optional. Content of the message to be sent instead of the photo
    @JsonProperty("reply_markup") InlineKeyboardMarkup replyMarkup; ///< Optional. Inline keyboard attached to the message

}

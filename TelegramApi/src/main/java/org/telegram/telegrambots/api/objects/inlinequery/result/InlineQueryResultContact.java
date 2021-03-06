package org.telegram.telegrambots.api.objects.inlinequery.result;

import org.telegram.telegrambots.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Represents a contact with a phone number. By default, this contact will be sent by the
 * user. Alternatively, you can use input_message_content to send a message with the specified
 * content instead of the contact.
 * @note This will only work in Telegram versions released after 9 April, 2016. Older clients will
 * ignore them.
 * @date 10 of April of 2016
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InlineQueryResultContact extends InlineQueryResult{
    String id; ///< Unique identifier of this result, 1-64 bytes
    @JsonProperty("phone_number") String phoneNumber; ///< Contact's phone number
    @JsonProperty("first_name") String firstName; ///< Contact's first name
    @JsonProperty("last_name") String lastName; ///< Contact's last name
    @JsonProperty("reply_markup") InlineKeyboardMarkup replyMarkup; ///< Optional. Inline keyboard attached to the message
    @JsonProperty("input_message_content") InputMessageContent inputMessageContent; ///< Optional. Content of the message to be sent
    @JsonProperty("thumb_url") String thumbUrl; ///< Optional. URL of the thumbnail (jpeg only) for the file
    @JsonProperty("thumb_width") Integer thumbWidth; ///< Optional. Thumbnail width
    @JsonProperty("thumb_height") Integer thumbHeight; ///< Optional. Thumbnail height

}

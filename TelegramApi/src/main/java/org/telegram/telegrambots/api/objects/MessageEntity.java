package org.telegram.telegrambots.api.objects;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief This object represents one special entity in a text message. For example, hashtags,
 * usernames, URL.
 * @date	2016-11-22
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class MessageEntity extends ApiObject{
    /**
     * Type of the entity. One of
     * mention (@username),
     * hashtag,
     * bot_command,
     * url,
     * email,
     * bold (bold text),
     * italic (italic text),
     * code (monowidth string),
     * pre (monowidth block),
     * text_link (for clickable text URLs)
     * text_mention (for users without usernames)
     */
    String type;
    Integer offset; ///< Offset in UTF-16 code units to the start of the entity
    Integer length; ///< Length of the entity in UTF-16 code units
    String url; ///< Optional. For “text_link” only, url that will be opened after user taps on the text
    User user; ///< Optional. For “text_mention” only, the mentioned user

    String text; ///< Text present in the entity. Computed from offset and length

}

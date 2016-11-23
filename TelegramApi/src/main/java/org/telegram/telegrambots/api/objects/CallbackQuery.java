package org.telegram.telegrambots.api.objects;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief This object represents an incoming callback query from a callback button in an inline
 * keyboard. If the button that originated the query was attached to a message sent by the bot, the
 * field message will be presented. If the button was attached to a message sent via the bot (in
 * inline mode), the field inline_message_id will be presented.
 * @date	2016-11-22
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class CallbackQuery extends ApiObject {
    String id; ///< Unique identifier for this query
    User from; ///< Sender
    /**
     * Optional.
     * Message with the callback button that originated the query.
     *
     * @note The message content and message date will not be available if the message is too old
     */
    Message message;
    @JsonProperty("inline_message_id") String inlineMessageId; ///< Optional. Identifier of the message sent via the bot in inline mode, that originated the query
    /**
     * Data associated with the callback button.
     * @note Be aware that a bad client can send arbitrary data in this field
     */
    String data;

}

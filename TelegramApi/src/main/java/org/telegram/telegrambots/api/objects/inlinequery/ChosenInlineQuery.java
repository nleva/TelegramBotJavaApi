package org.telegram.telegrambots.api.objects.inlinequery;

import org.telegram.telegrambots.api.objects.ApiObject;
import org.telegram.telegrambots.api.objects.Location;
import org.telegram.telegrambots.api.objects.User;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Represents a result of an inline query that was chosen by the user and sent to their chat
 * partner.
 * @date	2016-11-22
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class ChosenInlineQuery extends ApiObject{
    private String resultId; ///< The unique identifier for the result that was chosen.
    private User from; ///< The user that chose the result.
    private Location location; ///< Optional. Sender location, only for bots that require user location
    /**
     * Optional.
     * Identifier of the sent inline message.
     * Available only if there is an inline keyboard attached to the message.
     * Will be also received in callback queries and can be used to edit the message.
     */
    private String inlineMessageId;
    private String query; ///< The query that was used to obtain the result.

}

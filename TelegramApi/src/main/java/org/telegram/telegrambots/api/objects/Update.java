package org.telegram.telegrambots.api.objects;

import org.telegram.telegrambots.api.objects.inlinequery.ChosenInlineQuery;
import org.telegram.telegrambots.api.objects.inlinequery.InlineQuery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief This object represents an incoming update.
 * Only one of the optional parameters can be present in any given update.
 * @date 20 of June of 2015
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
@JsonIgnoreProperties(ignoreUnknown=true)
public class Update extends ApiObject{
    Integer updateId;
    Message message; ///< Optional. New incoming message of any kind — text, photo, sticker, etc.
    InlineQuery inlineQuery; ///< Optional. New incoming inline query
    ChosenInlineQuery chosenInlineQuery; ///< Optional. The result of a inline query that was chosen by a user and sent to their chat partner
    CallbackQuery callbackQuery; ///< Optional. New incoming callback query
    Message editedMessage; ///< Optional. New version of a message that is known to the bot and was edited
}

package org.telegram.telegrambots.api.objects.replykeyboard;

import java.util.List;

import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief This object represents a custom keyboard with reply options.
 * @date 20 of June of 2015
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class ReplyKeyboardMarkup extends ReplyKeyboard {
    List<KeyboardRow> keyboard; ///< Array of button rows, each represented by an Array of Strings
    @JsonProperty("resize_keyboard") Boolean resizeKeyboard; ///< Optional. Requests clients to resize the keyboard vertically for optimal fit (e.g., make the keyboard smaller if there are just two rows of buttons). Defaults to false.
    @JsonProperty("one_time_keyboad") Boolean oneTimeKeyboad; ///< Optional. Requests clients to hide the keyboard as soon as it's been used. Defaults to false.
    /**
     * Optional. Use this parameter if you want to show the keyboard to specific users only.
     * Targets:
     *      1) users that are @mentioned in the text of the Message object;
     *      2) if the bot's message is a reply (has reply_to_message_id), sender of the original message.
     */
    Boolean selective;

}

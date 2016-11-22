package org.telegram.telegrambots.api.objects.replykeyboard;

import java.util.List;

import org.telegram.telegrambots.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief This object represents an inline keyboard that appears right next to the message it
 * belongs to
 * @note Inline keyboards are currently being tested and are only available in one-on-one chats
 * (i.e., user-bot or user-user in the case of inline bots).
 * @date 10 of April of 2016
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InlineKeyboardMarkup extends ReplyKeyboard {
    List<List<InlineKeyboardButton>> keyboard; ///< Array of button rows, each represented by an Array of Strings

}

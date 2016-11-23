package org.telegram.telegrambots.api.objects.replykeyboard.buttons;

import org.telegram.telegrambots.api.objects.ApiObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief This object represents one button of an inline keyboard. You must use exactly one of the
 * optional fields.
 * @note This will only work in Telegram versions released after 9 April, 2016. Older clients will
 * display unsupported message.
 * @date 10 of April of 2016
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InlineKeyboardButton extends ApiObject {
    String text; ///< Label text on the button
    String url; ///< Optional. HTTP url to be opened when button is pressed
    @JsonProperty("callback_data") String callbackData; ///< Optional. Data to be sent in a callback query to the bot when button is pressed
    /**
     * Optional.
     * If set, pressing the button will prompt the user to select one of their chats,
     * open that chat and insert the bot‘s username and the specified inline query in the input field.
     * Can be empty, in which case just the bot’s username will be inserted.
     * @Note: This offers an easy way for users to start using your bot in inline mode when
     * they are currently in a chat with it.
     * Especially useful when combined with switch_pm… actions – in this case the user will
     * be automatically returned to the chat they switched from, skipping the chat selection screen.
     */
    @JsonProperty("switch_inline_query") String switchInlineQuery;

    
}

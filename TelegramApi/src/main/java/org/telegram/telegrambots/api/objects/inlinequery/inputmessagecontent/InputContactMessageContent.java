package org.telegram.telegrambots.api.objects.inlinequery.inputmessagecontent;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Represents the content of a contact message to be sent as the result of an inline query
 * @note This will only work in Telegram versions released after 9 April, 2016. Older clients will
 * ignore them.
 * @date	2016-11-22
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InputContactMessageContent extends InputMessageContent {
    String phoneNumber; ///< Contact's phone number
    String firstName; ///< Contact's first name
    String lastName; ///< Optional. Contact's last name

}

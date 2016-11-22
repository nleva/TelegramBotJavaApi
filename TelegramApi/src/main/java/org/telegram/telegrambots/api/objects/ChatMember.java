package org.telegram.telegrambots.api.objects;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief This object contains information about one member of the chat.
 * @date	2016-11-22
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class ChatMember extends ApiObject {

    User user; ///< Information about the user
    String status; ///< The member's status in the chat. Can be “creator”, “administrator”, “member”, “left” or “kicked”

}

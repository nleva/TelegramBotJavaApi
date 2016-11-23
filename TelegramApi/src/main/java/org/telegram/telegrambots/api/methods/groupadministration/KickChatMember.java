package org.telegram.telegrambots.api.methods.groupadministration;

import javax.ws.rs.Path;

import org.telegram.telegrambots.api.methods.send.ApiMethod;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Use this method to kick a user from a group or a supergroup. In the case of supergroups,
 * the user will not be able to return to the group on their own using invite links, etc., unless
 * unbanned first. The bot must be an administrator in the group for this to work. Returns True on
 * success.
 * @note This will method only work if the ‘All Members Are Admins’ setting is off in the target
 * group. Otherwise members may only be removed by the group's creator or by the member that added
 * them.
 * @date	2016-11-21
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
@Path("kickchatmember")
public class KickChatMember extends ApiMethod {
	/**
	 * Unique identifier for the chat to send the message to (Or username for channels)
	 */
    @JsonProperty("chat_id") String chatId; 
    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id") Integer userId; 
}

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
 * @brief Use this method to unban a previously kicked user in a supergroup. The user will not
 * return to the group automatically, but will be able to join via link, etc. The bot must be an
 * administrator in the group for this to work. Returns True on success.
 * @date	2016-11-21
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
@Path("unbanchatmember")
public class UnbanChatMember extends ApiMethod {
	/**
	 * Unique identifier for the chat to send the message to (Or username for channels)
	 */
    @JsonProperty("chat_id") String chatId; 
    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id") Integer userId; 

}

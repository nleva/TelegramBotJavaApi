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
 * @brief Use this method to get information about a member of a chat.
 * Returns a ChatMember object on success.
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
@Path("getChatMember")
public class GetChatMember extends ApiMethod {

	/**
	 * Unique identifier for the chat to send the message to (Or username for channels)
	 */
    @JsonProperty("chat_id") String chatId;
    /**
     * Unique identifier of the target user
     */
    @JsonProperty("user_id") Integer userId; 

}

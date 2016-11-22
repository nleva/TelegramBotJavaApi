package org.telegram.telegrambots.api.methods.groupadministration;

import javax.ws.rs.Path;

import org.telegram.telegrambots.api.methods.send.ApiMethod;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Use this method to get the number of members in a chat. Returns Int on success.
 * @date	2016-11-21
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
@Path("getChatMembersCount")
public class GetChatMemberCount extends ApiMethod {

	/**
	 * Unique identifier for the chat to send the message to (Or username for channels)
	 */
    String chatId;

}
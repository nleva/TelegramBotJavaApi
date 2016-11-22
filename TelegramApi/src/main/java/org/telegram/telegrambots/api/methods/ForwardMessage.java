package org.telegram.telegrambots.api.methods;

import javax.ws.rs.Path;

import org.telegram.telegrambots.api.methods.send.ApiMethod;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Use this method to send text messages. On success, the sent Message is
 *        returned.
 * @date 2016-11-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Path("forwardmessage")
public class ForwardMessage extends ApiMethod {

	/**
	 * < Unique identifier for the chat to
	 * send the message to (or username for
	 * channels)
	 */
	String	chatId;			
	/**
	 * < Unique identifier for the chat
	 * where the original message was sent
	 *  — User or GroupChat id	Integer	messageId;
	 *  < Unique message identifier
	 */
	String	fromChatId;	
	Boolean	disableNotification;
}

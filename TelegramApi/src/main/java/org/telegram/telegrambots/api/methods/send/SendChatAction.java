package org.telegram.telegrambots.api.methods.send;

import javax.ws.rs.Path;

import org.telegram.telegrambots.api.methods.ActionType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Use this method when you need to tell the user that something is happening on the bot's
 * side. The status is set for 5 seconds or less (when a message arrives from your bot, Telegram
 * clients clear its typing status).
 * @date	2016-11-21
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
@Path("sendChatAction")
public class SendChatAction extends ApiMethod {

	/**
	 * Unique identifier for the chat to send the message to (Or username for channels)
	 */
    @JsonProperty("chat_id") String chatId; 
    /**
     * Type of action to broadcast. Choose one, depending on what the user is about to receive:
     * 'typing' for text messages 'upload_photo' for photos 'record_video' or 'upload_video' for
     * videos 'record_audio' or 'upload_audio' for audio files 'upload_document' for general files,
     * 'find_location' for location data.
     */
    ActionType action;

    
}

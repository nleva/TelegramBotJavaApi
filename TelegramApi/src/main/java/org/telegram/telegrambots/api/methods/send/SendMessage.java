package org.telegram.telegrambots.api.methods.send;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Use this method to send text messages. On success, the sent Message is
 * returned.
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @date 2016-11-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SendMessage extends ApiMethod {
	/**
	 * Unique identifier for the target chat or username of the target channel
	 * (in the format @channelusername)
	 */
	@JsonProperty("chat_id") String chatId;
	
	/** Text of the message to be sent */
	String	text;
	
	/**
	 * Send Markdown or HTML, if you want Telegram apps to show bold, italic,
	 * fixed-width text or inline URLs in your bot's message.
	 */
	@JsonProperty("parse_mode") String parseMode;
	
	/** Disables link previews for links in this message */
	@JsonProperty("disable_web_page_preview") Boolean disableWebPagePreview;
	
	/**
	 * Sends the message silently. iOS users will not receive a notification,
	 * Android users will receive a notification with no sound.
	 */
	@JsonProperty("disable_notification") Boolean disableNotification;
	
	/** If the message is a reply, ID of the original message */
	@JsonProperty("reply_to_message_id") Integer replyToMessageId;
	
	/**
	 * Additional interface options. A JSON-serialized object for an inline
	 * keyboard, custom reply keyboard, instructions to hide reply keyboard or
	 * to force a reply from the user. FIXME type
	 */
	@JsonProperty("reply_markup") Object replyMarkup;

}

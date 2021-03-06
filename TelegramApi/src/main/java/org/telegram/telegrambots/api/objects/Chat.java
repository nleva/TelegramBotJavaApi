package org.telegram.telegrambots.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @date	2016-08-09
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Chat extends ApiObject{
    /**
     * Unique identifier for this chat.
     * This number may be greater than 32 bits and some programming languages may
     * have difficulty/silent defects in interpreting it. But it smaller than 52 bits,
     * so a signed 64 bit integer or double-precision float type are safe for storing this identifier.
     */
    Long id; ///< Unique identifier for this chat, not exciding 1e13 by absolute value
    String type; ///< Type of the chat, one of “private”, “group” or “channel”
    String title; ///< Optional. Title of the chat, only for channels and group chat
    @JsonProperty("first_name") String firstName; ///< Optional. Username of the chat, only for chats and channels if available
    @JsonProperty("last_name") String lastName; ///< Optional. Interlocutor's first name for chats
    @JsonProperty("user_name") String userName; ///< Optional. Interlocutor's last name for chats

}

package org.telegram.telegrambots.api.objects;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Types of messages entities
 * @date	2016-11-22
 */
@AllArgsConstructor
public enum EntityType {
    MENTION("mention"), ///< @username
    HASHTAG("hashtag"), ///< #hashtag
    BOTCOMMAND("bot_command"), ///< /botcommand
    URL("url"), ///< http://url.url
    EMAIL("email"), ///< email@email.com
    BOLD("bold"), ///< Bold text
    ITALIC("italic"), ///< Italic text
    CODE("code"), ///< Monowidth string
    PRE("pre"), ///< Monowidth block
    TEXTLINK("text_link"), ///< Clickable urls
    TEXTMENTION("text_mention"); ///< for users without usernames

    private String text;
    

    @JsonValue
    public String getText() {
		return text;
	}
    
    @Override
    public String toString() {
        return text;
    }
}


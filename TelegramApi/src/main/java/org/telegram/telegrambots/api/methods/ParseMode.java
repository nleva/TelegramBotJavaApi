package org.telegram.telegrambots.api.methods;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Type of parse modes for text in messages
 * @date	2016-11-22
 */
@AllArgsConstructor
public enum ParseMode {
    MARKDOWN("Markdown"),
    HTML("html");
    
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

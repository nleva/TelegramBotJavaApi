package org.telegram.telegrambots.api.methods;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Types of actions for SendChatAction method.
 * @date	2016-11-21
 */
@AllArgsConstructor
public enum ActionType {
    TYPING("typing"),
    RECORD_VIDEO("record_video"),
    RECORD_AUDIO("record_audio"),
    UPLOAD_PHOTO("upload_photo"),
    UPLOAD_VIDEO("upload_video"),
    UPLOAD_AUDIO("upload_audio"),
    UPLOAD_DOCUMENT("upload_document"),
    FIND_LOCATION("find_location");

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

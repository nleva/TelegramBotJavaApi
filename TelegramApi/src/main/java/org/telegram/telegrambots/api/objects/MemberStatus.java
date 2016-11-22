package org.telegram.telegrambots.api.objects;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Group members categories
 * @date	2016-11-22
 */
@AllArgsConstructor
public enum MemberStatus {
    CREATOR("creator"),
    ADMINISTRATOR("administrator"),
    MEMBER("member"),
    LEFT("left"),
    KICKED("kicked");
    
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

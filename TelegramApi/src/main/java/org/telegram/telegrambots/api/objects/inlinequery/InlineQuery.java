package org.telegram.telegrambots.api.objects.inlinequery;

import org.telegram.telegrambots.api.objects.ApiObject;
import org.telegram.telegrambots.api.objects.Location;
import org.telegram.telegrambots.api.objects.User;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief This object represents an incoming inline query. When the user sends an empty query, your
 * bot could return some default or trending results.
 * @date	2016-11-22
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class InlineQuery extends ApiObject {
    private String id; ///< Unique identifier for this query
    private User from; ///< Sender
    private Location location; ///< Optional. Sender location, only for bots that request user location
    private String query; ///< Text of the query
    private String offset; ///< Offset of the results to be returned, can be controlled by the bot

}


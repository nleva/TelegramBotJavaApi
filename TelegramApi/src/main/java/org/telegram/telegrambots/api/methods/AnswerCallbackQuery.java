package org.telegram.telegrambots.api.methods;

import javax.ws.rs.Path;

import org.telegram.telegrambots.api.methods.send.ApiMethod;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Use this method to send answers to callback queries sent from inline keyboards. The answer
 * will be displayed to the user as a notification at the top of the chat screen or as an alert. On
 * success, True is returned.
 * @date	2016-11-21
 */
@Path("answercallbackquery")
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class AnswerCallbackQuery extends ApiMethod {
    String callbackQueryId; ///< Unique identifier for the query to be answered
    String text; ///< Text of the notification. If not specified, nothing will be shown to the user
    Boolean showAlert; ///< Optional. If true, an alert will be shown by the client instead of a notificaiton at the top of the chat screen. Defaults to false.

}

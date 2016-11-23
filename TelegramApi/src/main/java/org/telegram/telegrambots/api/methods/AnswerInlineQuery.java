package org.telegram.telegrambots.api.methods;

import java.util.List;

import javax.ws.rs.Path;

import org.telegram.telegrambots.api.methods.send.ApiMethod;
import org.telegram.telegrambots.api.objects.inlinequery.result.InlineQueryResult;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Use this method to send answers to an inline query. On success, True is returned.
 * @date	2016-11-21
 */
@Path("answerInlineQuery")
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class AnswerInlineQuery extends ApiMethod{
    @JsonProperty("inline_query_id") String inlineQueryId; ///< Unique identifier for answered query
    List<InlineQueryResult> results; ///< A JSON-serialized array of results for the inline query
    @JsonProperty("cache_time") Integer cacheTime; ///< Optional	The maximum amount of time the result of the inline query may be cached on the server
    @JsonProperty("is_personal") Boolean isPersonal; ///< Pass True, if results may be cached on the server side only for the user that sent the query. By default, results may be returned to any user who sends the same query
    @JsonProperty("next_offset") String nextOffset; ///< Optional. Pass the offset that a client should send in the next query with the same text to receive more results. Pass an empty string if there are no more results or if you don‘t support pagination. Offset length can’t exceed 64 bytes.
    @JsonProperty("switch_pm_text") String switchPmText; ///< Optional. If passed, clients will display a button with specified text that switches the user to a chat with the bot and sends the bot a start message with the parameter switch_pm_parameter
    @JsonProperty("switch_pm_parameter") String switchPmParameter; ///< Optional. Parameter for the start message sent to the bot when user presses the switch button

}

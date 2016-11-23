package org.telegram.telegrambots.api.methods.updates;

import javax.ws.rs.Path;

import org.telegram.telegrambots.api.methods.send.ApiMethod;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Use this method to specify a url and receive incoming updates via an outgoing webhook.
 * Whenever there is an update for the bot, we will send an HTTPS POST request to the specified url,
 * containing a JSON-serialized Update. In case of an unsuccessful request, we will give up after a
 * reasonable amount of attempts.
 * @date	2016-11-21
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
@Path("setwebhook")
public class SetWebhook extends ApiMethod{
    String url; ///< Optional. HTTPS url to send updates to. Use an empty string to remove webhook integration
    @JsonProperty("certificate_file") String certificateFile; ///< Optional. Upload your public key certificate so that the root certificate in use can be checked

}

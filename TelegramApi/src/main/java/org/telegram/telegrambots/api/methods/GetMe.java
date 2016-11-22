package org.telegram.telegrambots.api.methods;

import javax.ws.rs.Path;

import org.telegram.telegrambots.api.methods.send.ApiMethod;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief A simple method for testing your bot's auth token. Requires no parameters.
 * Returns basic information about the bot in form of a User object
 * @date	2016-11-21
 */
@Path("getMe")
public class GetMe extends ApiMethod {
}

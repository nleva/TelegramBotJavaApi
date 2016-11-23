package org.telegram.telegrambots.api.objects;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief This object represents a general file (as opposed to photos and audio files).
 * Telegram users can send files of any type of up to 1.5 GB in size.
 * @date	2016-11-22
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Contact extends ApiObject {
    @JsonProperty("phone_number") String phoneNumber; ///< Contact's phone number
    @JsonProperty("first_name") String firstName; ///< Contact's first name
    @JsonProperty("last_name") String lastName; ///< Optional. Contact's last name
    Integer userID; ///< Optional. Contact's user identifier in Telegram

}

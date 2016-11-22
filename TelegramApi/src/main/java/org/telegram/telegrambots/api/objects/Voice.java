package org.telegram.telegrambots.api.objects;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief This object represents a voice note
 * @date	2016-11-22
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Voice extends ApiObject {
    String fileId; ///< Unique identifier for this file
    Integer duration; ///< Integer	Duration of the audio in seconds as defined by sender
    String mimeType; ///< Optional. MIME type of the file as defined by sender
    Integer fileSize; ///< Optional. File size

}
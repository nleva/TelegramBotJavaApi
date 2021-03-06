package org.telegram.telegrambots.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief This object represents an audio file
 * @date	2016-11-21
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class Audio extends ApiObject {

    @JsonProperty("file_id") String fileId; ///< Unique identifier for this file
    Integer duration; ///< Integer	Duration of the audio in seconds as defined by sender
    @JsonProperty("mime_type") String mimeType; ///< Optional. MIME type of the file as defined by sender
    @JsonProperty("file_size") Integer fileSize; ///< Optional. File size
    String title; ///< Optional. Title of the audio as defined by sender or by audio tags
    String performer; ///< Optional. Performer of the audio as defined by sender or by audio tags

}

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
public class Document extends ApiObject {
    @JsonProperty("file_id") String fileId; ///< Unique identifier for this file
    PhotoSize thumb; ///< Document thumbnail as defined by sender
    @JsonProperty("file_name") String fileName; ///< Optional. Original filename as defined by sender
    @JsonProperty("mime_type") String mimeType; ///< Optional. Mime type of a file as defined by sender
    @JsonProperty("file_size") Integer fileSize; ///< Optional. File size

}

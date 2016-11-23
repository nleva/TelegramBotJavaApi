package org.telegram.telegrambots.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief This object represents a video file.
 * @date	2016-11-22
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Video extends ApiObject {
    @JsonProperty("file_id") String fileId; ///< Unique identifier for this file
    Integer width; ///< Video width as defined by sender
    Integer height; ///< Video height as defined by sender
    Integer duration; ///< Duration of the video in seconds as defined by sender
    PhotoSize thumb; ///< Video thumbnail
    @JsonProperty("mime_type") String mimeType; ///< Optional. Mime type of a file as defined by sender
    @JsonProperty("file_size") Integer fileSize; ///< Optional. File size

}

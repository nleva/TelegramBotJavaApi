package org.telegram.telegrambots.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief This object represents a file ready to be downloaded
 * @date	2016-11-22
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class File extends ApiObject {
    @JsonProperty("file_id") String fileId; ///< Unique identifier for this file
    @JsonProperty("file_size") Integer fileSize; ///< Optional. File size, if known
    @JsonProperty("file_path") String filePath; ///< Optional. File path. Use https://api.telegram.org/file/bot<token>/<file_path> to get the file.

}

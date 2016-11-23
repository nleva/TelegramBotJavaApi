package org.telegram.telegrambots.api.objects;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief This object represents one size of a photo or a file / sticker thumbnail.
 * @date 20 of June of 2015
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class PhotoSize extends ApiObject {
    @JsonProperty("file_id") String fileId; ///< Unique identifier for this file
    Integer width; ///< Photo width
    Integer height; ///< Photo height
    @JsonProperty("file_size") Integer fileSize; ///< Optional. File size
    @JsonProperty("file_path") String filePath; ///< Undocumented field. Optional. Can contain the path to download the file direclty without calling to getFile

}

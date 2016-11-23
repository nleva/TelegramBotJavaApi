package org.telegram.telegrambots.api.objects;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief This object represents a sticker.
 * @date	2016-11-22
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Sticker extends ApiObject {
    @JsonProperty("file_id") String fileId; ///< Unique identifier for this file
    Integer width; ///< Sticker width
    Integer height; ///< Sticker height
    PhotoSize thumb; ///< Optional. Sticker thumbnail in .webp or .jpg format
    @JsonProperty("file_size") Integer fileSize; ///< Optional. File size
    String emoji; ///< Optional. Emoji associated with the sticker

}

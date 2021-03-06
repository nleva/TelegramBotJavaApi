package org.telegram.telegrambots.api.methods.send;

import java.io.File;
import java.io.InputStream;

import javax.ws.rs.Path;

import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboard;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Use this method to send video files, Telegram clients support mp4 videos (other formats
 * may be sent as Document). On success, the sent Message is returned.
 * @date	2016-11-21
 */
@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
@Path("sendvideo")
public class SendVideo extends ApiMethod{
    @JsonProperty("chat_id") String chatId; ///< Unique identifier for the chat to send the message to (Or username for channels)
    String video; ///< Video to send. file_id as String to resend a video that is already on the Telegram servers
    Integer duration; ///< Optional. Duration of sent video in seconds
    String caption; ///< OptionaL. Video caption (may also be used when resending videos by file_id).
    Integer width; ///< Optional. Video width
    Integer height; ///< OptionaL. Video height
    /**
     * Optional. Sends the message silently. iOS users will not receive a notification, Android
     * users will receive a notification with no sound. Other apps coming soon
     */
    @JsonProperty("disable_notification") Boolean disableNotification;
    @JsonProperty("reply_to_message_id") Integer replyToMessageId; ///< Optional. If the message is a reply, ID of the original message
    @JsonProperty("reply_markup") ReplyKeyboard replyMarkup; ///< Optional. JSON-serialized object for a custom reply keyboard

    @JsonProperty("is_new_video") boolean isNewVideo; ///< True to upload a new video, false to use a fileId
    @JsonProperty("video_name") String videoName; ///< Name of the video
    @JsonProperty("new_video_file") File newVideoFile; ///< New video file
    @JsonProperty("new_video_stream") InputStream newVideoStream; ///< New video stream

   
}

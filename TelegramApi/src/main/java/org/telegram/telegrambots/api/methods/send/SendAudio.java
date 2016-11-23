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
 * @brief Use this method to send audio files, Use this method to send audio files, if you want
 * Telegram clients to display them in the music player. Your audio must be in an .mp3 format. On
 * success, the sent Message is returned. Bots can currently send audio files of up to 50 MB in
 * size, this limit may be changed in the future.
 * @note For sending voice notes, use sendVoice method instead.
 * @date	2016-11-21
 */
@Data
@ToString(callSuper=false)
@EqualsAndHashCode(callSuper=false)
@Path("sendaudio")
public class SendAudio extends ApiMethod{

    Integer duration; ///< Integer	Duration of the audio in seconds as defined by sender
    @JsonProperty("chat_id") String chatId; ///< Unique identifier for the chat to send the message to (or Username fro channels)
    String audio; ///< Audio file to send. file_id as String to resend an audio that is already on the Telegram servers
    @JsonProperty("reply_to_message_id") Integer replyToMessageId; ///< Optional. If the message is a reply, ID of the original message
    /**
     * Optional. Sends the message silently. iOS users will not receive a notification, Android
     * users will receive a notification with no sound. Other apps coming soon
     */
    @JsonProperty("disable_notification") Boolean disableNotification;
    @JsonProperty("reply_markup") ReplyKeyboard replyMarkup; ///< Optional. JSON-serialized object for a custom reply keyboard
    String performer; ///< Optional. Performer of sent audio
    String title; ///< Optional. Title of sent audio

    @JsonProperty("is_new_audio") boolean isNewAudio; ///< True to upload a new audio, false to use a fileId
    @JsonProperty("audio_name") String audioName;
    @JsonProperty("new_audio_file") File newAudioFile; ///< New audio file
    @JsonProperty("new_audio_stream") InputStream newAudioStream; ///< New audio stream
   
}

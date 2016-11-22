package org.telegram.telegrambots.api.objects;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Message object
 * 
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @date 2016-08-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Message extends ApiObject {
	/** Уникальный идентификатор сообщения */
	Long messageId;
	/** Опционально. Отправитель. Может быть пустым в каналах. */
	User from;
	/** Дата отправки сообщения (Unix time) */
	Long date;
	/** Диалог, в котором было отправлено сообщение */
	Chat chat;
	/**
	 * Опционально. Для пересланных сообщений: отправитель оригинального
	 * сообщения
	 */
	User forwardFrom;
	/**
	 * Опционально. Для пересланных сообщений: дата отправки оригинального
	 * сообщения
	 */
	Long forwardDate;
	/**
	 * Опционально. Для ответов: оригинальное сообщение. Note that the Message
	 * object in this field will not contain further reply_to_message fields
	 * even if it itself is a reply.
	 */
	Message replyToMessage;
	/**
	 * Опционально. Для текстовых сообщений: текст сообщения, 0-4096 символов
	 */
	String text;
	/**
	 * Опционально. Для текстовых сообщений: особые сущности в тексте сообщения.
	 */
	MessageEntity[] entities;
	/** Опционально. Информация об аудиофайле */
	Audio audio;
	/** Опционально. Информация о файле */
	Document document;
	/** Опционально. Доступные размеры фото */
	PhotoSize[] photo;
	/** Опционально. Информация о стикере */
	Sticker sticker;
	/** Опционально. Информация о видеозаписи */
	Video video;
	/** Опционально. Информация о голосовом сообщении */
	Voice voice;
	/** Опционально. Подпись к файлу, фото или видео, 0-200 символов */
	String caption;
	/** Опционально. Информация об отправленном контакте */
	Contact contact;
	/** Опционально. Информация о местоположении */
	Location location;
	/** Опционально. Информация о месте на карте */
	Venue venue;
	/** Опционально. Информация о пользователе, добавленном в группу */
	User newChatMember;
	/** Опционально. Информация о пользователе, удалённом из группы */
	User leftChatMember;
	/** Опционально. Название группы было изменено на это поле */
	String newChatTitle;
	/** Опционально. Фото группы было изменено на это поле */
	PhotoSize[] new_chat_photo;
	/** Опционально. Сервисное сообщение: фото группы было удалено */
	Boolean deleteChatPhoto;
	/** Опционально. Сервисное сообщение: группа создана */
	Boolean groupChatCreated;
	/** Опционально. Сервисное сообщение: супергруппа создана */
	Boolean supergroupChatCreated;
	/** Опционально. Сервисное сообщение: канал создан */
	Boolean channelChatCreated;
	/**
	 * Опционально. Группа была преобразована в супергруппу с указанным
	 * идентификатором. Не превышает 1e13
	 */
	Long migrateToChatId;
	/**
	 * Опционально. Cупергруппа была создана из группы с указанным
	 * идентификатором. Не превышает 1e13
	 */
	Long migrateFromChatId;
	/**
	 * Опционально. Указанное сообщение было прикреплено. Note that the Message
	 * object in this field will not contain further reply_to_message fields
	 * even if it is itself a reply.
	 */
	Message pinnedMessage;
}

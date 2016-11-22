package org.telegram.telegrambots.api.objects;

import org.telegram.telegrambots.api.methods.send.Api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Базовый класс для объектов telegram api
 * @author Lev Nadeinsky
 * @since	9 авг. 2016 г.
 */


@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class ApiObject extends Api{

}

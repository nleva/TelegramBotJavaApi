package org.telegram.telegrambots.api.objects.replykeyboard;

import org.telegram.telegrambots.api.objects.ApiObject;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Lev Nadeinsky
 * @author Ruben Bermudez
 * @brief Reply keyboard abstract type
 * @date 20 of June of 2015
 */

@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class ReplyKeyboard extends ApiObject {
}

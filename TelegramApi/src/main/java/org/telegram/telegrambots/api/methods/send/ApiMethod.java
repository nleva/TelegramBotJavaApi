package org.telegram.telegrambots.api.methods.send;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Base for all methodRequests
 * @author Lev Nadeinsky
 * @date	2016-11-21
 */


@Data
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class ApiMethod extends Api{

	@Data
	@EqualsAndHashCode(callSuper=true)
	@ToString(callSuper=true)
	public static class Result<T> extends Api{
		String ok;
		String error_code;
		T result;
		String description;
	}
}

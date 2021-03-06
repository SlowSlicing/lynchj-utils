package com.lynchj.enums;

/**
 * 统一使用日期格式
 * 	包含日期的格式, 日期格式所对应的正则
 *
 * @author 大漠知秋
 */
public enum DateFormatEnum {

	FORMAT_ONE("yyyy-MM-dd HH:mm:ss", "常用日期格式"),
	FORMAT_TWO("yyyy-MM-dd", "常用日期格式, 不带时间"),
	FORMAT_THREE("yyyy/MM/dd HH:mm:ss", "带斜杠的日期格式"),
	FORMAT_FOUR("yyyy/MM/dd", "带斜杠的日期格式, 不带时间"),
	
	REGEX_ONE("^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-)) (20|21|22|23|[0-1]?\\d):[0-5]?\\d:[0-5]?\\d$", "常用日期格式的正则校验"),
	REGEX_TWO("^((((1[6-9]|[2-9]\\d)\\d{2})-(0?[13578]|1[02])-(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0?[13456789]|1[012])-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))-0?2-29-))$", "常用日期格式, 不带时间的正则校验"),
	REGEX_THREE("^((((1[6-9]|[2-9]\\d)\\d{2})\\/(0?[13578]|1[02])\\/(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})\\/(0?[13456789]|1[012])/(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})\\/0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))\\/0?2\\/29\\/)) (20|21|22|23|[0-1]?\\d):[0-5]?\\d:[0-5]?\\d$", "带斜杠的日期格式的正则校验"),
	REGEX_FOUR("^((((1[6-9]|[2-9]\\d)\\d{2})\\/(0?[13578]|1[02])\\/(0?[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})\\/(0?[13456789]|1[012])/(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})\\/0?2-(0?[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))\\/0?2\\/29\\/))$", "带斜杠的日期格式, 不带时间的正则校验"),
	;
	
	private String value;
	
	private String msg;

	public String getValue() {
		return value;
	}

	public String getMsg() {
		return msg;
	}

	private DateFormatEnum(String value, String msg) {
		this.value = value;
		this.msg = msg;
	}
	
}

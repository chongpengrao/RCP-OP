package io.scorpio.op.common.utils;

import com.google.common.base.Strings;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

/**
 * @author scorpio
 * @date 2021/1/5 0005
 */
public class MessageUtils {
    private static MessageSource messageSource;
    static {
        messageSource = (MessageSource)SpringContextUtils.getBean("messageSource");
    }

    public static String getMessage(int code){
        return getMessage(code, new String[0]);
    }

    public static String getMessage(int code, String... params){
        String message = messageSource.getMessage(code + "", params, LocaleContextHolder.getLocale());
        return Strings.isNullOrEmpty(message) ? "" : message;
    }
}

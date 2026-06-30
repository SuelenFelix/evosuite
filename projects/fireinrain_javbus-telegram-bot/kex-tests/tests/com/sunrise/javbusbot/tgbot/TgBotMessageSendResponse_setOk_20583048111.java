package com.sunrise.javbusbot.tgbot;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.sunrise.javbusbot.tgbot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class TgBotMessageSendResponse_setOk_20583048111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term116;

    public TgBotMessageSendResponse_setOk_20583048111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.TgBotMessageSendResponse"));
        Object term3 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SendResult"));
        Object term5 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SenderChat"));
        Object term54 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Chat"));
        setBooleanField(term1, term1.getClass(), "ok", false);
        setIntField(term3, term3.getClass(), "messageId", 568599855);
        setField(term5, term5.getClass(), "id", "PAEBtnZtTD");
        setField(term5, term5.getClass(), "title", "sjlJAEtRrb");
        setField(term5, term5.getClass(), "username", "MuLcgQHgqz");
        setField(term5, term5.getClass(), "type", "xxtlPwDYFs");
        setField(term3, term3.getClass(), "senderChat", term5);
        setField(term54, term54.getClass(), "id", "jJCZpVmanW");
        setField(term54, term54.getClass(), "title", "EGtDIRbSSb");
        setField(term54, term54.getClass(), "username", "SzjVpOQTyS");
        setField(term54, term54.getClass(), "type", "MjGYSRKTNF");
        setField(term3, term3.getClass(), "chat", term54);
        setIntField(term3, term3.getClass(), "date", 1162663216);
        setField(term3, term3.getClass(), "text", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "result", term3);
        term116 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.TgBotMessageSendResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term116;
        callMethod(klass, "setOk", argTypes, term1, args);
    }

};



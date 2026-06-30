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

public class TgBotMessageSendResponse_getResult_1923675154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term821;

    public TgBotMessageSendResponse_getResult_1923675154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term821 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.TgBotMessageSendResponse"));
        Object term823 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SendResult"));
        Object term825 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SenderChat"));
        Object term874 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Chat"));
        setBooleanField(term821, term821.getClass(), "ok", true);
        setIntField(term823, term823.getClass(), "messageId", 1227103734);
        setField(term825, term825.getClass(), "id", "xrwlQZdwCp");
        setField(term825, term825.getClass(), "title", "IDCWpPLRkE");
        setField(term825, term825.getClass(), "username", "nyiiPDVjAc");
        setField(term825, term825.getClass(), "type", "aKnKipADSo");
        setField(term823, term823.getClass(), "senderChat", term825);
        setField(term874, term874.getClass(), "id", "wSQxaModmm");
        setField(term874, term874.getClass(), "title", "UlajhuVLaP");
        setField(term874, term874.getClass(), "username", "gGSMzuGICf");
        setField(term874, term874.getClass(), "type", "hxCBltsObl");
        setField(term823, term823.getClass(), "chat", term874);
        setIntField(term823, term823.getClass(), "date", -1339778481);
        setField(term823, term823.getClass(), "text", "BndsHwAFMv");
        setField(term821, term821.getClass(), "result", term823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.TgBotMessageSendResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResult", argTypes, term821, args);
    }

};



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

public class TgBotMessageSendResponse_getOk_54310632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208;

    public TgBotMessageSendResponse_getOk_54310632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.TgBotMessageSendResponse"));
        Object term210 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SendResult"));
        Object term212 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SenderChat"));
        Object term261 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Chat"));
        setBooleanField(term208, term208.getClass(), "ok", false);
        setIntField(term210, term210.getClass(), "messageId", 1484323161);
        setField(term212, term212.getClass(), "id", "RMFIsYGgne");
        setField(term212, term212.getClass(), "title", "NRdvgJlhkX");
        setField(term212, term212.getClass(), "username", "uuaPigETmJ");
        setField(term212, term212.getClass(), "type", "MxlszYVzRf");
        setField(term210, term210.getClass(), "senderChat", term212);
        setField(term261, term261.getClass(), "id", "LQFpaHEwXR");
        setField(term261, term261.getClass(), "title", "oVcInYnLWB");
        setField(term261, term261.getClass(), "username", "aJlieCFVtF");
        setField(term261, term261.getClass(), "type", "ZiaGIbnzTs");
        setField(term210, term210.getClass(), "chat", term261);
        setIntField(term210, term210.getClass(), "date", 391863371);
        setField(term210, term210.getClass(), "text", "tbcdzjIfER");
        setField(term208, term208.getClass(), "result", term210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.TgBotMessageSendResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOk", argTypes, term208, args);
    }

};



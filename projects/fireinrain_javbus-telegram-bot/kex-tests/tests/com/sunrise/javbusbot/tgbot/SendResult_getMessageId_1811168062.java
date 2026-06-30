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

public class SendResult_getMessageId_1811168062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3278;

    public SendResult_getMessageId_1811168062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3278 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SendResult"));
        Object term3280 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SenderChat"));
        Object term3329 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Chat"));
        setIntField(term3278, term3278.getClass(), "messageId", -226514366);
        setField(term3280, term3280.getClass(), "id", "fWKJoSoCwE");
        setField(term3280, term3280.getClass(), "title", "wfaXBpWAUH");
        setField(term3280, term3280.getClass(), "username", "VMeAzAHwZj");
        setField(term3280, term3280.getClass(), "type", "PznxWXsZME");
        setField(term3278, term3278.getClass(), "senderChat", term3280);
        setField(term3329, term3329.getClass(), "id", "ZzIujlwVsw");
        setField(term3329, term3329.getClass(), "title", "LWyEaeIyAo");
        setField(term3329, term3329.getClass(), "username", "yVMkkQhvmN");
        setField(term3329, term3329.getClass(), "type", "mvrkADEgpp");
        setField(term3278, term3278.getClass(), "chat", term3329);
        setIntField(term3278, term3278.getClass(), "date", 1193880199);
        setField(term3278, term3278.getClass(), "text", "pXOkjyeIRb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.SendResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessageId", argTypes, term3278, args);
    }

};



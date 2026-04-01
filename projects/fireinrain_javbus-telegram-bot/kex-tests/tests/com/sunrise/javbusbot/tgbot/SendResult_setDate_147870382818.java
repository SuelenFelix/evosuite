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
import java.lang.Integer;

public class SendResult_setDate_147870382818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5327;
     Object term5330;

    public SendResult_setDate_147870382818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5327 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SendResult"));
        setIntField(term5327, term5327.getClass(), "messageId", 0);
        setField(term5327, term5327.getClass(), "senderChat", null);
        setField(term5327, term5327.getClass(), "chat", null);
        setIntField(term5327, term5327.getClass(), "date", 0);
        setField(term5327, term5327.getClass(), "text", null);
        term5330 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.SendResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5330;
        callMethod(klass, "setDate", argTypes, term5327, args);
    }

};



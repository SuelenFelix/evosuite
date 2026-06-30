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

public class SendResult_getSenderChat_199965439015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5318;

    public SendResult_getSenderChat_199965439015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5318 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SendResult"));
        setIntField(term5318, term5318.getClass(), "messageId", 0);
        setField(term5318, term5318.getClass(), "senderChat", null);
        setField(term5318, term5318.getClass(), "chat", null);
        setIntField(term5318, term5318.getClass(), "date", 0);
        setField(term5318, term5318.getClass(), "text", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.SendResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSenderChat", argTypes, term5318, args);
    }

};



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

public class SendResult_setSenderChat_132253778614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5315;

    public SendResult_setSenderChat_132253778614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5315 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SendResult"));
        setIntField(term5315, term5315.getClass(), "messageId", 0);
        setField(term5315, term5315.getClass(), "senderChat", null);
        setField(term5315, term5315.getClass(), "chat", null);
        setIntField(term5315, term5315.getClass(), "date", 0);
        setField(term5315, term5315.getClass(), "text", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.SendResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.sunrise.javbusbot.tgbot.SenderChat");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSenderChat", argTypes, term5315, args);
    }

};



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

public class SendResult_setSenderChat_13225377863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3481;
     Object term3594;

    public SendResult_setSenderChat_13225377863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3481 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SendResult"));
        Object term3483 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SenderChat"));
        Object term3532 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Chat"));
        setIntField(term3481, term3481.getClass(), "messageId", -1087774327);
        setField(term3483, term3483.getClass(), "id", "GgZWSjxjyE");
        setField(term3483, term3483.getClass(), "title", "EeBVbzjcCI");
        setField(term3483, term3483.getClass(), "username", "UfQtPRyWRC");
        setField(term3483, term3483.getClass(), "type", "FPvxVzzSvD");
        setField(term3481, term3481.getClass(), "senderChat", term3483);
        setField(term3532, term3532.getClass(), "id", "WHcwFgsGFC");
        setField(term3532, term3532.getClass(), "title", "HzqpegHiRq");
        setField(term3532, term3532.getClass(), "username", "jwsfVjMoJT");
        setField(term3532, term3532.getClass(), "type", "ZfdXfCCFDf");
        setField(term3481, term3481.getClass(), "chat", term3532);
        setIntField(term3481, term3481.getClass(), "date", -1530420153);
        setField(term3481, term3481.getClass(), "text", "MwwjNtdOFT");
        term3594 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SenderChat"));
        setField(term3594, term3594.getClass(), "id", "VYkqXKVlAJ");
        setField(term3594, term3594.getClass(), "title", "XkIoWJRNwN");
        setField(term3594, term3594.getClass(), "username", "aNWLJdrZMq");
        setField(term3594, term3594.getClass(), "type", "HHmNoYxIGj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.SendResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.sunrise.javbusbot.tgbot.SenderChat");
        Object[] args = new Object[1];
        args[0] = term3594;
        callMethod(klass, "setSenderChat", argTypes, term3481, args);
    }

};



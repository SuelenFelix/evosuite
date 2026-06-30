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
import java.lang.Integer;

public class SendResult_setMessageId_19492257561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3073;
     Object term3186;

    public SendResult_setMessageId_19492257561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3073 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SendResult"));
        Object term3075 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SenderChat"));
        Object term3124 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Chat"));
        setIntField(term3073, term3073.getClass(), "messageId", -203030934);
        setField(term3075, term3075.getClass(), "id", "JDaAnsVTGV");
        setField(term3075, term3075.getClass(), "title", "mLUZFTfjle");
        setField(term3075, term3075.getClass(), "username", "xIeFjkHkOe");
        setField(term3075, term3075.getClass(), "type", "SdCKLMIYnX");
        setField(term3073, term3073.getClass(), "senderChat", term3075);
        setField(term3124, term3124.getClass(), "id", "OJJtVNPyKZ");
        setField(term3124, term3124.getClass(), "title", "AKNapTAfmD");
        setField(term3124, term3124.getClass(), "username", "xJgPlLxpgC");
        setField(term3124, term3124.getClass(), "type", "EYtfuJaxiM");
        setField(term3073, term3073.getClass(), "chat", term3124);
        setIntField(term3073, term3073.getClass(), "date", -1179120542);
        setField(term3073, term3073.getClass(), "text", "gCWtLVKVVe");
        term3186 = new Integer(-73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.SendResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3186;
        callMethod(klass, "setMessageId", argTypes, term3073, args);
    }

};



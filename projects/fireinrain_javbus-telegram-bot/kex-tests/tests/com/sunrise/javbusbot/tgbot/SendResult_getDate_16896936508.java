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

public class SendResult_getDate_16896936508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4676;

    public SendResult_getDate_16896936508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4676 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SendResult"));
        Object term4678 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SenderChat"));
        Object term4727 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Chat"));
        setIntField(term4676, term4676.getClass(), "messageId", -1016503459);
        setField(term4678, term4678.getClass(), "id", "kGMQdqJYyB");
        setField(term4678, term4678.getClass(), "title", "XJJNClzHRf");
        setField(term4678, term4678.getClass(), "username", "HDaezxQfQR");
        setField(term4678, term4678.getClass(), "type", "iikZEapDlu");
        setField(term4676, term4676.getClass(), "senderChat", term4678);
        setField(term4727, term4727.getClass(), "id", "nhoHrZfnIN");
        setField(term4727, term4727.getClass(), "title", "ZkMALXpEAZ");
        setField(term4727, term4727.getClass(), "username", "tXfQjSqDzN");
        setField(term4727, term4727.getClass(), "type", "BjugTaMcxJ");
        setField(term4676, term4676.getClass(), "chat", term4727);
        setIntField(term4676, term4676.getClass(), "date", -1968847291);
        setField(term4676, term4676.getClass(), "text", "vGiuZVPJNH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.SendResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term4676, args);
    }

};



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

public class SendResult_getChat_18204541766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4268;

    public SendResult_getChat_18204541766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4268 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SendResult"));
        Object term4270 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SenderChat"));
        Object term4319 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Chat"));
        setIntField(term4268, term4268.getClass(), "messageId", 767834723);
        setField(term4270, term4270.getClass(), "id", "igCAtimmYB");
        setField(term4270, term4270.getClass(), "title", "DyiXbeYIaN");
        setField(term4270, term4270.getClass(), "username", "VGizxZnyHX");
        setField(term4270, term4270.getClass(), "type", "kVEZMHmRtR");
        setField(term4268, term4268.getClass(), "senderChat", term4270);
        setField(term4319, term4319.getClass(), "id", "ekxGuOYIwi");
        setField(term4319, term4319.getClass(), "title", "RbVQXSpxXy");
        setField(term4319, term4319.getClass(), "username", "YpJbIgJWWv");
        setField(term4319, term4319.getClass(), "type", "JppkknKVOw");
        setField(term4268, term4268.getClass(), "chat", term4319);
        setIntField(term4268, term4268.getClass(), "date", -602026508);
        setField(term4268, term4268.getClass(), "text", "iljANwuEjk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.SendResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChat", argTypes, term4268, args);
    }

};



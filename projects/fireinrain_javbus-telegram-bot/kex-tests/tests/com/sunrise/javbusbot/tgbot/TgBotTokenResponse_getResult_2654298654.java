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

public class TgBotTokenResponse_getResult_2654298654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2163;

    public TgBotTokenResponse_getResult_2654298654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2163 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.TgBotTokenResponse"));
        Object term2165 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setBooleanField(term2163, term2163.getClass(), "ok", false);
        setIntField(term2165, term2165.getClass(), "id", 1585847225);
        setBooleanField(term2165, term2165.getClass(), "isBot", false);
        setField(term2165, term2165.getClass(), "firstName", "jiKYgYHqIS");
        setField(term2165, term2165.getClass(), "username", "DfISiziTgG");
        setBooleanField(term2165, term2165.getClass(), "canJoinGroups", false);
        setBooleanField(term2165, term2165.getClass(), "canReadAllGroupMessages", true);
        setBooleanField(term2165, term2165.getClass(), "supportsInlineQueries", true);
        setField(term2163, term2163.getClass(), "result", term2165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.TgBotTokenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResult", argTypes, term2163, args);
    }

};



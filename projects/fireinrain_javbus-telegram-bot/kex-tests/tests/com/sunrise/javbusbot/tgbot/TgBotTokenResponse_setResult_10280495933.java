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

public class TgBotTokenResponse_setResult_10280495933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2061;
     Object term2093;

    public TgBotTokenResponse_setResult_10280495933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2061 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.TgBotTokenResponse"));
        Object term2063 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setBooleanField(term2061, term2061.getClass(), "ok", true);
        setIntField(term2063, term2063.getClass(), "id", 1134449235);
        setBooleanField(term2063, term2063.getClass(), "isBot", true);
        setField(term2063, term2063.getClass(), "firstName", "swZVeJAxjt");
        setField(term2063, term2063.getClass(), "username", "xOcJIiQQDu");
        setBooleanField(term2063, term2063.getClass(), "canJoinGroups", false);
        setBooleanField(term2063, term2063.getClass(), "canReadAllGroupMessages", false);
        setBooleanField(term2063, term2063.getClass(), "supportsInlineQueries", true);
        setField(term2061, term2061.getClass(), "result", term2063);
        term2093 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term2093, term2093.getClass(), "id", -883034806);
        setBooleanField(term2093, term2093.getClass(), "isBot", true);
        setField(term2093, term2093.getClass(), "firstName", "GVizqqzXpy");
        setField(term2093, term2093.getClass(), "username", "JqXGgAhZPl");
        setBooleanField(term2093, term2093.getClass(), "canJoinGroups", true);
        setBooleanField(term2093, term2093.getClass(), "canReadAllGroupMessages", true);
        setBooleanField(term2093, term2093.getClass(), "supportsInlineQueries", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.TgBotTokenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Object[] args = new Object[1];
        args[0] = term2093;
        callMethod(klass, "setResult", argTypes, term2061, args);
    }

};



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

public class Result_getCanJoinGroups_71778791810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2725;

    public Result_getCanJoinGroups_71778791810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2725 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term2725, term2725.getClass(), "id", 1135664017);
        setBooleanField(term2725, term2725.getClass(), "isBot", true);
        setField(term2725, term2725.getClass(), "firstName", "iNwOJRBEjp");
        setField(term2725, term2725.getClass(), "username", "XylxrMBraH");
        setBooleanField(term2725, term2725.getClass(), "canJoinGroups", false);
        setBooleanField(term2725, term2725.getClass(), "canReadAllGroupMessages", false);
        setBooleanField(term2725, term2725.getClass(), "supportsInlineQueries", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCanJoinGroups", argTypes, term2725, args);
    }

};



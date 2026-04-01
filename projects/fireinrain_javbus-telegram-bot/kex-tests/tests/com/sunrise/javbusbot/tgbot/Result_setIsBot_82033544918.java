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
import java.lang.Boolean;

public class Result_setIsBot_82033544918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2993;
     Object term2999;

    public Result_setIsBot_82033544918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2993 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term2993, term2993.getClass(), "id", 0);
        setBooleanField(term2993, term2993.getClass(), "isBot", false);
        setField(term2993, term2993.getClass(), "firstName", null);
        setField(term2993, term2993.getClass(), "username", null);
        setBooleanField(term2993, term2993.getClass(), "canJoinGroups", false);
        setBooleanField(term2993, term2993.getClass(), "canReadAllGroupMessages", false);
        setBooleanField(term2993, term2993.getClass(), "supportsInlineQueries", false);
        term2999 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2999;
        callMethod(klass, "setIsBot", argTypes, term2993, args);
    }

};



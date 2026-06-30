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

public class Result_setSupportsInlineQueries_154101764528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3059;
     Object term3065;

    public Result_setSupportsInlineQueries_154101764528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3059 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term3059, term3059.getClass(), "id", 0);
        setBooleanField(term3059, term3059.getClass(), "isBot", false);
        setField(term3059, term3059.getClass(), "firstName", null);
        setField(term3059, term3059.getClass(), "username", null);
        setBooleanField(term3059, term3059.getClass(), "canJoinGroups", false);
        setBooleanField(term3059, term3059.getClass(), "canReadAllGroupMessages", false);
        setBooleanField(term3059, term3059.getClass(), "supportsInlineQueries", false);
        term3065 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3065;
        callMethod(klass, "setSupportsInlineQueries", argTypes, term3059, args);
    }

};



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

public class Result_getSupportsInlineQueries_191688162329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3067;

    public Result_getSupportsInlineQueries_191688162329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3067 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term3067, term3067.getClass(), "id", 0);
        setBooleanField(term3067, term3067.getClass(), "isBot", false);
        setField(term3067, term3067.getClass(), "firstName", null);
        setField(term3067, term3067.getClass(), "username", null);
        setBooleanField(term3067, term3067.getClass(), "canJoinGroups", false);
        setBooleanField(term3067, term3067.getClass(), "canReadAllGroupMessages", false);
        setBooleanField(term3067, term3067.getClass(), "supportsInlineQueries", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSupportsInlineQueries", argTypes, term3067, args);
    }

};



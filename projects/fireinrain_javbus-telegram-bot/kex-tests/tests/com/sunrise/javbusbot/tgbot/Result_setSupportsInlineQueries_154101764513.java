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

public class Result_setSupportsInlineQueries_154101764513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2877;
     Object term2907;

    public Result_setSupportsInlineQueries_154101764513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2877 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term2877, term2877.getClass(), "id", -1275173084);
        setBooleanField(term2877, term2877.getClass(), "isBot", false);
        setField(term2877, term2877.getClass(), "firstName", "WzMEhMXkKx");
        setField(term2877, term2877.getClass(), "username", "XOiDvlDhdc");
        setBooleanField(term2877, term2877.getClass(), "canJoinGroups", true);
        setBooleanField(term2877, term2877.getClass(), "canReadAllGroupMessages", false);
        setBooleanField(term2877, term2877.getClass(), "supportsInlineQueries", true);
        term2907 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2907;
        callMethod(klass, "setSupportsInlineQueries", argTypes, term2877, args);
    }

};



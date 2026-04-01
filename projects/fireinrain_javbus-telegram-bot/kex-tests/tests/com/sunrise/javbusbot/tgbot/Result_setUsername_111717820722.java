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

public class Result_setUsername_111717820722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3019;

    public Result_setUsername_111717820722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3019 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term3019, term3019.getClass(), "id", 0);
        setBooleanField(term3019, term3019.getClass(), "isBot", false);
        setField(term3019, term3019.getClass(), "firstName", null);
        setField(term3019, term3019.getClass(), "username", null);
        setBooleanField(term3019, term3019.getClass(), "canJoinGroups", false);
        setBooleanField(term3019, term3019.getClass(), "canReadAllGroupMessages", false);
        setBooleanField(term3019, term3019.getClass(), "supportsInlineQueries", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUsername", argTypes, term3019, args);
    }

};



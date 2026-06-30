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

public class Result_setCanReadAllGroupMessages_62536668226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3045;
     Object term3051;

    public Result_setCanReadAllGroupMessages_62536668226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3045 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term3045, term3045.getClass(), "id", 0);
        setBooleanField(term3045, term3045.getClass(), "isBot", false);
        setField(term3045, term3045.getClass(), "firstName", null);
        setField(term3045, term3045.getClass(), "username", null);
        setBooleanField(term3045, term3045.getClass(), "canJoinGroups", false);
        setBooleanField(term3045, term3045.getClass(), "canReadAllGroupMessages", false);
        setBooleanField(term3045, term3045.getClass(), "supportsInlineQueries", false);
        term3051 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3051;
        callMethod(klass, "setCanReadAllGroupMessages", argTypes, term3045, args);
    }

};



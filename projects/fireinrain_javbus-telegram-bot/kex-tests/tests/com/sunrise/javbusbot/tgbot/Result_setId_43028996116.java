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
import java.lang.Integer;

public class Result_setId_43028996116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2979;
     Object term2985;

    public Result_setId_43028996116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2979 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term2979, term2979.getClass(), "id", 0);
        setBooleanField(term2979, term2979.getClass(), "isBot", false);
        setField(term2979, term2979.getClass(), "firstName", null);
        setField(term2979, term2979.getClass(), "username", null);
        setBooleanField(term2979, term2979.getClass(), "canJoinGroups", false);
        setBooleanField(term2979, term2979.getClass(), "canReadAllGroupMessages", false);
        setBooleanField(term2979, term2979.getClass(), "supportsInlineQueries", false);
        term2985 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2985;
        callMethod(klass, "setId", argTypes, term2979, args);
    }

};



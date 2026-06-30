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

public class Result_setId_4302899611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2225;
     Object term2255;

    public Result_setId_4302899611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2225 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term2225, term2225.getClass(), "id", 597278769);
        setBooleanField(term2225, term2225.getClass(), "isBot", true);
        setField(term2225, term2225.getClass(), "firstName", "XqgfKFvPSD");
        setField(term2225, term2225.getClass(), "username", "JiVRgTZvKc");
        setBooleanField(term2225, term2225.getClass(), "canJoinGroups", true);
        setBooleanField(term2225, term2225.getClass(), "canReadAllGroupMessages", true);
        setBooleanField(term2225, term2225.getClass(), "supportsInlineQueries", true);
        term2255 = new Integer(-1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2255;
        callMethod(klass, "setId", argTypes, term2225, args);
    }

};



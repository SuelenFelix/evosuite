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

public class Result_setFirstName_10175895365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2429;

    public Result_setFirstName_10175895365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2429 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term2429, term2429.getClass(), "id", -655067527);
        setBooleanField(term2429, term2429.getClass(), "isBot", true);
        setField(term2429, term2429.getClass(), "firstName", "QXzGXbEXMu");
        setField(term2429, term2429.getClass(), "username", "qxSDVejjiY");
        setBooleanField(term2429, term2429.getClass(), "canJoinGroups", false);
        setBooleanField(term2429, term2429.getClass(), "canReadAllGroupMessages", true);
        setBooleanField(term2429, term2429.getClass(), "supportsInlineQueries", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xBsXSDjXYK";
        callMethod(klass, "setFirstName", argTypes, term2429, args);
    }

};



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

public class Result_setCanReadAllGroupMessages_62536668211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2775;
     Object term2805;

    public Result_setCanReadAllGroupMessages_62536668211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2775 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term2775, term2775.getClass(), "id", 590364439);
        setBooleanField(term2775, term2775.getClass(), "isBot", false);
        setField(term2775, term2775.getClass(), "firstName", "pORebkoRdD");
        setField(term2775, term2775.getClass(), "username", "mXGCWJDOqA");
        setBooleanField(term2775, term2775.getClass(), "canJoinGroups", false);
        setBooleanField(term2775, term2775.getClass(), "canReadAllGroupMessages", false);
        setBooleanField(term2775, term2775.getClass(), "supportsInlineQueries", false);
        term2805 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2805;
        callMethod(klass, "setCanReadAllGroupMessages", argTypes, term2775, args);
    }

};



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

public class Result_getCanReadAllGroupMessages_61638836812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2827;

    public Result_getCanReadAllGroupMessages_61638836812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2827 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term2827, term2827.getClass(), "id", 865208305);
        setBooleanField(term2827, term2827.getClass(), "isBot", false);
        setField(term2827, term2827.getClass(), "firstName", "dpNsDgfPso");
        setField(term2827, term2827.getClass(), "username", "hCWPJQKpdc");
        setBooleanField(term2827, term2827.getClass(), "canJoinGroups", false);
        setBooleanField(term2827, term2827.getClass(), "canReadAllGroupMessages", true);
        setBooleanField(term2827, term2827.getClass(), "supportsInlineQueries", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCanReadAllGroupMessages", argTypes, term2827, args);
    }

};



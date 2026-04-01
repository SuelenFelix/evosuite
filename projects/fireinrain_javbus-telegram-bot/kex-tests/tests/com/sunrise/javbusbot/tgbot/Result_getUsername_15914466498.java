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

public class Result_getUsername_15914466498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2623;

    public Result_getUsername_15914466498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2623 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term2623, term2623.getClass(), "id", -117576464);
        setBooleanField(term2623, term2623.getClass(), "isBot", false);
        setField(term2623, term2623.getClass(), "firstName", "OEXDRUKcFl");
        setField(term2623, term2623.getClass(), "username", "RYdKCNNMBR");
        setBooleanField(term2623, term2623.getClass(), "canJoinGroups", false);
        setBooleanField(term2623, term2623.getClass(), "canReadAllGroupMessages", false);
        setBooleanField(term2623, term2623.getClass(), "supportsInlineQueries", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term2623, args);
    }

};



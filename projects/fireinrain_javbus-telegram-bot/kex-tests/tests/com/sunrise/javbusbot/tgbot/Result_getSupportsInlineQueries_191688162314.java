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

public class Result_getSupportsInlineQueries_191688162314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2929;

    public Result_getSupportsInlineQueries_191688162314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2929 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term2929, term2929.getClass(), "id", -244121226);
        setBooleanField(term2929, term2929.getClass(), "isBot", true);
        setField(term2929, term2929.getClass(), "firstName", "AdxvLJhNLe");
        setField(term2929, term2929.getClass(), "username", "lHfTrWKMPk");
        setBooleanField(term2929, term2929.getClass(), "canJoinGroups", false);
        setBooleanField(term2929, term2929.getClass(), "canReadAllGroupMessages", false);
        setBooleanField(term2929, term2929.getClass(), "supportsInlineQueries", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSupportsInlineQueries", argTypes, term2929, args);
    }

};



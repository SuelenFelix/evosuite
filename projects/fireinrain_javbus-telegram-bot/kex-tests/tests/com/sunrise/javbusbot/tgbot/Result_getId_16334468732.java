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

public class Result_getId_16334468732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2277;

    public Result_getId_16334468732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2277 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term2277, term2277.getClass(), "id", -1456670397);
        setBooleanField(term2277, term2277.getClass(), "isBot", false);
        setField(term2277, term2277.getClass(), "firstName", "XPKmummaqg");
        setField(term2277, term2277.getClass(), "username", "BKLfkLiZTH");
        setBooleanField(term2277, term2277.getClass(), "canJoinGroups", true);
        setBooleanField(term2277, term2277.getClass(), "canReadAllGroupMessages", true);
        setBooleanField(term2277, term2277.getClass(), "supportsInlineQueries", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2277, args);
    }

};



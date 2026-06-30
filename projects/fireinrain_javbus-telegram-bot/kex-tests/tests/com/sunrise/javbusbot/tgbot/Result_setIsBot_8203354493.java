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

public class Result_setIsBot_8203354493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2327;
     Object term2357;

    public Result_setIsBot_8203354493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2327 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term2327, term2327.getClass(), "id", 1622346318);
        setBooleanField(term2327, term2327.getClass(), "isBot", true);
        setField(term2327, term2327.getClass(), "firstName", "SPpkrGcPRr");
        setField(term2327, term2327.getClass(), "username", "sEccwbJKYE");
        setBooleanField(term2327, term2327.getClass(), "canJoinGroups", false);
        setBooleanField(term2327, term2327.getClass(), "canReadAllGroupMessages", false);
        setBooleanField(term2327, term2327.getClass(), "supportsInlineQueries", false);
        term2357 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2357;
        callMethod(klass, "setIsBot", argTypes, term2327, args);
    }

};



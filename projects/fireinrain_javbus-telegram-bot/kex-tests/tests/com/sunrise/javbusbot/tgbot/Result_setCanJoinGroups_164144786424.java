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

public class Result_setCanJoinGroups_164144786424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3031;
     Object term3037;

    public Result_setCanJoinGroups_164144786424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3031 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term3031, term3031.getClass(), "id", 0);
        setBooleanField(term3031, term3031.getClass(), "isBot", false);
        setField(term3031, term3031.getClass(), "firstName", null);
        setField(term3031, term3031.getClass(), "username", null);
        setBooleanField(term3031, term3031.getClass(), "canJoinGroups", false);
        setBooleanField(term3031, term3031.getClass(), "canReadAllGroupMessages", false);
        setBooleanField(term3031, term3031.getClass(), "supportsInlineQueries", false);
        term3037 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3037;
        callMethod(klass, "setCanJoinGroups", argTypes, term3031, args);
    }

};



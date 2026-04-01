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

public class Result_getFirstName_11803469766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2501;

    public Result_getFirstName_11803469766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2501 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Result"));
        setIntField(term2501, term2501.getClass(), "id", -6029667);
        setBooleanField(term2501, term2501.getClass(), "isBot", false);
        setField(term2501, term2501.getClass(), "firstName", "sEnIVFtZuQ");
        setField(term2501, term2501.getClass(), "username", "ZVecLZMLHF");
        setBooleanField(term2501, term2501.getClass(), "canJoinGroups", true);
        setBooleanField(term2501, term2501.getClass(), "canReadAllGroupMessages", false);
        setBooleanField(term2501, term2501.getClass(), "supportsInlineQueries", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term2501, args);
    }

};



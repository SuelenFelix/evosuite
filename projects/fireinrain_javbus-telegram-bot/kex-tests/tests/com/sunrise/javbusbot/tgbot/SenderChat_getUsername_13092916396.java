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

public class SenderChat_getUsername_13092916396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5852;

    public SenderChat_getUsername_13092916396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5852 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SenderChat"));
        setField(term5852, term5852.getClass(), "id", "vOuMEpOQAg");
        setField(term5852, term5852.getClass(), "title", "SIODFGaQhr");
        setField(term5852, term5852.getClass(), "username", "qYzsiuXOgS");
        setField(term5852, term5852.getClass(), "type", "bxrCBbrrct");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.SenderChat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term5852, args);
    }

};



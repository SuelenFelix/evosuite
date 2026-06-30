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

public class Chat_setId_199613362310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1947;

    public Chat_setId_199613362310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1947 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.Chat"));
        setField(term1947, term1947.getClass(), "id", null);
        setField(term1947, term1947.getClass(), "title", null);
        setField(term1947, term1947.getClass(), "username", null);
        setField(term1947, term1947.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.Chat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term1947, args);
    }

};



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

public class SenderChat_setTitle_14344318593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5541;

    public SenderChat_setTitle_14344318593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5541 = newInstance(Class.forName("com.sunrise.javbusbot.tgbot.SenderChat"));
        setField(term5541, term5541.getClass(), "id", "OcJCIDNIXA");
        setField(term5541, term5541.getClass(), "title", "XfRABIFVEp");
        setField(term5541, term5541.getClass(), "username", "MHGKyEnwKc");
        setField(term5541, term5541.getClass(), "type", "ShIELyuULw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.tgbot.SenderChat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IpQuOGMgmj";
        callMethod(klass, "setTitle", argTypes, term5541, args);
    }

};



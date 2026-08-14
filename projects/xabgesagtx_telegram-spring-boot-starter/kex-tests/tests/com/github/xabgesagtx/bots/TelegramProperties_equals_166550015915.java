package com.github.xabgesagtx.bots;

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
import static com.github.xabgesagtx.bots.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TelegramProperties_equals_166550015915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1776;
     Object term1837;

    public TelegramProperties_equals_166550015915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1776 = newInstance(Class.forName("com.github.xabgesagtx.bots.TelegramProperties"));
        setField(term1776, term1776.getClass(), "externalUrl", "idgaQsnJpQ");
        setField(term1776, term1776.getClass(), "internalUrl", "VgZnGoIFwQ");
        setField(term1776, term1776.getClass(), "keyStore", "jUbSRrkrYZ");
        setField(term1776, term1776.getClass(), "keyStorePassword", "bWWfajKbEX");
        setField(term1776, term1776.getClass(), "pathToCertificate", "cAPeiZHKGJ");
        term1837 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.xabgesagtx.bots.TelegramProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1837;
        callMethod(klass, "equals", argTypes, term1776, args);
    }

};



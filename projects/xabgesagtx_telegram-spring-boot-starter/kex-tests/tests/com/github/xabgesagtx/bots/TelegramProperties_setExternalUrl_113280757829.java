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

public class TelegramProperties_setExternalUrl_113280757829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2231;

    public TelegramProperties_setExternalUrl_113280757829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2231 = newInstance(Class.forName("com.github.xabgesagtx.bots.TelegramProperties"));
        setField(term2231, term2231.getClass(), "externalUrl", null);
        setField(term2231, term2231.getClass(), "internalUrl", null);
        setField(term2231, term2231.getClass(), "keyStore", null);
        setField(term2231, term2231.getClass(), "keyStorePassword", null);
        setField(term2231, term2231.getClass(), "pathToCertificate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.xabgesagtx.bots.TelegramProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExternalUrl", argTypes, term2231, args);
    }

};



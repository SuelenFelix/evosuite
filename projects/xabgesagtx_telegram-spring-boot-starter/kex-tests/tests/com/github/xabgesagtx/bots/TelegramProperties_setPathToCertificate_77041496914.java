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

public class TelegramProperties_setPathToCertificate_77041496914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1643;

    public TelegramProperties_setPathToCertificate_77041496914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1643 = newInstance(Class.forName("com.github.xabgesagtx.bots.TelegramProperties"));
        setField(term1643, term1643.getClass(), "externalUrl", "HqBOwkVqjD");
        setField(term1643, term1643.getClass(), "internalUrl", "MAcUBcBckh");
        setField(term1643, term1643.getClass(), "keyStore", "oVgzLbrsFr");
        setField(term1643, term1643.getClass(), "keyStorePassword", "vQVyKLdtaz");
        setField(term1643, term1643.getClass(), "pathToCertificate", "OWKQODBLzb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.xabgesagtx.bots.TelegramProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wGmYcqUkgE";
        callMethod(klass, "setPathToCertificate", argTypes, term1643, args);
    }

};



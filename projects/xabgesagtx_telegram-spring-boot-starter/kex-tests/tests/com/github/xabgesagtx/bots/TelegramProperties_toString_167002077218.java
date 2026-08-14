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

public class TelegramProperties_toString_167002077218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2111;

    public TelegramProperties_toString_167002077218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2111 = newInstance(Class.forName("com.github.xabgesagtx.bots.TelegramProperties"));
        setField(term2111, term2111.getClass(), "externalUrl", "DfISiziTgG");
        setField(term2111, term2111.getClass(), "internalUrl", "XqgfKFvPSD");
        setField(term2111, term2111.getClass(), "keyStore", "JiVRgTZvKc");
        setField(term2111, term2111.getClass(), "keyStorePassword", "XPKmummaqg");
        setField(term2111, term2111.getClass(), "pathToCertificate", "BKLfkLiZTH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.xabgesagtx.bots.TelegramProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2111, args);
    }

};



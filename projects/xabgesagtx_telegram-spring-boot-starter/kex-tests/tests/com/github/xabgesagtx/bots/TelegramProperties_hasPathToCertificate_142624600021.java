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

public class TelegramProperties_hasPathToCertificate_142624600021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2224;

    public TelegramProperties_hasPathToCertificate_142624600021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2224 = newInstance(Class.forName("com.github.xabgesagtx.bots.TelegramProperties"));
        setField(term2224, term2224.getClass(), "externalUrl", null);
        setField(term2224, term2224.getClass(), "internalUrl", null);
        setField(term2224, term2224.getClass(), "keyStore", null);
        setField(term2224, term2224.getClass(), "keyStorePassword", null);
        setField(term2224, term2224.getClass(), "pathToCertificate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.xabgesagtx.bots.TelegramProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasPathToCertificate", argTypes, term2224, args);
    }

};



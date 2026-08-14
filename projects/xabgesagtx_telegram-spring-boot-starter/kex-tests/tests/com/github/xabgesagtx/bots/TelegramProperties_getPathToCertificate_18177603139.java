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

public class TelegramProperties_getPathToCertificate_18177603139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1000;

    public TelegramProperties_getPathToCertificate_18177603139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1000 = newInstance(Class.forName("com.github.xabgesagtx.bots.TelegramProperties"));
        setField(term1000, term1000.getClass(), "externalUrl", "GzFkzHGYFt");
        setField(term1000, term1000.getClass(), "internalUrl", "tShwQLRGNe");
        setField(term1000, term1000.getClass(), "keyStore", "LvtrsXUliU");
        setField(term1000, term1000.getClass(), "keyStorePassword", "xLbjWUgOIL");
        setField(term1000, term1000.getClass(), "pathToCertificate", "jDtqGUpnZN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.xabgesagtx.bots.TelegramProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathToCertificate", argTypes, term1000, args);
    }

};



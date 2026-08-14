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

public class TelegramProperties_getInternalUrl_5946696846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term667;

    public TelegramProperties_getInternalUrl_5946696846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term667 = newInstance(Class.forName("com.github.xabgesagtx.bots.TelegramProperties"));
        setField(term667, term667.getClass(), "externalUrl", "OWDIEULEFu");
        setField(term667, term667.getClass(), "internalUrl", "dWRymuLBtr");
        setField(term667, term667.getClass(), "keyStore", "AijpHYOFuy");
        setField(term667, term667.getClass(), "keyStorePassword", "SbAoxhfrkn");
        setField(term667, term667.getClass(), "pathToCertificate", "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.xabgesagtx.bots.TelegramProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInternalUrl", argTypes, term667, args);
    }

};



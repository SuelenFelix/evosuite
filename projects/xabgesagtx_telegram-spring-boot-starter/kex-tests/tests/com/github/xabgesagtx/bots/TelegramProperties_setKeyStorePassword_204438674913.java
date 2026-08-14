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

public class TelegramProperties_setKeyStorePassword_204438674913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1510;

    public TelegramProperties_setKeyStorePassword_204438674913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1510 = newInstance(Class.forName("com.github.xabgesagtx.bots.TelegramProperties"));
        setField(term1510, term1510.getClass(), "externalUrl", "tPlsykYBqO");
        setField(term1510, term1510.getClass(), "internalUrl", "bLPjGVBhlX");
        setField(term1510, term1510.getClass(), "keyStore", "whBvTVIIlC");
        setField(term1510, term1510.getClass(), "keyStorePassword", "IgRJUzaCwW");
        setField(term1510, term1510.getClass(), "pathToCertificate", "JUmudUmaaV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.xabgesagtx.bots.TelegramProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KoyGrUJeJW";
        callMethod(klass, "setKeyStorePassword", argTypes, term1510, args);
    }

};



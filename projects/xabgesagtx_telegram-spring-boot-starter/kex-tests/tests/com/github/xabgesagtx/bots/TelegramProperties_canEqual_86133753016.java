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

public class TelegramProperties_canEqual_86133753016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1888;
     Object term1949;

    public TelegramProperties_canEqual_86133753016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1888 = newInstance(Class.forName("com.github.xabgesagtx.bots.TelegramProperties"));
        setField(term1888, term1888.getClass(), "externalUrl", "LvJFtLBaxj");
        setField(term1888, term1888.getClass(), "internalUrl", "PHvxnGHptP");
        setField(term1888, term1888.getClass(), "keyStore", "TimdotUuNC");
        setField(term1888, term1888.getClass(), "keyStorePassword", "PkWMRdJcBb");
        setField(term1888, term1888.getClass(), "pathToCertificate", "jSpAteRute");
        term1949 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.xabgesagtx.bots.TelegramProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1949;
        callMethod(klass, "canEqual", argTypes, term1888, args);
    }

};



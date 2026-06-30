package com.kv.webflux.logging.provider;

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
import static com.kv.webflux.logging.provider.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class TimeElapsedProvider_createMessage_11895662491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term529;
     Object term530;

    public TimeElapsedProvider_createMessage_11895662491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term529 = newInstance(Class.forName("com.kv.webflux.logging.provider.TimeElapsedProvider"));
        term530 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.provider.TimeElapsedProvider");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term530;
        callMethod(klass, "createMessage", argTypes, term529, args);
    }

};



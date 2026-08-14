package com.bslota.optimisticapi.holding.infrastructure.rest;

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
import static com.bslota.optimisticapi.holding.infrastructure.rest.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;

public class UpdateBookStatus_init_871718860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;
     Object term14;
     Object term17;

    public UpdateBookStatus_init_871718860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51 = Class.forName((String) "com.bslota.optimisticapi.holding.domain.Status");
        Field term50 = ((Class) term51).getDeclaredField((String) "AVAILABLE");
        ((Field) term50).setAccessible(true);
        enum0 = ((Field) term50).get((Object) null);
        term14 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term14, term14.getClass(), "mostSigBits", 2442117782898005296L);
        setLongField(term14, term14.getClass(), "leastSigBits", 6375119433582206027L);
        term17 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.infrastructure.rest.UpdateBookStatus");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.domain.Status");
        argTypes[1] = Class.forName("java.util.UUID");
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = enum0;
        args[1] = term14;
        args[2] = term17;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



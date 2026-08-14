package com.bslota.optimisticapi.holding.infrastructure.jpa;

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
import static com.bslota.optimisticapi.holding.infrastructure.jpa.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;

public class BookEntity_init_17633583921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term40;
     Object enum0;
     Object term56;

    public BookEntity_init_17633583921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term1, term1.getClass(), "mostSigBits", 2442117782898005296L);
        setLongField(term1, term1.getClass(), "leastSigBits", 6375119433582206027L);
        term40 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term40, term40.getClass(), "mostSigBits", -8257434502486459194L);
        setLongField(term40, term40.getClass(), "leastSigBits", -8400487765614892086L);
        Class<? extends Object> term120 = Class.forName((String) "com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntityStatus");
        Field term119 = ((Class) term120).getDeclaredField((String) "AVAILABLE");
        ((Field) term119).setAccessible(true);
        enum0 = ((Field) term119).get((Object) null);
        term56 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntity");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.util.UUID");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.util.UUID");
        argTypes[5] = Class.forName("com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntityStatus");
        argTypes[6] = long.class;
        Object[] args = new Object[7];
        args[0] = term1;
        args[1] = "PAEBtnZtTD";
        args[2] = "sjlJAEtRrb";
        args[3] = "MuLcgQHgqz";
        args[4] = term40;
        args[5] = enum0;
        args[6] = term56;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



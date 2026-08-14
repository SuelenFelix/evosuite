package com.acme.types;

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
import static com.acme.types.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Award_setId_17889961413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4690;

    public Award_setId_17889961413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4755 = Class.forName((String) "com.acme.types.AwardName");
        Field term4754 = ((Class) term4755).getDeclaredField((String) "ORWELL_PRIZE");
        ((Field) term4754).setAccessible(true);
        Object enum8 = ((Field) term4754).get((Object) null);
        term4690 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term4690, term4690.getClass(), "id", "ZLOixiOrLS");
        setField(term4690, term4690.getClass(), "awardName", enum8);
        setField(term4690, term4690.getClass(), "category", "jyRmrZMyEy");
        setIntField(term4690, term4690.getClass(), "year", 1072005683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Award");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EMhKuKuvTr";
        callMethod(klass, "setId", argTypes, term4690, args);
    }

};



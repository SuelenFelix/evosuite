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

public class Award_Builder_category_15125417664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3754;

    public Award_Builder_category_15125417664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3818 = Class.forName((String) "com.acme.types.AwardName");
        Field term3817 = ((Class) term3818).getDeclaredField((String) "DYLAN_PRIZE");
        ((Field) term3817).setAccessible(true);
        Object enum4 = ((Field) term3817).get((Object) null);
        term3754 = newInstance(Class.forName("com.acme.types.Award$Builder"));
        setField(term3754, term3754.getClass(), "id", "wzvrwvpSgi");
        setField(term3754, term3754.getClass(), "awardName", enum4);
        setField(term3754, term3754.getClass(), "category", "qwrZBRPuHr");
        setIntField(term3754, term3754.getClass(), "year", -893623680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Award$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZlmkgzeZIu";
        callMethod(klass, "category", argTypes, term3754, args);
    }

};



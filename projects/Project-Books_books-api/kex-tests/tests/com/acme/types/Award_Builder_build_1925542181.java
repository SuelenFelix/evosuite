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

public class Award_Builder_build_1925542181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2716;

    public Award_Builder_build_1925542181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2904 = Class.forName((String) "com.acme.types.AwardName");
        Field term2903 = ((Class) term2904).getDeclaredField((String) "PORTICO_PRIZE");
        ((Field) term2903).setAccessible(true);
        Object enum0 = ((Field) term2903).get((Object) null);
        term2716 = newInstance(Class.forName("com.acme.types.Award$Builder"));
        setField(term2716, term2716.getClass(), "id", "eXlhmImRUd");
        setField(term2716, term2716.getClass(), "awardName", enum0);
        setField(term2716, term2716.getClass(), "category", "pNjJQBsfBv");
        setIntField(term2716, term2716.getClass(), "year", 1141317871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Award$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2716, args);
    }

};



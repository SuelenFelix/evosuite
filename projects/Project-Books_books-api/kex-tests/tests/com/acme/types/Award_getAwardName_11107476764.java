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

public class Award_getAwardName_11107476764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4937;

    public Award_getAwardName_11107476764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4991 = Class.forName((String) "com.acme.types.AwardName");
        Field term4990 = ((Class) term4991).getDeclaredField((String) "BAILLIE_PRIZE");
        ((Field) term4990).setAccessible(true);
        Object enum9 = ((Field) term4990).get((Object) null);
        term4937 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term4937, term4937.getClass(), "id", "hjuOnNVIUc");
        setField(term4937, term4937.getClass(), "awardName", enum9);
        setField(term4937, term4937.getClass(), "category", "MTxeYrMCEJ");
        setIntField(term4937, term4937.getClass(), "year", 1861318859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Award");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAwardName", argTypes, term4937, args);
    }

};



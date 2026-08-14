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

public class Award_Builder_awardName_4562444183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3326;
     Object enum3;

    public Award_Builder_awardName_4562444183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3401 = Class.forName((String) "com.acme.types.AwardName");
        Field term3400 = ((Class) term3401).getDeclaredField((String) "ORWELL_PRIZE");
        ((Field) term3400).setAccessible(true);
        Object enum2 = ((Field) term3400).get((Object) null);
        term3326 = newInstance(Class.forName("com.acme.types.Award$Builder"));
        setField(term3326, term3326.getClass(), "id", "cKqYMrtneQ");
        setField(term3326, term3326.getClass(), "awardName", enum2);
        setField(term3326, term3326.getClass(), "category", "CgvYDHvQnF");
        setIntField(term3326, term3326.getClass(), "year", 691577392);
        Class<? extends Object> term3574 = Class.forName((String) "com.acme.types.AwardName");
        Field term3573 = ((Class) term3574).getDeclaredField((String) "BOOKER_INTER_PRIZE");
        ((Field) term3573).setAccessible(true);
        enum3 = ((Field) term3573).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Award$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.acme.types.AwardName");
        Object[] args = new Object[1];
        args[0] = enum3;
        callMethod(klass, "awardName", argTypes, term3326, args);
    }

};



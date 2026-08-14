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
import java.lang.Integer;

public class Award_Builder_year_9035866865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3997;
     Object term4039;

    public Award_Builder_year_9035866865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4052 = Class.forName((String) "com.acme.types.AwardName");
        Field term4051 = ((Class) term4052).getDeclaredField((String) "ORWELL_PRIZE");
        ((Field) term4051).setAccessible(true);
        Object enum5 = ((Field) term4051).get((Object) null);
        term3997 = newInstance(Class.forName("com.acme.types.Award$Builder"));
        setField(term3997, term3997.getClass(), "id", "SFuBQQfwki");
        setField(term3997, term3997.getClass(), "awardName", enum5);
        setField(term3997, term3997.getClass(), "category", "ryTUTfVgWx");
        setIntField(term3997, term3997.getClass(), "year", -1963434938);
        term4039 = new Integer(906181092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Award$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4039;
        callMethod(klass, "year", argTypes, term3997, args);
    }

};



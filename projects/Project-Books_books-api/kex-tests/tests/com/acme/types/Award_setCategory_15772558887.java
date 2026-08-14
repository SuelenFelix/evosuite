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

public class Award_setCategory_15772558887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5799;

    public Award_setCategory_15772558887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5863 = Class.forName((String) "com.acme.types.AwardName");
        Field term5862 = ((Class) term5863).getDeclaredField((String) "NOBEL_PRIZE");
        ((Field) term5862).setAccessible(true);
        Object enum13 = ((Field) term5862).get((Object) null);
        term5799 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term5799, term5799.getClass(), "id", "CXNFlzEpBC");
        setField(term5799, term5799.getClass(), "awardName", enum13);
        setField(term5799, term5799.getClass(), "category", "qnsCYAsHRu");
        setIntField(term5799, term5799.getClass(), "year", 53410913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Award");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qMoCYznUOe";
        callMethod(klass, "setCategory", argTypes, term5799, args);
    }

};



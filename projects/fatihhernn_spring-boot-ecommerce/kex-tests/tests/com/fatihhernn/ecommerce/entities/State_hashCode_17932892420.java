package com.fatihhernn.ecommerce.entities;

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
import static com.fatihhernn.ecommerce.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class State_hashCode_17932892420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term930;

    public State_hashCode_17932892420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term930 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term930, term930.getClass(), "id", 0);
        setField(term930, term930.getClass(), "name", null);
        setField(term930, term930.getClass(), "country", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.State");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term930, args);
    }

};



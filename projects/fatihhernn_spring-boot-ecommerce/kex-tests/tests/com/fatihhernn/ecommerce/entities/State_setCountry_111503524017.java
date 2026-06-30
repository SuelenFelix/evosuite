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

public class State_setCountry_111503524017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term924;

    public State_setCountry_111503524017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term924 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term924, term924.getClass(), "id", 0);
        setField(term924, term924.getClass(), "name", null);
        setField(term924, term924.getClass(), "country", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.State");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fatihhernn.ecommerce.entities.Country");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCountry", argTypes, term924, args);
    }

};



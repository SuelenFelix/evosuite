package com.skyg0d.spring.jwt.property;

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
import static com.skyg0d.spring.jwt.property.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DefaultDataProps_DefaultUser_toString_76938058815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term750;

    public DefaultDataProps_DefaultUser_toString_76938058815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term750 = newInstance(Class.forName("com.skyg0d.spring.jwt.property.DefaultDataProps$DefaultUser"));
        setField(term750, term750.getClass(), "email", null);
        setField(term750, term750.getClass(), "password", null);
        setField(term750, term750.getClass(), "username", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.property.DefaultDataProps$DefaultUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term750, args);
    }

};



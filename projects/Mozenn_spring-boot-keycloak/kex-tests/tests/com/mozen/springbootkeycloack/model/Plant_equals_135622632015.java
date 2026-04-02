package com.mozen.springbootkeycloack.model;

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
import static com.mozen.springbootkeycloack.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Plant_equals_135622632015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term935;
     Object term977;

    public Plant_equals_135622632015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term936 = new Long(-4325723315152823407L);
        term935 = newInstance(Class.forName("com.mozen.springbootkeycloack.model.Plant"));
        Object term974 = newInstance(Class.forName("java.time.Instant"));
        setField(term935, term935.getClass(), "id", term936);
        setField(term935, term935.getClass(), "name", "aKnKipADSo");
        setField(term935, term935.getClass(), "scientificName", "wSQxaModmm");
        setField(term935, term935.getClass(), "family", "UlajhuVLaP");
        setLongField(term974, term974.getClass(), "seconds", 1775105447L);
        setIntField(term974, term974.getClass(), "nanos", 14362000);
        setField(term935, term935.getClass(), "createdAt", term974);
        term977 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootkeycloack.model.Plant");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term977;
        callMethod(klass, "equals", argTypes, term935, args);
    }

};



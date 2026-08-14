package com.scaleguard.server.kafka.models;

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
import static com.scaleguard.server.kafka.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class TransformerInfo_setSkipPreprocessing_6153499779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325;
     Object term327;

    public TransformerInfo_setSkipPreprocessing_6153499779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term325 = newInstance(Class.forName("com.scaleguard.server.kafka.models.TransformerInfo"));
        setBooleanField(term325, term325.getClass(), "skipPreprocessing", false);
        setField(term325, term325.getClass(), "entityName", null);
        setField(term325, term325.getClass(), "transformerId", null);
        term327 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.kafka.models.TransformerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term327;
        callMethod(klass, "setSkipPreprocessing", argTypes, term325, args);
    }

};



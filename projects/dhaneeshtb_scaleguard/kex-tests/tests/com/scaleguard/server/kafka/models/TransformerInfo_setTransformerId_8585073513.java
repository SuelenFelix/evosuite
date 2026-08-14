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

public class TransformerInfo_setTransformerId_8585073513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335;

    public TransformerInfo_setTransformerId_8585073513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term335 = newInstance(Class.forName("com.scaleguard.server.kafka.models.TransformerInfo"));
        setBooleanField(term335, term335.getClass(), "skipPreprocessing", false);
        setField(term335, term335.getClass(), "entityName", null);
        setField(term335, term335.getClass(), "transformerId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.kafka.models.TransformerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTransformerId", argTypes, term335, args);
    }

};



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

public class TransformerInfo_setEntityName_15738126574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141;

    public TransformerInfo_setEntityName_15738126574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141 = newInstance(Class.forName("com.scaleguard.server.kafka.models.TransformerInfo"));
        setBooleanField(term141, term141.getClass(), "skipPreprocessing", true);
        setField(term141, term141.getClass(), "entityName", "SzjVpOQTyS");
        setField(term141, term141.getClass(), "transformerId", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.kafka.models.TransformerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        callMethod(klass, "setEntityName", argTypes, term141, args);
    }

};



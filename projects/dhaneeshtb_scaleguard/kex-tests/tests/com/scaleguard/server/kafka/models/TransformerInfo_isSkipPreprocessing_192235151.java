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

public class TransformerInfo_isSkipPreprocessing_192235151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public TransformerInfo_isSkipPreprocessing_192235151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.scaleguard.server.kafka.models.TransformerInfo"));
        setBooleanField(term1, term1.getClass(), "skipPreprocessing", false);
        setField(term1, term1.getClass(), "entityName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "transformerId", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.kafka.models.TransformerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSkipPreprocessing", argTypes, term1, args);
    }

};



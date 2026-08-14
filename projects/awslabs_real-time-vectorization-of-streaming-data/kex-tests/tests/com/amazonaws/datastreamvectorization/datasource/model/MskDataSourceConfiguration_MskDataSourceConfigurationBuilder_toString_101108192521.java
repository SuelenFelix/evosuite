package com.amazonaws.datastreamvectorization.datasource.model;

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
import static com.amazonaws.datastreamvectorization.datasource.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_toString_101108192521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5662;

    public MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_toString_101108192521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5662 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder"));
        setField(term5662, term5662.getClass(), "bootstrapServers", null);
        setField(term5662, term5662.getClass(), "topicNames", null);
        setField(term5662, term5662.getClass(), "topicPattern", null);
        setField(term5662, term5662.getClass(), "groupId", null);
        setField(term5662, term5662.getClass(), "startingOffset", null);
        setField(term5662, term5662.getClass(), "kafkaProperties", null);
        setField(term5662, term5662.getClass(), "authType", null);
        setField(term5662, term5662.getClass(), "streamDataType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5662, args);
    }

};



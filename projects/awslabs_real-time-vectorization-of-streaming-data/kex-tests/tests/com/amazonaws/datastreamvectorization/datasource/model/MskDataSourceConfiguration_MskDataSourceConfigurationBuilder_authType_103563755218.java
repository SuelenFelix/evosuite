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

public class MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_authType_103563755218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5659;

    public MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_authType_103563755218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5659 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder"));
        setField(term5659, term5659.getClass(), "bootstrapServers", null);
        setField(term5659, term5659.getClass(), "topicNames", null);
        setField(term5659, term5659.getClass(), "topicPattern", null);
        setField(term5659, term5659.getClass(), "groupId", null);
        setField(term5659, term5659.getClass(), "startingOffset", null);
        setField(term5659, term5659.getClass(), "kafkaProperties", null);
        setField(term5659, term5659.getClass(), "authType", null);
        setField(term5659, term5659.getClass(), "streamDataType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskAuthType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "authType", argTypes, term5659, args);
    }

};



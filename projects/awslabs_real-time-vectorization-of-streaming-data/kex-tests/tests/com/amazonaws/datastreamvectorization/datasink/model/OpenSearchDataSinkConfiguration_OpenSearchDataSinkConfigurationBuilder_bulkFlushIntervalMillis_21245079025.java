package com.amazonaws.datastreamvectorization.datasink.model;

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
import static com.amazonaws.datastreamvectorization.datasink.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;

public class OpenSearchDataSinkConfiguration_OpenSearchDataSinkConfigurationBuilder_bulkFlushIntervalMillis_21245079025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12198;
     Object term12256;

    public OpenSearchDataSinkConfiguration_OpenSearchDataSinkConfigurationBuilder_bulkFlushIntervalMillis_21245079025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12289 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasink.model.OpenSearchType");
        Field term12288 = ((Class) term12289).getDeclaredField((String) "SERVERLESS");
        ((Field) term12288).setAccessible(true);
        Object enum27 = ((Field) term12288).get((Object) null);
        term12198 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration$OpenSearchDataSinkConfigurationBuilder"));
        setField(term12198, term12198.getClass(), "endpoint", "whBvTVIIlC");
        setField(term12198, term12198.getClass(), "index", "IgRJUzaCwW");
        setField(term12198, term12198.getClass(), "region", "JUmudUmaaV");
        setField(term12198, term12198.getClass(), "openSearchType", enum27);
        setLongField(term12198, term12198.getClass(), "bulkFlushIntervalMillis", -2585684163342970173L);
        term12256 = new Long(8059786003080744426L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasink.model.OpenSearchDataSinkConfiguration$OpenSearchDataSinkConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term12256;
        callMethod(klass, "bulkFlushIntervalMillis", argTypes, term12198, args);
    }

};



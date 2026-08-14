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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_streamDataType_13632517578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3933;

    public MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_streamDataType_13632517578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3946 = new ArrayList();
        ((ArrayList) term3946).add("dEnhdmILtU");
        ((ArrayList) term3946).add("hoicvmsovO");
        ((ArrayList) term3946).add("eqJfYWRaEL");
        ((ArrayList) term3946).add("fhkbdRViHi");
        ((ArrayList) term3946).add("uWHnvSvaPl");
        ((ArrayList) term3946).add("kBdSllIBVz");
        ((ArrayList) term3946).add("TJmVBGfTML");
        ((ArrayList) term3946).add("tPlsykYBqO");
        ((ArrayList) term3946).add("bLPjGVBhlX");
        Class<? extends Object> term4220 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasource.model.MskAuthType");
        Field term4219 = ((Class) term4220).getDeclaredField((String) "IAM");
        ((Field) term4219).setAccessible(true);
        Object enum7 = ((Field) term4219).get((Object) null);
        term3933 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder"));
        Object term4082 = newInstance(Class.forName("java.util.Properties"));
        Object term4083 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term3933, term3933.getClass(), "bootstrapServers", "ieCtQFdkii");
        setField(term3933, term3933.getClass(), "topicNames", term3946);
        setField(term3933, term3933.getClass(), "topicPattern", "whBvTVIIlC");
        setField(term3933, term3933.getClass(), "groupId", "IgRJUzaCwW");
        setField(term3933, term3933.getClass(), "startingOffset", null);
        setField(term4082, term4082.getClass(), "defaults", null);
        setField(term4083, term4083.getClass(), "table", null);
        setField(term4083, term4083.getClass(), "nextTable", null);
        setLongField(term4083, term4083.getClass(), "baseCount", 0L);
        setIntField(term4083, term4083.getClass(), "sizeCtl", 16);
        setIntField(term4083, term4083.getClass(), "transferIndex", 0);
        setIntField(term4083, term4083.getClass(), "cellsBusy", 0);
        setField(term4083, term4083.getClass(), "counterCells", null);
        setField(term4083, term4083.getClass(), "keySet", null);
        setField(term4083, term4083.getClass(), "values", null);
        setField(term4083, term4083.getClass(), "entrySet", null);
        setField(term4083, term4083.getClass(), "keySet", null);
        setField(term4083, term4083.getClass(), "values", null);
        setField(term4082, term4082.getClass(), "map", term4083);
        setField(term4082, term4082.getClass(), "table", null);
        setIntField(term4082, term4082.getClass(), "count", 0);
        setIntField(term4082, term4082.getClass(), "threshold", 0);
        setFloatField(term4082, term4082.getClass(), "loadFactor", 0.0F);
        setIntField(term4082, term4082.getClass(), "modCount", 0);
        setField(term4082, term4082.getClass(), "keySet", null);
        setField(term4082, term4082.getClass(), "entrySet", null);
        setField(term4082, term4082.getClass(), "values", null);
        setField(term3933, term3933.getClass(), "kafkaProperties", term4082);
        setField(term3933, term3933.getClass(), "authType", enum7);
        setField(term3933, term3933.getClass(), "streamDataType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.StreamDataType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "streamDataType", argTypes, term3933, args);
    }

};



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
import java.util.HashMap;

public class MskDataSourceConfiguration_populateTopicConfiguration_11777237082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5721;
     Object term5803;

    public MskDataSourceConfiguration_populateTopicConfiguration_11777237082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5734 = new ArrayList();
        ((ArrayList) term5734).add("swZVeJAxjt");
        ((ArrayList) term5734).add("xOcJIiQQDu");
        Class<? extends Object> term5894 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasource.model.MskAuthType");
        Field term5893 = ((Class) term5894).getDeclaredField((String) "IAM");
        ((Field) term5893).setAccessible(true);
        Object enum10 = ((Field) term5893).get((Object) null);
        term5721 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder"));
        Object term5786 = newInstance(Class.forName("java.util.Properties"));
        Object term5787 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term5721, term5721.getClass(), "bootstrapServers", "jSpAteRute");
        setField(term5721, term5721.getClass(), "topicNames", term5734);
        setField(term5721, term5721.getClass(), "topicPattern", "GVizqqzXpy");
        setField(term5721, term5721.getClass(), "groupId", "JqXGgAhZPl");
        setField(term5721, term5721.getClass(), "startingOffset", null);
        setField(term5786, term5786.getClass(), "defaults", null);
        setField(term5787, term5787.getClass(), "table", null);
        setField(term5787, term5787.getClass(), "nextTable", null);
        setLongField(term5787, term5787.getClass(), "baseCount", 0L);
        setIntField(term5787, term5787.getClass(), "sizeCtl", 16);
        setIntField(term5787, term5787.getClass(), "transferIndex", 0);
        setIntField(term5787, term5787.getClass(), "cellsBusy", 0);
        setField(term5787, term5787.getClass(), "counterCells", null);
        setField(term5787, term5787.getClass(), "keySet", null);
        setField(term5787, term5787.getClass(), "values", null);
        setField(term5787, term5787.getClass(), "entrySet", null);
        setField(term5787, term5787.getClass(), "keySet", null);
        setField(term5787, term5787.getClass(), "values", null);
        setField(term5786, term5786.getClass(), "map", term5787);
        setField(term5786, term5786.getClass(), "table", null);
        setIntField(term5786, term5786.getClass(), "count", 0);
        setIntField(term5786, term5786.getClass(), "threshold", 0);
        setFloatField(term5786, term5786.getClass(), "loadFactor", 0.0F);
        setIntField(term5786, term5786.getClass(), "modCount", 0);
        setField(term5786, term5786.getClass(), "keySet", null);
        setField(term5786, term5786.getClass(), "entrySet", null);
        setField(term5786, term5786.getClass(), "values", null);
        setField(term5721, term5721.getClass(), "kafkaProperties", term5786);
        setField(term5721, term5721.getClass(), "authType", enum10);
        setField(term5721, term5721.getClass(), "streamDataType", null);
        term5803 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder");
        argTypes[1] = Class.forName("java.util.Properties");
        Object[] args = new Object[2];
        args[0] = term5721;
        args[1] = term5803;
        callMethod(klass, "populateTopicConfiguration", argTypes, null, args);
    }

};



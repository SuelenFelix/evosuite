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

public class MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_startingOffset_13027830535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2209;

    public MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_startingOffset_13027830535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2222 = new ArrayList();
        Class<? extends Object> term2298 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasource.model.MskAuthType");
        Field term2297 = ((Class) term2298).getDeclaredField((String) "IAM");
        ((Field) term2297).setAccessible(true);
        Object enum4 = ((Field) term2297).get((Object) null);
        term2209 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder"));
        Object term2250 = newInstance(Class.forName("java.util.Properties"));
        Object term2251 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term2209, term2209.getClass(), "bootstrapServers", "SbAoxhfrkn");
        setField(term2209, term2209.getClass(), "topicNames", term2222);
        setField(term2209, term2209.getClass(), "topicPattern", "kuTXqwMtDB");
        setField(term2209, term2209.getClass(), "groupId", "Ghbwtircqb");
        setField(term2209, term2209.getClass(), "startingOffset", null);
        setField(term2250, term2250.getClass(), "defaults", null);
        setField(term2251, term2251.getClass(), "table", null);
        setField(term2251, term2251.getClass(), "nextTable", null);
        setLongField(term2251, term2251.getClass(), "baseCount", 0L);
        setIntField(term2251, term2251.getClass(), "sizeCtl", 16);
        setIntField(term2251, term2251.getClass(), "transferIndex", 0);
        setIntField(term2251, term2251.getClass(), "cellsBusy", 0);
        setField(term2251, term2251.getClass(), "counterCells", null);
        setField(term2251, term2251.getClass(), "keySet", null);
        setField(term2251, term2251.getClass(), "values", null);
        setField(term2251, term2251.getClass(), "entrySet", null);
        setField(term2251, term2251.getClass(), "keySet", null);
        setField(term2251, term2251.getClass(), "values", null);
        setField(term2250, term2250.getClass(), "map", term2251);
        setField(term2250, term2250.getClass(), "table", null);
        setIntField(term2250, term2250.getClass(), "count", 0);
        setIntField(term2250, term2250.getClass(), "threshold", 0);
        setFloatField(term2250, term2250.getClass(), "loadFactor", 0.0F);
        setIntField(term2250, term2250.getClass(), "modCount", 0);
        setField(term2250, term2250.getClass(), "keySet", null);
        setField(term2250, term2250.getClass(), "entrySet", null);
        setField(term2250, term2250.getClass(), "values", null);
        setField(term2209, term2209.getClass(), "kafkaProperties", term2250);
        setField(term2209, term2209.getClass(), "authType", enum4);
        setField(term2209, term2209.getClass(), "streamDataType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.StartingOffset");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "startingOffset", argTypes, term2209, args);
    }

};



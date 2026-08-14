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

public class MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_build_12712943389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4565;

    public MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_build_12712943389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4578 = new ArrayList();
        ((ArrayList) term4578).add("KoyGrUJeJW");
        ((ArrayList) term4578).add("HqBOwkVqjD");
        ((ArrayList) term4578).add("MAcUBcBckh");
        Class<? extends Object> term4720 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasource.model.MskAuthType");
        Field term4719 = ((Class) term4720).getDeclaredField((String) "IAM");
        ((Field) term4719).setAccessible(true);
        Object enum8 = ((Field) term4719).get((Object) null);
        term4565 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder"));
        Object term4642 = newInstance(Class.forName("java.util.Properties"));
        Object term4643 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term4565, term4565.getClass(), "bootstrapServers", "JUmudUmaaV");
        setField(term4565, term4565.getClass(), "topicNames", term4578);
        setField(term4565, term4565.getClass(), "topicPattern", "oVgzLbrsFr");
        setField(term4565, term4565.getClass(), "groupId", "vQVyKLdtaz");
        setField(term4565, term4565.getClass(), "startingOffset", null);
        setField(term4642, term4642.getClass(), "defaults", null);
        setField(term4643, term4643.getClass(), "table", null);
        setField(term4643, term4643.getClass(), "nextTable", null);
        setLongField(term4643, term4643.getClass(), "baseCount", 0L);
        setIntField(term4643, term4643.getClass(), "sizeCtl", 16);
        setIntField(term4643, term4643.getClass(), "transferIndex", 0);
        setIntField(term4643, term4643.getClass(), "cellsBusy", 0);
        setField(term4643, term4643.getClass(), "counterCells", null);
        setField(term4643, term4643.getClass(), "keySet", null);
        setField(term4643, term4643.getClass(), "values", null);
        setField(term4643, term4643.getClass(), "entrySet", null);
        setField(term4643, term4643.getClass(), "keySet", null);
        setField(term4643, term4643.getClass(), "values", null);
        setField(term4642, term4642.getClass(), "map", term4643);
        setField(term4642, term4642.getClass(), "table", null);
        setIntField(term4642, term4642.getClass(), "count", 0);
        setIntField(term4642, term4642.getClass(), "threshold", 0);
        setFloatField(term4642, term4642.getClass(), "loadFactor", 0.0F);
        setIntField(term4642, term4642.getClass(), "modCount", 0);
        setField(term4642, term4642.getClass(), "keySet", null);
        setField(term4642, term4642.getClass(), "entrySet", null);
        setField(term4642, term4642.getClass(), "values", null);
        setField(term4565, term4565.getClass(), "kafkaProperties", term4642);
        setField(term4565, term4565.getClass(), "authType", enum8);
        setField(term4565, term4565.getClass(), "streamDataType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term4565, args);
    }

};



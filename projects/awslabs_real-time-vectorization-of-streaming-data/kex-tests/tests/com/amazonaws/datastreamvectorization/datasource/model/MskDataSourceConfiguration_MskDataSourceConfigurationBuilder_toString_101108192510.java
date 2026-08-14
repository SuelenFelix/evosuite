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

public class MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_toString_101108192510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5065;

    public MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_toString_101108192510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5078 = new ArrayList();
        ((ArrayList) term5078).add("wGmYcqUkgE");
        ((ArrayList) term5078).add("idgaQsnJpQ");
        ((ArrayList) term5078).add("VgZnGoIFwQ");
        ((ArrayList) term5078).add("jUbSRrkrYZ");
        ((ArrayList) term5078).add("bWWfajKbEX");
        ((ArrayList) term5078).add("cAPeiZHKGJ");
        ((ArrayList) term5078).add("LvJFtLBaxj");
        Class<? extends Object> term5308 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasource.model.MskAuthType");
        Field term5307 = ((Class) term5308).getDeclaredField((String) "IAM");
        ((Field) term5307).setAccessible(true);
        Object enum9 = ((Field) term5307).get((Object) null);
        term5065 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder"));
        Object term5190 = newInstance(Class.forName("java.util.Properties"));
        Object term5191 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term5065, term5065.getClass(), "bootstrapServers", "OWKQODBLzb");
        setField(term5065, term5065.getClass(), "topicNames", term5078);
        setField(term5065, term5065.getClass(), "topicPattern", "PHvxnGHptP");
        setField(term5065, term5065.getClass(), "groupId", "TimdotUuNC");
        setField(term5065, term5065.getClass(), "startingOffset", null);
        setField(term5190, term5190.getClass(), "defaults", null);
        setField(term5191, term5191.getClass(), "table", null);
        setField(term5191, term5191.getClass(), "nextTable", null);
        setLongField(term5191, term5191.getClass(), "baseCount", 0L);
        setIntField(term5191, term5191.getClass(), "sizeCtl", 16);
        setIntField(term5191, term5191.getClass(), "transferIndex", 0);
        setIntField(term5191, term5191.getClass(), "cellsBusy", 0);
        setField(term5191, term5191.getClass(), "counterCells", null);
        setField(term5191, term5191.getClass(), "keySet", null);
        setField(term5191, term5191.getClass(), "values", null);
        setField(term5191, term5191.getClass(), "entrySet", null);
        setField(term5191, term5191.getClass(), "keySet", null);
        setField(term5191, term5191.getClass(), "values", null);
        setField(term5190, term5190.getClass(), "map", term5191);
        setField(term5190, term5190.getClass(), "table", null);
        setIntField(term5190, term5190.getClass(), "count", 0);
        setIntField(term5190, term5190.getClass(), "threshold", 0);
        setFloatField(term5190, term5190.getClass(), "loadFactor", 0.0F);
        setIntField(term5190, term5190.getClass(), "modCount", 0);
        setField(term5190, term5190.getClass(), "keySet", null);
        setField(term5190, term5190.getClass(), "entrySet", null);
        setField(term5190, term5190.getClass(), "values", null);
        setField(term5065, term5065.getClass(), "kafkaProperties", term5190);
        setField(term5065, term5065.getClass(), "authType", enum9);
        setField(term5065, term5065.getClass(), "streamDataType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5065, args);
    }

};



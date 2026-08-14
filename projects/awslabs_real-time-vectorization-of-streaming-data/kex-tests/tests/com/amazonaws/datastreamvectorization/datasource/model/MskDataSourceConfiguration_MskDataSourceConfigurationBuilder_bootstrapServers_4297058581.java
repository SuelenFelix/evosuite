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

public class MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_bootstrapServers_4297058581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_bootstrapServers_4297058581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14 = new ArrayList();
        ((ArrayList) term14).add("sjlJAEtRrb");
        ((ArrayList) term14).add("MuLcgQHgqz");
        ((ArrayList) term14).add("xxtlPwDYFs");
        ((ArrayList) term14).add("jJCZpVmanW");
        ((ArrayList) term14).add("EGtDIRbSSb");
        Class<? extends Object> term219 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasource.model.MskAuthType");
        Field term218 = ((Class) term219).getDeclaredField((String) "IAM");
        ((Field) term218).setAccessible(true);
        Object enum0 = ((Field) term218).get((Object) null);
        term1 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder"));
        Object term102 = newInstance(Class.forName("java.util.Properties"));
        Object term103 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1, term1.getClass(), "bootstrapServers", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "topicNames", term14);
        setField(term1, term1.getClass(), "topicPattern", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "groupId", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "startingOffset", null);
        setField(term102, term102.getClass(), "defaults", null);
        setField(term103, term103.getClass(), "table", null);
        setField(term103, term103.getClass(), "nextTable", null);
        setLongField(term103, term103.getClass(), "baseCount", 0L);
        setIntField(term103, term103.getClass(), "sizeCtl", 16);
        setIntField(term103, term103.getClass(), "transferIndex", 0);
        setIntField(term103, term103.getClass(), "cellsBusy", 0);
        setField(term103, term103.getClass(), "counterCells", null);
        setField(term103, term103.getClass(), "keySet", null);
        setField(term103, term103.getClass(), "values", null);
        setField(term103, term103.getClass(), "entrySet", null);
        setField(term103, term103.getClass(), "keySet", null);
        setField(term103, term103.getClass(), "values", null);
        setField(term102, term102.getClass(), "map", term103);
        setField(term102, term102.getClass(), "table", null);
        setIntField(term102, term102.getClass(), "count", 0);
        setIntField(term102, term102.getClass(), "threshold", 0);
        setFloatField(term102, term102.getClass(), "loadFactor", 0.0F);
        setIntField(term102, term102.getClass(), "modCount", 0);
        setField(term102, term102.getClass(), "keySet", null);
        setField(term102, term102.getClass(), "entrySet", null);
        setField(term102, term102.getClass(), "values", null);
        setField(term1, term1.getClass(), "kafkaProperties", term102);
        setField(term1, term1.getClass(), "authType", enum0);
        setField(term1, term1.getClass(), "streamDataType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        callMethod(klass, "bootstrapServers", argTypes, term1, args);
    }

};



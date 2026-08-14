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

public class MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_groupId_5575291424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1643;

    public MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_groupId_5575291424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1656 = new ArrayList();
        ((ArrayList) term1656).add("vrQLuWIDJX");
        ((ArrayList) term1656).add("flxyYxBRtu");
        ((ArrayList) term1656).add("OclPbYPkcH");
        ((ArrayList) term1656).add("IoAlmYsBwc");
        ((ArrayList) term1656).add("TEParAifyi");
        Class<? extends Object> term1854 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasource.model.MskAuthType");
        Field term1853 = ((Class) term1854).getDeclaredField((String) "IAM");
        ((Field) term1853).setAccessible(true);
        Object enum3 = ((Field) term1853).get((Object) null);
        term1643 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder"));
        Object term1744 = newInstance(Class.forName("java.util.Properties"));
        Object term1745 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1643, term1643.getClass(), "bootstrapServers", "BYqFIqCKAV");
        setField(term1643, term1643.getClass(), "topicNames", term1656);
        setField(term1643, term1643.getClass(), "topicPattern", "OWDIEULEFu");
        setField(term1643, term1643.getClass(), "groupId", "dWRymuLBtr");
        setField(term1643, term1643.getClass(), "startingOffset", null);
        setField(term1744, term1744.getClass(), "defaults", null);
        setField(term1745, term1745.getClass(), "table", null);
        setField(term1745, term1745.getClass(), "nextTable", null);
        setLongField(term1745, term1745.getClass(), "baseCount", 0L);
        setIntField(term1745, term1745.getClass(), "sizeCtl", 16);
        setIntField(term1745, term1745.getClass(), "transferIndex", 0);
        setIntField(term1745, term1745.getClass(), "cellsBusy", 0);
        setField(term1745, term1745.getClass(), "counterCells", null);
        setField(term1745, term1745.getClass(), "keySet", null);
        setField(term1745, term1745.getClass(), "values", null);
        setField(term1745, term1745.getClass(), "entrySet", null);
        setField(term1745, term1745.getClass(), "keySet", null);
        setField(term1745, term1745.getClass(), "values", null);
        setField(term1744, term1744.getClass(), "map", term1745);
        setField(term1744, term1744.getClass(), "table", null);
        setIntField(term1744, term1744.getClass(), "count", 0);
        setIntField(term1744, term1744.getClass(), "threshold", 0);
        setFloatField(term1744, term1744.getClass(), "loadFactor", 0.0F);
        setIntField(term1744, term1744.getClass(), "modCount", 0);
        setField(term1744, term1744.getClass(), "keySet", null);
        setField(term1744, term1744.getClass(), "entrySet", null);
        setField(term1744, term1744.getClass(), "values", null);
        setField(term1643, term1643.getClass(), "kafkaProperties", term1744);
        setField(term1643, term1643.getClass(), "authType", enum3);
        setField(term1643, term1643.getClass(), "streamDataType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AijpHYOFuy";
        callMethod(klass, "groupId", argTypes, term1643, args);
    }

};



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

public class MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_topicPattern_17008594273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1099;

    public MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_topicPattern_17008594273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1112 = new ArrayList();
        ((ArrayList) term1112).add("tbcdzjIfER");
        ((ArrayList) term1112).add("HyxfbSQYBe");
        ((ArrayList) term1112).add("pCTimMblYc");
        ((ArrayList) term1112).add("hNxWaHcfhY");
        Class<? extends Object> term1288 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasource.model.MskAuthType");
        Field term1287 = ((Class) term1288).getDeclaredField((String) "IAM");
        ((Field) term1287).setAccessible(true);
        Object enum2 = ((Field) term1287).get((Object) null);
        term1099 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder"));
        Object term1188 = newInstance(Class.forName("java.util.Properties"));
        Object term1189 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1099, term1099.getClass(), "bootstrapServers", "ZiaGIbnzTs");
        setField(term1099, term1099.getClass(), "topicNames", term1112);
        setField(term1099, term1099.getClass(), "topicPattern", "RkybSrpybU");
        setField(term1099, term1099.getClass(), "groupId", "xOEqzGAmDU");
        setField(term1099, term1099.getClass(), "startingOffset", null);
        setField(term1188, term1188.getClass(), "defaults", null);
        setField(term1189, term1189.getClass(), "table", null);
        setField(term1189, term1189.getClass(), "nextTable", null);
        setLongField(term1189, term1189.getClass(), "baseCount", 0L);
        setIntField(term1189, term1189.getClass(), "sizeCtl", 16);
        setIntField(term1189, term1189.getClass(), "transferIndex", 0);
        setIntField(term1189, term1189.getClass(), "cellsBusy", 0);
        setField(term1189, term1189.getClass(), "counterCells", null);
        setField(term1189, term1189.getClass(), "keySet", null);
        setField(term1189, term1189.getClass(), "values", null);
        setField(term1189, term1189.getClass(), "entrySet", null);
        setField(term1189, term1189.getClass(), "keySet", null);
        setField(term1189, term1189.getClass(), "values", null);
        setField(term1188, term1188.getClass(), "map", term1189);
        setField(term1188, term1188.getClass(), "table", null);
        setIntField(term1188, term1188.getClass(), "count", 0);
        setIntField(term1188, term1188.getClass(), "threshold", 0);
        setFloatField(term1188, term1188.getClass(), "loadFactor", 0.0F);
        setIntField(term1188, term1188.getClass(), "modCount", 0);
        setField(term1188, term1188.getClass(), "keySet", null);
        setField(term1188, term1188.getClass(), "entrySet", null);
        setField(term1188, term1188.getClass(), "values", null);
        setField(term1099, term1099.getClass(), "kafkaProperties", term1188);
        setField(term1099, term1099.getClass(), "authType", enum2);
        setField(term1099, term1099.getClass(), "streamDataType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eZFUvlxvGV";
        callMethod(klass, "topicPattern", argTypes, term1099, args);
    }

};



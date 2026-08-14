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
import java.util.LinkedList;

public class MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_topicNames_11531845082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574;
     Object term680;

    public MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_topicNames_11531845082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term587 = new ArrayList();
        ((ArrayList) term587).add("NRdvgJlhkX");
        ((ArrayList) term587).add("uuaPigETmJ");
        ((ArrayList) term587).add("MxlszYVzRf");
        ((ArrayList) term587).add("LQFpaHEwXR");
        Class<? extends Object> term754 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasource.model.MskAuthType");
        Field term753 = ((Class) term754).getDeclaredField((String) "IAM");
        ((Field) term753).setAccessible(true);
        Object enum1 = ((Field) term753).get((Object) null);
        term574 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder"));
        Object term663 = newInstance(Class.forName("java.util.Properties"));
        Object term664 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term574, term574.getClass(), "bootstrapServers", "RMFIsYGgne");
        setField(term574, term574.getClass(), "topicNames", term587);
        setField(term574, term574.getClass(), "topicPattern", "oVcInYnLWB");
        setField(term574, term574.getClass(), "groupId", "aJlieCFVtF");
        setField(term574, term574.getClass(), "startingOffset", null);
        setField(term663, term663.getClass(), "defaults", null);
        setField(term664, term664.getClass(), "table", null);
        setField(term664, term664.getClass(), "nextTable", null);
        setLongField(term664, term664.getClass(), "baseCount", 0L);
        setIntField(term664, term664.getClass(), "sizeCtl", 16);
        setIntField(term664, term664.getClass(), "transferIndex", 0);
        setIntField(term664, term664.getClass(), "cellsBusy", 0);
        setField(term664, term664.getClass(), "counterCells", null);
        setField(term664, term664.getClass(), "keySet", null);
        setField(term664, term664.getClass(), "values", null);
        setField(term664, term664.getClass(), "entrySet", null);
        setField(term664, term664.getClass(), "keySet", null);
        setField(term664, term664.getClass(), "values", null);
        setField(term663, term663.getClass(), "map", term664);
        setField(term663, term663.getClass(), "table", null);
        setIntField(term663, term663.getClass(), "count", 0);
        setIntField(term663, term663.getClass(), "threshold", 0);
        setFloatField(term663, term663.getClass(), "loadFactor", 0.0F);
        setIntField(term663, term663.getClass(), "modCount", 0);
        setField(term663, term663.getClass(), "keySet", null);
        setField(term663, term663.getClass(), "entrySet", null);
        setField(term663, term663.getClass(), "values", null);
        setField(term574, term574.getClass(), "kafkaProperties", term663);
        setField(term574, term574.getClass(), "authType", enum1);
        setField(term574, term574.getClass(), "streamDataType", null);
        term680 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term680;
        callMethod(klass, "topicNames", argTypes, term574, args);
    }

};


